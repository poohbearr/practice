package practice.project_app1_client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientAppTest3 {

  public static void main(String[] args) throws Exception {
    System.out.println("[클라이언트]");

    Socket socket = new Socket("127.0.0.1", 5555);
    System.out.println("서버와 연결됨!");

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    out.println("SYB-TEST3");

    String response = in.nextLine();
    System.out.println(response);

    out.close();
    in.close();

    socket.close();
    System.out.println("서버 연결 종료!");
  }

}
