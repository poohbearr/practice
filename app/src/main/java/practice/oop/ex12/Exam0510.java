package practice.oop.ex12;

public class Exam0510 {

  static class MyCalculator {
    static int plus(int a, int b) {return a + b;}
    static int minus(int a, int b) {return a - b;}
    static int multi(int a, int b) {return a * b;}
    static int divide(int a, int b) {return a / b;}
  }

  interface Calculator {
    int compute(int a, int b);
  }

  public static void main(String[] args) {

    Calculator c1 = new Calculator() {
      @Override
      public int compute(int a, int b) {
        return a + b;
      }
    };

    Calculator c2 = (a, b) -> a + b;

    Calculator c3 = MyCalculator::plus;
    Calculator c4 = MyCalculator::minus;
    Calculator c5 = MyCalculator::multi;
    Calculator c6 = MyCalculator::divide;
    

    System.out.println(c1.compute(1, 2));
    System.out.println(c2.compute(1, 2));
    System.out.println(c3.compute(1, 2));
    System.out.println(c4.compute(1, 2));
    System.out.println(c5.compute(1, 5));
    System.out.println(c6.compute(20, 2));
  }

}
