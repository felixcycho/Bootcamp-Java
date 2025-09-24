package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Passenger1 implements Comparable<Passenger1> {
  private int age;

  public Passenger1 (int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public int compareTo(Passenger1 passenger) {
    return this.age > passenger.getAge() ? -1 : 1;
  }
  
  @Override
  public String toString() {
    return "Passenger ("
         + "age = " + this.age
         + ")";
  }

  public static void main(String[] args) {
    Queue<Passenger1> pq = new PriorityQueue<>();          // compareTo() from Comparable<T>
    pq.add(new Passenger1(42));
    pq.add(new Passenger1(2));
    pq.add(new Passenger1(27));
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq);
    pq.add(new Passenger1(2));
    pq.add(new Passenger1(7));
    System.out.println(pq);

  }
}
