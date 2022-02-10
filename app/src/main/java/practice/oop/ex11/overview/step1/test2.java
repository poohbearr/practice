package practice.oop.ex11.overview.step1;

public class test2 {
  public static void main(String[] args) {

    MyStack list = new MyStack();
    list.push("서영범0");
    list.push("서영범1");
    list.push("서영범2");
    list.push("서영범3");
    list.push("서영범4");
    list.push("서영범5");

    while (list.size > 0) {
      System.out.println(list.pop());
    }
    System.out.println(list.size);
  }
}
