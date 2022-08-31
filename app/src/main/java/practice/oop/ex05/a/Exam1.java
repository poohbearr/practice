package practice.oop.ex05.a;

public class Exam1 {

  public static void main(String[] args) {

    Score c1 = new Score();
    c1.kor = 80;
    c1.eng = 90;
    c1.math = 100;
    c1.calculate();

    System.out.printf("%d, %d, %d, %d, %.1f", c1.kor, c1.eng, c1.math, c1.sum, c1.aver);
  }
}