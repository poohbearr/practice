package practice.oop.ex11.c;

class A {

  class X {

    int a;
    void m1() {}

  }
}

public class Exam0111 {
  public static void main(String[] args) {

    A outer = new A();
    A.X obj = outer.new X();

    A.X obj2 = new A().new X();
  }

}
