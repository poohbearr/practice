package practice.io.ex01;

import java.io.File;
import java.io.FileFilter;

public class Exam0730Test {

  public static void main(String[] args) throws Exception {
    File dir = new File("bin/main");

    System.out.println(dir.getCanonicalPath());

    printClasses(dir);
  }

  static void printClasses(File dir) {

    File[] files = dir.listFiles(new FileFilter() {

      @Override
      public boolean accept(File pathname) {
        return pathname.isDirectory() ||
            (pathname.isFile() && pathname.getName().endsWith(".class"));
      }
    });

    for (File file : files) {
      if (file.isDirectory()) {
        printClasses(file);
      } else {
        System.out.printf("%s\n", file.getName());
      }
    }
  }

}
