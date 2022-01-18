package practice.io.ex04;

import java.io.FileOutputStream;

public class Exam0410Test {

  public static void main(String[] args) throws Exception {

    FileOutputStream out = new FileOutputStream("temp/test3.data");

    String str = "ABC마트";

    out.write(str.getBytes("UTF-8"));

    out.close();

    System.out.println("출력 완료!");
  }

}
