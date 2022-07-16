package practice.io.ex02;

import java.io.FileOutputStream;

public class Exam0310Test {

  public static void main(String[] args) throws Exception {

    FileOutputStream out = new FileOutputStream("abc.data");

    byte[] bytes = {0x7a, 0x6b, 0x5c, 0x4d, 0x3e, 0x2f, 0x30};

    out.write(bytes, 1, 5);

    out.close();

    System.out.println("데이터 출력 완료!");
  }

}