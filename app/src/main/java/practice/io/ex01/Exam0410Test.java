package practice.io.ex01;

import java.io.File;

public class Exam0410Test {

  public static void main(String[] args) throws Exception {
    // 파일 생성
    File file = new File("temp/a/abc.txt");

    if (file.createNewFile()) {
      System.out.println("파일 생성!");
    } else {
      System.out.println("파일 생성 불가!");
    }
  }

}
