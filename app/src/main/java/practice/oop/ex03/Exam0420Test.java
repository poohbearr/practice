package practice.oop.ex03;

public class Exam0420Test {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float avg;

    Score(String name, int kor, int eng, int math) {
      System.out.println("이름 국어 영어 수학");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }

    void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.avg = this.sum / 3f;
    }
  }

  public static void main(String[] args) {

    Score c1 = new Score("김구", 100, 100, 90);
    Score c2 = new Score("서영범", 60, 75, 94);

    System.out.printf("%s: %d, %d, %d, %d, %.2f\n",
        c1.name, c1.kor, c1.eng, c1.math, c1.sum, c1.avg);
    System.out.printf("%s: %d, %d, %d, %d, %.2f\n",
        c2.name, c2.kor, c2.eng, c2.math, c2.sum, c2.avg);

  }
}
