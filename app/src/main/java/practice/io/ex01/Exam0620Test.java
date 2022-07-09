package practice.io.ex01;

import java.io.File;
import java.io.FileFilter;
import java.sql.Date;

public class Exam0620Test {

  public static void main(String[] args) throws Exception {

    class JavaFilter implements FileFilter {

      @Override
      public boolean accept(File file) {

        if (file.isFile() && file.getName().endsWith(".java")) {
          return true;
        }
        return false;
      }
    }

    File dir = new File(".");

    JavaFilter javaFilter = new JavaFilter();

    File[] files = dir.listFiles(javaFilter);

    for (File file : files) {
      System.out.printf("%s %s %d %s\n",
          file.isDirectory() ? "d" : "-",
              new Date(file.lastModified()),
              file.length(),
              file.getName());
    }
  }

}