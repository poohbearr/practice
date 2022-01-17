package practice.oop.ex05.x5;

public class ElectricEngine extends Option {

  public ElectricEngine(Car car) {
    super(car);
  }

  @Override
  public void start() {
    car.start();
  }

  @Override
  public void stop() {
    super.stop();
  }

  @Override
  public void run() {
    car.run();
    System.out.println("전기로 간다!");
  }
}
