package practice.io.ex08;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Exam0120test {

  public static void main(String[] args) throws Exception {

    BufferedInputStream in = new BufferedInputStream(new FileInputStream("temp/jls11.pdf"));
    BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("temp/jls11_3.pdf"));

    int b;
    long start = System.currentTimeMillis();

    while ((b = in.read()) != -1) {
      out.write(b);
    }
    out.flush();

    long end = System.currentTimeMillis();

    System.out.println(end-start);

    in.close();
    out.close();
  }

}