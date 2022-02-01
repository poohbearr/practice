package practice.project_app1_client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientAppTest {

  public static void main(String[] args) throws Exception {

    Scanner keyScan = new Scanner(System.in);

    while (true) {
      System.out.println("요청(형식: 서버주소/연산자/값1/값2)? ");
      System.out.print("=> ");
      String input = keyScan.nextLine();

      if (input.equals("exit") || input.equals("quit")) {
        break;
      }

      int slashPos = input.indexOf("/");
      String serverAddress = input.substring(0, slashPos);
      String queryString = input.substring(slashPos + 1);

      Socket socket = new Socket(serverAddress, 8888);
      System.out.println("서버에 연결");

      PrintStream out = new PrintStream(socket.getOutputStream());
      Scanner in = new Scanner(socket.getInputStream());

      if (queryString.startsWith("/")) {
        queryString = queryString.replaceFirst("/", "%2f");
      }

      out.println(queryString);

      String response = in.nextLine();
      System.out.println("==>" + response);

      out.close();
      in.close();

      socket.close();
      System.out.println("클라이언트 종료!");
    }
    keyScan.close();
  }

}
