package practice.oop.ex07.a;

public class Exam05test {
  public static void main(String[] args) {

    Letter l = new loveLetter();
    l.setContent("hhh");
    l.print();
  }
}

abstract class Letter{

  String content;

  public void setContent(String content) {
    this.content = content;
  }

  public void print() {
    this.printHeader();
    System.out.println(this.content);
    System.out.println();
    System.out.println(this.getSign());
    System.out.println();
    this.printFooter();
  }

  public abstract void printHeader();
  public abstract void printFooter();
  public abstract String getSign();
}

class loveLetter extends Letter{
  @Override
  public void printHeader() {
    System.out.println("Hi");
  }

  @Override
  public String getSign() {
    return "Hello";
  }

  @Override
  public void printFooter() {
    System.out.println("Bye");
  }
}



