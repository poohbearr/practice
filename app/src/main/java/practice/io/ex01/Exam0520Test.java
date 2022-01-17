package practice.io.ex01;

import java.io.File;
import java.sql.Date;

public class Exam0520Test {

  public static void main(String[] args) throws Exception {
    // File 객체에 정보를 담아서 알아내기

    File dir = new File(".");

    File[] names = dir.listFiles();

    for (File name : names) {
      System.out.printf("%s   %s %10d   %s\n",
          name.isDirectory() ? "d" : "-",
              new Date(name.lastModified()),
              name.length(),
              name.getName());
    }
  }

}
