package practice.project_app10_server;

import java.io.PrintStream;
import java.net.Socket;
import java.net.URLDecoder;
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

      String requestLine = in.nextLine(); // ex) "GET /+/100/200 HTTP/1.1"
      System.out.println(requestLine);

      while (true) {
        String str = in.nextLine();
        if (str.length() == 0) {
          break;
        }
      }

      String requestUri = requestLine.split(" ")[1]; // ex) "/+/100/200"
      String[] values = requestUri.split("/"); // ex) {"", "+", "100", "200"}

      if (values.length == 4) {
        String op = URLDecoder.decode(values[1]);
        int a = Integer.parseInt(values[2]);
        int b = Integer.parseInt(values[3]);
        System.out.printf("%s, %d, %d \n", op, a, b);

        String response = null;

        switch(op) {
          case "+": 
            response = String.format("%d + %d = %d", a, b, (a + b));
            break;
          case "-": 
            response = String.format("%d - %d = %d", a, b, (a - b));
            break;
          case "*": 
            response = String.format("%d * %d = %d", a, b, (a * b));
            break;
          case "/": 
            response = String.format("%d / %d = %d", a, b, (a / b));
            break;
          default:
            response = "서영범: 지원하지 않는 연산자입니다.";
        }
        writeResponse(out, response);

      } else {
        writeResponse(out, "요청 형식이 올바르지 않습니다.");
      }

      socket.close();
      System.out.println("클라이언트 종료!");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  private void writeResponse(PrintStream out, String messageBody) {
    out.println("HTTP/1.1 200 OK");
    out.println("Content-Type: text/plain; charset=UTF-8");
    out.println();
    out.print(messageBody);
    out.flush();
  }
}
