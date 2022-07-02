package practice.io.ex01;

import java.io.File;

public class Exam0322Test {

  public static void main(String[] args) {
    // 존재하지 않는 폴더의 하위 폴더 생성
    File dir = new File("temp2/a/b");

    if (dir.mkdirs()) {
      System.out.println("디렉토리 생성!");
    } else {
      System.out.println("디렉토리 생성 불가!");
    }

  }

}