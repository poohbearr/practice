package practice.oop.ex06.a;

public class Exam0521Test {

  public static void main(String[] args) {
    Vehicle[] arr = new Vehicle[] {
        new Car("car", 10, 100, 16),
        new Bike("bike", 15, true),
        new Sedan("sedan", 100, 50, 12, true, true),
        new Truck("truck", 100, 42, 214, 45, true)};

    for (Vehicle p : arr) {
      printCar(p);
    }
  }

  public static void printCar(Vehicle v) {
    System.out.printf("모델: %s\n", v.model);
    System.out.printf("수용인원: %s\n", v.capacity);

    if (v instanceof Car) {
      Car c = (Car) v;
      System.out.printf("CC: %d\n", c.cc);
      System.out.printf("Valve: %d\n", c.valve);

      if (v instanceof Sedan) {
        Sedan s = (Sedan) v;
        System.out.printf("썬루프: %b\n", s.sunroof);
        System.out.printf("오토: %b\n", s.auto);
      }

      else if (v instanceof Truck) {
        Truck t = (Truck) v;
        System.out.printf("무게: %f\n", t.ton);
        System.out.printf("덤프: %b\n", t.dump);
      }
    }
    else if (v instanceof Bike) {
      Bike b = (Bike) v;
      System.out.printf("엔진: %b\n", b.engine);
    }
    System.out.println("--------------------");
  }


}
