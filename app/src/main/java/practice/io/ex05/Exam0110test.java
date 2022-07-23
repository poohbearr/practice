package practice.io.ex05;

import java.io.FileOutputStream;

public class Exam0110test {

  public static void main(String[] args) throws Exception {

    FileOutputStream out = new FileOutputStream("temp/test4.data");

    Member member = new Member();
    member.name = "서영범";
    member.age = 29;
    member.gender = true;

    byte[] bytes = member.name.getBytes("UTF-8");
    out.write(bytes.length);
    out.write(bytes);

    out.write(member.age >> 24);
    out.write(member.age >> 16);
    out.write(member.age >> 8);
    out.write(member.age);

    if (member.gender) {
      out.write(1);
    } else {
      out.write(0);
    }

    out.close();
    System.out.println("출력!");
  }

}