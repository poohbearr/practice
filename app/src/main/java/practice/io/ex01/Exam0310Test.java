package practice.io.ex01;

import java.io.File;

public class Exam0310Test {

  public static void main(String[] args) {

    File dir = new File("temp1");

    if (dir.mkdir()) {
      System.out.println("디렉토리를 생성했습니다.");
    } else {
      System.out.println("디렉토리를 생성할 수 없습니다.");
    }
  }

}