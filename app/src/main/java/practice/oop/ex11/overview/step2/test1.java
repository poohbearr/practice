package practice.oop.ex11.overview.step2;

public class test1 {
  public static void main(String[] args) {

    MyList list = new MyList();
    list.add("서영범0");
    list.add("서영범1");
    list.add("서영범2");
    list.add("서영범3");
    list.add("서영범4");
    list.add("서영범5");

    ListIterator iterator = new ListIterator(list);
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
