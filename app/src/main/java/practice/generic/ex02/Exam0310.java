package practice.generic.ex02;

import java.util.HashMap;

public class Exam0310 {

  public static void main(String[] args) {
    HashMap map = new HashMap();
    map.put("aaa", "문자열");
    map.put(new Integer(100), new String("서영범"));

    System.out.println(map.get("aaa"));
    System.out.println(map.get(100));
    System.out.println("---------------------");

    HashMap<Object, Object> map2 = new HashMap<>();
    map2.put("aaa", "문자열2");
    map2.put(new Integer(50), new String("서영범2"));

    System.out.println(map2.get("aaa"));
    System.out.println(map2.get(50));
    System.out.println("---------------------");

    HashMap<Integer, String> map3 = new HashMap<>();
    map3.put(new Integer(100), new String("서영범3"));

    String name = map3.get(100);
    System.out.println(map3.get(100));
    System.out.println(name);
  }

}
