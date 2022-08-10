package practice.io.ex11;

public class Exam0232test {

  public static class Score implements Cloneable {
    String name;

    @Override
    public Score clone() throws CloneNotSupportedException {
      return (Score) super.clone();
    }
  }

  public static void main(String[] args) throws Exception {

    Score obj = new Score();
    obj.name = "홍길동";

    System.out.println(obj instanceof Cloneable);

    Score copy = obj.clone();

    System.out.println(obj == copy);
    System.out.println(obj.name == copy.name);
    System.out.println(obj.name);
    System.out.println(copy.name);

  }

}