package practice.oop.ex11.overview.step5;

public class test1 {
  public static void main(String[] args) {

    MyList list = new MyList();
    list.add("서영범0");
    list.add("서영범1");
    list.add("서영범2");
    list.add("서영범3");
    list.add("서영범4");
    list.add("서영범5");

    Iterator iterator = list.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
