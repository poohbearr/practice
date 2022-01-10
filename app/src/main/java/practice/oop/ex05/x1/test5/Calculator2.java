package practice.oop.ex05.x1.test5;

import practice.oop.ex05.x1.test1.Calculator;

public class Calculator2 {

  // 위임!
  Calculator origin = new Calculator();

  public void plus(int value) {
    origin.plus(value);
  }

  public void minus(int value) {
    origin.minus(value);
  }

  public void multiple(int value) {
    origin.result *= value;
  }

  public int getResult() {
    return origin.result;
  }
}
