import java.util.Deque;
import java.util.LinkedList;


public class CarFactory {
  public static void main(String[] args) {
    Deque<Car> deque = new LinkedList<>();

    Car tesla = Car.getInstance();
    Car toyota = Car.getInstance();

    tesla.setSpeed(80);

    deque.add(tesla);
    deque.push(toyota);

    System.out.println(deque.getLast().speed + " " + deque.getFirst().speed);
  }
}
