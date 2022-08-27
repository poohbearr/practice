package practice.oop.ex03;

public class Exam0430Test {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score() {
      System.out.println("Score()");
    }

    Score(String name) {
      System.out.println("Score(String)");
      this.name = name;
    }

    Score(String name, int kor, int eng, int math) {
      System.out.println("Score(String, int, int, int)");
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.compute();
    }

    void compute() {
      this.sum = this.kor + this.eng + this.math;
      this.aver = this.sum / 3f;
    }
  }

  public static void main(String[] args) {

    Score c1 = new Score();
    Score c2 = new Score("서영범");
    Score c3 = new Score("서영범", 90, 76, 69);

    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        c1.name, c1.kor, c1.eng, c1.math, c1.sum, c1.aver);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        c2.name, c2.kor, c2.eng, c2.math, c2.sum, c2.aver);
    System.out.printf("%s, %d, %d, %d, %d, %.1f\n",
        c3.name, c3.kor, c3.eng, c3.math, c3.sum, c3.aver);

  }

}