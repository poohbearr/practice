package practice.generic.ex01;

import java.util.Date;

public class Exam0130 {

  public static <What> What echo(What obj) {
    return obj;
  }

  public static void main(String[] args) {

    Object obj1 = echo(new String("aaa"));

    String obj2 = echo(new String("bbb"));

    Integer obj3 = echo(new Integer(100));

    Date obj4 = echo(new Date());
  }

}
