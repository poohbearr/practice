package practice.io.ex01;

import java.io.File;

public class Exam0431Test {

  public static void main(String[] args) throws Exception {
    // 존재하지 않는 폴더에 파일 만들기

    File file = new File("temp/b/test.txt");

    File dir = file.getParentFile();
    System.out.println(dir.getCanonicalPath());

    // 먼저 디렉토리 생성
    if (dir.mkdirs()) {
      System.out.println("디렉토리 생성!");
    } else {
      System.out.println("디렉토리 생성 불가!");
    }

    // 그리고 파일 생성
    if (file.createNewFile()) {
      System.out.println("파일 생성!");
    } else {
      System.out.println("파일 생성 불가!");
    }

  }

}