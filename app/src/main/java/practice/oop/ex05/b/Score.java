package practice.oop.ex05.b;

public class Score {

  int kor;
  int eng;
  int math;
  int sum;
  float aver;

  int music;
  int science;

  public void calculate() {
    this.sum = this.kor + this.eng + this.math + this.music + this.science;
    this.aver = this.sum / 5f;
  }
}
