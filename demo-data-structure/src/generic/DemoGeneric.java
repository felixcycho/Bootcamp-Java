import java.util.ArrayList;
import java.util.List;
import generic.Ball2;
import generic.Color;
import generic.Passenger2;

// Generic 用途, 就是減少 Class 數量
public class DemoGeneric {
  public static void main(String[] args) {
    // Collection  (Java 1 or 2 已經有)
    // Generic (Java 5 or after)  --> List<String>

    // before Java 5
    List objects = new ArrayList<>();
    objects.add(new Ball2(Color.RED, 3));
    objects.add(new Passenger2(35));

    for (Object o : objects) {
      if (o instanceof Ball2) {
        Ball2 ball = (Ball2) o;
        System.out.println(ball.getColor());
      } else if (o instanceof Passenger2) {
        Passenger2 passenger = (Passenger2) o;
        System.out.println(passenger.getAge());
      }
    }

    // After Java 5
    // During compile time, you have to specify the type of object.
    // List<> 內, 不可寫 "?", 要寫 element.
    List<Ball2> balls = new ArrayList<Ball2>();     // <> 內的 Ball2 字, 可以不寫.
    for (Ball2 b : balls) {
      System.out.println(b.getColor());
    }

  }
}
