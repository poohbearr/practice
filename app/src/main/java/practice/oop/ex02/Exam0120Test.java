package practice.oop.ex02;

public class Exam0120Test {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    static void calculator(Score score) {
      score.sum = score.kor + score.eng + score.math;
      score.aver = score.sum / 3f;
    }
  }


  public static void main(String[] args) {

    Score score = new Score();

    score.name = "서영범";
    score.kor = 90;
    score.eng = 80;
    score.math = 85;

    Score.calculator(score);

    System.out.printf("%s: %d %d %d %d %.1f",
        score.name, score.kor, score.eng, score.math, score.sum, score.aver);
  }



}
