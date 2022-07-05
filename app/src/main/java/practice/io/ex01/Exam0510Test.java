package practice.io.ex01;

import java.io.File;

public class Exam0510Test {

  public static void main(String[] args) throws Exception {
    // 디렉토리에 들어있는 내용물 파악하기

    File dir = new File("."); // 현재 폴더

    String[] names = dir.list();

    for (String name : names) {
      System.out.println(name);
    }
  }

}