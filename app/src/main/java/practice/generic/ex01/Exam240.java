package practice.generic.ex01;

public class Exam240 {

  static class Box<T> {
    T value;

    void set(T value) {
      this.value = value;
    }

    T get() {
      return this.value;
    }
  }

  public static void main(String[] args) {

    Box<String> b1 = new Box<>();
    Box<Integer> b2 = new Box<>();

    b1.set("Hello");
    b2.set(100);

    String s = b1.get();
    Integer i = b2.get();

    System.out.println(s);
    System.out.println(i);
  }

}
