package practice.oop.ex02.util;
public class Calculator {

  int result;

  public void plus(int a) {
    this.result += a;
  }

  public void minus(int a) {
    this.result -= a;
  }

  public void multiple(int a) {
    this.result *= a;
  }
  public void divide(int a) {
    this.result /= a;
  }

  public int getResult() {
    return this.result;
  }

}