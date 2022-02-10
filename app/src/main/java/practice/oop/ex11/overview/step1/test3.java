package practice.oop.ex11.overview.step1;

public class test3 {
  public static void main(String[] args) {

    MyQueue list = new MyQueue();
    list.offer("서영범0");
    list.offer("서영범1");
    list.offer("서영범2");
    list.offer("서영범3");
    list.offer("서영범4");
    list.offer("서영범5");

    while (list.size > 0) {
      System.out.println(list.poll());
    }
    System.out.println(list.size);
  }
}
