package practice.oop.ex11.overview.step2;

public class test3 {
  public static void main(String[] args) {

    MyQueue list = new MyQueue();
    list.offer("서영범0");
    list.offer("서영범1");
    list.offer("서영범2");
    list.offer("서영범3");
    list.offer("서영범4");
    list.offer("서영범5");

    QueueIterator iterator = new QueueIterator(list);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
