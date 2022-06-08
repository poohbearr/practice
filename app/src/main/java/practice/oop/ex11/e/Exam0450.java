package practice.oop.ex11.e;

class My {
  static void m1() {
    System.out.println("method reference");
  }

  void m2() {
    System.out.println("method reference2");
  }
}

public class Exam0450 {

  interface A {
    void print();
  }

  static A create1() {
    class X implements A {
      @Override
      public void print() {
        System.out.println("local class");
      }
    }
    return new X();
  }

  static A create2() {
    return new A() {
      @Override
      public void print() {
        System.out.println("anonymous class");
      }
    };
  }

  static A create3() {
    return () -> {System.out.println("lambda");};
  }

  static A create4() {
    return My::m1;
  }

  static A create5() {
    return new My()::m2;
  }

  public static void main(String[] args) {
    A obj = create1();
    obj.print();

    A obj2 = create2();
    obj2.print();

    A obj3 = create3();
    obj3.print();

    A obj4 = create4();
    obj4.print();

    A obj5 = create5();
    obj5.print();

  }
}
