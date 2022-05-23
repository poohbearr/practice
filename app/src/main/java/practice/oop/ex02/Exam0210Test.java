package practice.oop.ex02;

import practice.oop.ex02.util.Calculator;

// 1) 메서드를 클래스에 묶자
// 2) result 변수를 클래스의 스태틱 변수로 바꾸자
// 3) result 변수를 클래스의 인스턴스 변수로 바꾸자
// 4) this 내장 변수를 이용하자
// 5) class를 외부 파일로 빼자
public class Exam0210Test {

  public static void main(String[] args) {

    Calculator cal1 = new Calculator();
    Calculator cal2 = new Calculator();

    cal1.plus(2);
    cal2.plus(2);
    cal1.plus(3);
    cal2.plus(2);
    cal1.minus(1);
    cal2.minus(1);
    cal1.multiple(10);
    cal2.multiple(10);
    cal1.divide(2);
    cal2.divide(2);

    System.out.println("result: " + cal1.getResult());
    System.out.println("result: " + cal2.getResult());

  }


}
