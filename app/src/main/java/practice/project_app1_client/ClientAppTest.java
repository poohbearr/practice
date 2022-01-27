package practice.project_app1_client;

import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientAppTest {

  public static void main(String[] args) throws Exception {

    Socket socket = new Socket("127.0.0.1", 8888);
    System.out.println("서버와 연결됨!");

    PrintStream out = new PrintStream(socket.getOutputStream());
    Scanner in = new Scanner(socket.getInputStream());

    out.println("서영범Test");

    String response = in.nextLine();
    System.out.println("==> " + response);

    out.close();
    in.close();

    socket.close();
    System.out.println("서버 연결 종료!");

  }

}
