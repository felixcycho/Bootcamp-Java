import java.util.Deque;
import java.util.LinkedList;

class Car {
  int speed = 100;
  static Car instance = new Car();

  private Car() {

  }

  public static Car getInstance() {
    return instance;
  }

  // instance method
  public void setSpeed(int s) {
    this.speed = s;
  }
}


public class CarFactory {
  public static void main(String[] args) {
    Deque<Car> deque = new LinkedList<>();

    Car tesla = Car.getInstance();
    Car toyota = Car.getInstance();

    tesla.setSpeed(80);

    deque.add(tesla);
    deque.push(toyota);

    System.out.println(deque.getLast().speed + " " + deque.getFirst().speed);       // 80 80
  }
}
