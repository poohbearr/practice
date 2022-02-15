package practice.generic.ex01;

public class Exam0310 {

  static class A<X, Y> {
    X v1;
    Y v2;
  }

  public static void main(String[] args) {

    A<String, Integer> obj = new A<>();

    obj.v1 = new String("Hello");
    obj.v2 = Integer.valueOf(100);
  }

}
