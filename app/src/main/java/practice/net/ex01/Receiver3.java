package practice.net.ex01;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Receiver3 {

  public static void main(String[] args) throws Exception {
    Scanner keyScan = new Scanner(System.in);

    ServerSocket serverSocket = new ServerSocket(8888);

    Socket socket = serverSocket.accept();

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    while (true) {
      String str = in.nextLine();
      System.out.println(str);

      System.out.println("입력>");
      String input = keyScan.nextLine();
      out.println(input);

      if (str.equals("quit")) {
        break;
      }
    }
    out.close();
    in.close();

    socket.close();
    serverSocket.close();

    keyScan.close();
  }

}
