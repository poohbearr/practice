package practice.io.ex05;

import java.io.FileInputStream;

public class Exam0120test {

  public static void main(String[] args) throws Exception {

    FileInputStream in = new FileInputStream("temp/test4.data");

    Member member = new Member();

    int size = in.read();
    byte[] buf = new byte[size];
    in.read(buf);
    member.name = new String(buf, "UTF-8");

    member.age = in.read() << 24;
    member.age += in.read() << 16;
    member.age += in.read() << 8;
    member.age += in.read();

    if (in.read() == 1) {
      member.gender = true;
    } else {
      member.gender = false;
    }

    in.close();

    System.out.printf("%s",member);
  }

}