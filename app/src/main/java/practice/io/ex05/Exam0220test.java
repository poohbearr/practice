package practice.io.ex05;

public class Exam0220test {

  public static void main(String[] args) throws Exception {
    DataFileInputStream in = new DataFileInputStream("temp/test4.data");

    Member member = new Member();

    member.name = in.readUTF();

    member.age = in.readInt();

    member.gender = in.readBoolean();

    in.close();

    System.out.printf("%s",member);

  }

}
