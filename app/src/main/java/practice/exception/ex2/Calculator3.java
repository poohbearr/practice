package practice.exception.ex2;

public class Calculator3 {

  public static int compute(String op, int a, int b) {
    switch(op) {
      case "+" : return a + b;
      case "-" : return a - b;
      case "*" : return a * b;
      case "/" : return a / b;
      default :
        throw new RuntimeException("오류 발생");
    }
  }
}
