package practice.oop.ex11.e;

abstract class A {
  void print() {};
}

public class Exam0121 {

  public static void main(String[] args) {

    A obj = new A() {
      @Override
      void print() {
        System.out.println("print!!!");
      }
    };
    obj.print();

    new A() {
      @Override
      void print() {
        System.out.println("print!!!");
      }
    }.print();
  }

}
