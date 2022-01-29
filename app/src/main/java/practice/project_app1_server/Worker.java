package practice.project_app1_server;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Worker extends Thread {

  Socket socket;

  public Worker(Socket socket) {
    this.socket = socket;
  }

  @Override
  public void run() {
    try {
      Scanner in = new Scanner(socket.getInputStream());
      PrintStream out = new PrintStream(socket.getOutputStream());

      String queryString = in.nextLine();
      String[] values = queryString.split("/");

      if (values.length != 3) {
        System.out.println("서영범: 계산식이 올바르지 않습니다.");

      } else {
        String op = values[0];

        if (op.equals("%2f")) {
          op = "/";
        }
        int a = Integer.parseInt(values[1]);
        int b = Integer.parseInt(values[2]);
        int result = 0;

        switch(op) {
          case "+": 
            result = a + b;
            out.printf("%d %s %d = %d", a, op, b, result);
            break;
          case "-": 
            result = a - b;
            out.printf("%d %s %d = %d", a, op, b, result);
            break;
          case "*": 
            result = a * b;
            out.printf("%d %s %d = %d", a, op, b, result);
            break;
          case "/": 
            result = a / b;
            out.printf("%d %s %d = %d", a, op, b, result);
            break;
        }
      }

      socket.close();
      System.out.println("클라이언트 종료!");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
