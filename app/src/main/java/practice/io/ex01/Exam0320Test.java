package practice.io.ex01;

import java.io.File;

public class Exam0320Test {

  public static void main(String[] args) {
    // 하위 디렉토리 만들기
    File dir = new File("temp/a");

    if (dir.mkdir()) {
      System.out.println("디렉토리 생성!");
    } else {
      System.out.println("디렉토리 생성 불가!");
    }
  }

}