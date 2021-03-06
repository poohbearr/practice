package practice.io.ex01;

import java.io.File;
import java.io.FilenameFilter;

public class Exam0611Test {

  public static void main(String[] args) throws Exception {

    class JavaFilter implements FilenameFilter {
      @Override
      public boolean accept(File dir, String name) {

        File file = new File(dir, name);

        if (file.isFile() && name.endsWith(".java")) {
          return true;
        }
        return false;
      }
    }

    File dir = new File(".");

    JavaFilter javaFilter = new JavaFilter();

    String[] names = dir.list(javaFilter);

    for (String name : names) {
      System.out.println(name);
    }
  }

}