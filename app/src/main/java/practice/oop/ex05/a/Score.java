package practice.oop.ex05.a;

public class Score {

  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  public void calculate() {
    this.sum = this.kor + this.eng + this.math;
    this.aver = this.sum / 3f;
  }
}
