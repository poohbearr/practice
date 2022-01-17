package practice.io.ex01;

import java.io.File;

public class Exam0710Test {

  public static void main(String[] args) throws Exception {

    File dir = new File(".");
    System.out.println(dir.getCanonicalPath());

    printList(dir, 1);
  }

  public static void printList(File dir, int Level) {
    File[] files = dir.listFiles();

    for (File file : files) {
      printIndent(Level);

      if (file.isDirectory() && !file.isHidden()) {
        System.out.println(file.getName() + "/");
        printList(file, Level + 1);
      } else if(file.isFile()) {
        System.out.println(file.getName());
      }
    }
  }

  public static void printIndent(int level) {
    for (int i = 0; i < level; i++) {
      System.out.print("  ");
    }

  }

}
