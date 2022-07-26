package practice.io.ex05;

public class Exam0210test {

  public static void main(String[] args) throws Exception {

    DataFileOutputStream out = new DataFileOutputStream("temp/test4_2.data");

    Member member = new Member();
    member.name = "서영범";
    member.age = 29;
    member.gender = true;

    out.writeUTF(member.name);

    out.writeInt(member.age);

    out.writeBoolean(member.gender);

    out.close();

    System.out.println("출력!");
  }

}