package practice.project_app1_server;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerAppTest2 {

  public static void main(String[] args) throws Exception {
    System.out.println("[서버]");

    ServerSocket serverSocket = new ServerSocket(2525);
    System.out.println("클라이언트와 연결을 기다림!");

    Socket socket = serverSocket.accept();
    System.out.println("클라이언트와 연결됨!");

    Scanner in = new Scanner(socket.getInputStream());
    PrintStream out = new PrintStream(socket.getOutputStream());

    String request = in.nextLine();
    System.out.println("이름: " + request);

    out.println(request + "님 반갑습니다!");

    socket.close();
    System.out.println("클라이언트와 연결 종료!");

    serverSocket.close();
    System.out.println("서버 종료!");
  }

}
