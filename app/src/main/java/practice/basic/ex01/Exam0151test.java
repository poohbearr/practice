package practice.basic.ex01;

import java.util.HashSet;
import java.util.Objects;

public class Exam0151test {

  public static class Student {
    String name;
    int age;
    boolean working;

    public Student(String name, int age, boolean working) {
      this.name = name;
      this.age = age;
      this.working = working;
    }

    @Override
    public int hashCode() {
      return Objects.hash(age, name, working);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Student other = (Student) obj;
      return age == other.age && Objects.equals(name, other.name) && working == other.working;
    }

  }

  public static void main(String[] args) {

    Student s1 = new Student("홍길동", 27, true);
    Student s2 = new Student("홍길동", 27, true);
    Student s3 = new Student("홍길", 28, false);
    Student s4 = new Student("홍동", 29, true);

    System.out.println(s1.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());

    HashSet<Student> set = new HashSet<Student>();

    set.add(s1);
    set.add(s2);
    set.add(s3);
    set.add(s4);

    Object[] list = set.toArray();

    for (Object obj : list) {
      Student sss = (Student) obj;
      System.out.printf("%s, %d, %s\n", sss.name, sss.age, sss.working ? "재직중" : "실업중");
    }


  }

}
