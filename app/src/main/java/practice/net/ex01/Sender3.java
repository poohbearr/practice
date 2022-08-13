package practice.net.ex01;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender3 {

  public static void main(String[] args) throws Exception {

    Scanner keyScan = new Scanner(System.in);

    Socket socket = new Socket("localhost", 8888);

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    while (true) {
      System.out.println("입력>");
      String input = keyScan.nextLine();
      out.println(input);

      String str = in.nextLine();
      System.out.println(str);

      if (input.equals("quit")) {
        break;
      }
    }
  }

}