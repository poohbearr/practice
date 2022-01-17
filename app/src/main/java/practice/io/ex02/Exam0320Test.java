package practice.io.ex02;

import java.io.FileInputStream;

public class Exam0320Test {

  public static void main(String[] args) throws Exception {

    FileInputStream in = new FileInputStream("abc.data");

    byte[] buf = new byte[100];

    int b = in.read(buf, 5, 30);

    in.close();

    System.out.printf("읽은 바이트 개수: %d\n", b);

    for (int i = 0; i < 100; i++) {
      System.out.printf("%d: %x\n", i, buf[i]);

    }
  }

}
