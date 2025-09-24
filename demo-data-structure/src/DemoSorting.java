import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import generic.Ball2;
import generic.Color;
import generic.Passenger1;

public class DemoSorting {
  public static void main(String[] args) {
    List<Passenger1> passengers = new LinkedList<>();
    passengers.add(new Passenger1(72));
    passengers.add(new Passenger1(20));
    passengers.add(new Passenger1(42));
    passengers.add(new Passenger1(27));
    passengers.add(new Passenger1(74));
    passengers.add(new Passenger1(29));
    passengers.add(new Passenger1(2));
    passengers.add(new Passenger1(7));
    passengers.add(new Passenger1(77));

    for (Passenger1 p : passengers) {
      System.out.println(p);
    }
    // Example: Collections.sort
    // ! sort() --> merge sort (loop) --> Override compareTo
    Collections.sort(passengers);       // Comparable: passengers

    System.out.println(passengers);
      // [Passenger (77, 74, 72, 42, 29, 27, 20, 7, 2)]

    // Example: Array.sort
    Passenger1[] passengerArr = new Passenger1[] 
                               {new Passenger1(2), new Passenger1(7), new Passenger1(77), new Passenger1(29),
                                new Passenger1(27), new Passenger1(42), new Passenger1(20), new Passenger1(74),
                                new Passenger1(72)};
    Arrays.sort(passengerArr);
    // ! Array.sort() --> object.compareTo
    System.out.println(Arrays.toString(passengerArr));
    // [Passenger (77, 74, 72, 42, 29, 27, 20, 7, 2)]

    // String[] --> Arrays.sort
    // String[] --> List<String> --> Collections.sort()
    // int[] --> Arrays.sort
    // int[] --> List<Integer> --> Collections.sort()

    // ! Comparator<Ball2>
    List<Ball2> balls = new ArrayList<>();
    balls.add(new Ball2(Color.RED, 28));
    balls.add(new Ball2(Color.YELLOW, 100));
    balls.add(new Ball2(Color.BLUE, -4));
    balls.add(new Ball2(Color.YELLOW, 250));
    Collections.sort(balls, new SortByValueDesc());
    System.out.println(balls);
    // [Ball (color = YELLOW, value = 250), Ball (color = YELLOW, value = 100), 
    // Ball (color = RED, value = 28), Ball (color = BLUE, value = -4)]
    Collections.sort(balls, new SortByColor());    // Comparator: new SortByColor
    System.out.println(balls);

    // ! PriorityQueue + Comparator
    Queue<Ball2> bq = new PriorityQueue<>(new SortByColor());
    
  }
}
