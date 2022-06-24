package practice.basic.ex01;

public class Exam0174test {

  static class Engine implements Cloneable {
    int cc;
    int valve;


    public Engine(int cc, int valve) {
      this.cc = cc;
      this.valve = valve;
    }

    @Override
    public String toString() {
      return "Engine [cc=" + cc + ", valve=" + valve + "]";
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
      return (Engine) super.clone();
    }

  }

  static class Car implements Cloneable {
    String maker;
    String name;
    Engine engine;

    public Car(String maker, String name, Engine engine) {
      this.maker = maker;
      this.name = name;
      this.engine = engine;
    }

    @Override
    public String toString() {
      return "Car [maker=" + maker + ", name=" + name + ", engine=" + engine + "]";
    }

    @Override
    protected Car clone() throws CloneNotSupportedException {
      Car copy = (Car) super.clone();
      copy.engine = this.engine.clone();
      return copy;
    }
  }

  public static void main(String[] args) throws Exception {
    Engine engine = new Engine(3030, 10);
    Car car1 = new Car("비트자동차", "비트비트", engine);

    Car car2 = car1.clone();

    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car1 == car2);
    System.out.println(car1.engine == car2.engine);

    System.out.println(car1.engine);
    System.out.println(car2.engine);

    car1.engine.cc = 300;
    System.out.println(car1.engine);
    System.out.println(car2.engine);

  }

}