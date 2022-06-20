package practice.project_app10_server;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerAppTest {

  public static void main(String[] args) throws Exception {

    ServerSocket serverSocket = new ServerSocket(8888);
    System.out.println("클라이언트 응답 기다림!");

    while (true) {
      Socket socket = serverSocket.accept();
      System.out.println("클라이언트 연결!");

      Worker worker = new Worker(socket);
      worker.start();

    }

  }

}
