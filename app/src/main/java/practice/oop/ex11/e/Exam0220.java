package practice.oop.ex11.e;

public class Exam0220 {

  static class A {
    public A() {
      System.out.println("super constructor");
    }
  }

  public static void main(String[] args) {

    A obj = new A() {
      {
        System.out.println("constructor");
      }
    };

  }

}
