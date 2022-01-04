// 클래스 변수의 응용: 클래스 변수 활용 전
//
// 1) 손님,회원,관리자를 상수로 바꾸자
// 2) 손님,회원,관리자를 클래스 필드로 바꾸자
// 3) Member 클래스를 외부로 꺼내자
package practice.oop.ex03;

import static practice.oop.ex03.Member.GUEST;
import static practice.oop.ex03.Member.MANAGER;
import static practice.oop.ex03.Member.MEMBER;

public class Exam0160Test {


  public static void main(String[] args) {

    Member m1 = new Member();
    m1.id = "aaa";
    m1.password = "1111";
    m1.type = GUEST; // 손님

    Member m2 = new Member();
    m2.id = "bbb";
    m2.password = "1111";
    m2.type = MANAGER; // 관리자

    Member m3 = new Member();
    m3.id = "ccc";
    m3.password = "1111";
    m3.type = MEMBER; // 회원

    // 회원의 타입을 지정할 때 숫자를 이용하였다.
    // 그런데 소스 코드를 작성한 후 시간이 오래 지나면 숫자의 의미를 기억하기가 쉽지 않다.
    // 소스 코드를 작성한 사람도 숫자의 의미를 기억하기가 쉽지 않은데,
    // 남의 소스 코드를 유지보수하는 사람은 더더욱 숫자의 의미를 파악하기란 어렵다.
    // 주석이나 개발 문서를 자세히 살펴보지 않는 이상에는 숫자의 의미를 파악하기 쉽지 않다.
  }
}


