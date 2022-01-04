package practice.oop.ex03;

import java.util.Scanner;

public class Exam0320Test {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    void calculate() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {
    Scanner keyScan = new Scanner(System.in);

    Score c1 = new Score();
    Score c2 = new Score();

    System.out.println("이렇게 입력하세요=> 홍길동 100 100 100");
    c1.name = keyScan.next();
    c1.kor = keyScan.nextInt();
    c1.eng = keyScan.nextInt();
    c1.math = keyScan.nextInt();

    System.out.println("이렇게 입력하세요=> 홍길동 100 100 100");
    c2.name = keyScan.next();
    c2.kor = keyScan.nextInt();
    c2.eng = keyScan.nextInt();
    c2.math = keyScan.nextInt();

    c1.calculate();
    c2.calculate();

    System.out.printf("이름: %s, %d, %d, %d, %d, %.1f\n",
        c1.name, c1.kor, c1.eng, c1.math, c1.sum, c1.aver);
    System.out.printf("이름: %s, %d, %d, %d, %d, %.1f\n",
        c2.name, c2.kor, c2.eng, c2.math, c2.sum, c2.aver);
  }

}
