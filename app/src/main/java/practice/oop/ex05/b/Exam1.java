package practice.oop.ex05.b;

public class Exam1 {

  public static void main(String[] args) {

    Score c1 = new Score();
    c1.kor = 80;
    c1.eng = 90;
    c1.math = 100;
    c1.music = 75;
    c1.science = 83;
    c1.calculate();

    System.out.printf("%d, %d, %d, %d, %d, %d %.1f", c1.kor, c1.eng, c1.math, c1.music, c1.science, c1.sum, c1.aver);
  }
}
