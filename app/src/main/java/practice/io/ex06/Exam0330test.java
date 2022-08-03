package practice.io.ex06;

public class Exam0330test {

  public static void main(String[] args) throws Exception {

    BufferedFileInputStream in = new BufferedFileInputStream("temp/jls11.pdf");
    BufferedFileOutputStream out = new BufferedFileOutputStream("temp/jls11_4.pdf");

    int b;
    int count = 0;

    long start = System.currentTimeMillis();

    while ((b = in.read()) != -1) {
      out.write(b);
      count++;
    }

    long end = System.currentTimeMillis();

    System.out.println(end - start);
    System.out.println(count);

    in.close();
    out.close();
  }

}