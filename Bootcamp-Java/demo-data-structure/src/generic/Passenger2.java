package generic;
import java.util.PriorityQueue;
import java.util.Queue;

public class Passenger2 implements Comparable<Passenger2> {
  private int age;

  public Passenger2 (int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }

  public boolean isElderly() {
    return this.age > 65;
  }

  // -1 --> 我 (this)
  // Question: Elderly age > 65
  // public int compareTo(Passenger2 passenger) {
  //  if (this.isElderly() && !passenger.isElderly()) 
  //    return -1;
  //  if (!this.isElderly() && passenger.isElderly())
  //    return 1;
  //  if (this.isElderly() && passenger.isElderly()) {
  //    if (this.age < passenger.getAge())
  //      return -1;
  //    else
  //      return 1;
  //  }
  //  if (this.age < passenger.getAge()) 
  //    return -1;
  //  return 1;
  // }
  public int compareTo(Passenger2 passenger) {
    if (this.isElderly()) {
      if (passenger.isElderly()) {
        if (this.age < passenger.getAge())
          return -1;
        else 
          return 1;
      } else {
        return -1;
      }
    } else           // this.isElderly()
      if (passenger.isElderly()) {
        return 1; 
      } else {
        if (this.age < passenger.getAge()) {
          return -1;
        } else {
          return 1;
        }
      }
  }
  
  @Override
  public String toString() {
    return "Passenger ("
         + "age = " + this.age
         + ")";
  }

  public static void main(String[] args) {
    Queue<Passenger2> pq = new PriorityQueue<>();          // compareTo() from Comparable<T>
    pq.add(new Passenger2(42));
    pq.add(new Passenger2(42));
    pq.add(new Passenger2(49));
    pq.add(new Passenger2(2));
    pq.add(new Passenger2(49));
    pq.add(new Passenger2(27));
    pq.add(new Passenger2(72));
    pq.add(new Passenger2(72));
    pq.add(new Passenger2(74));
    pq.add(new Passenger2(77));
    System.out.println(pq);
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());    
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq.poll());
    System.out.println(pq);
    pq.add(new Passenger2(7));
    pq.add(new Passenger2(29));
    pq.add(new Passenger2(72));
    System.out.println(pq);                   // [Passenger (72, 7, 29, 49)]
    System.out.println(pq.size());            // 4
    System.out.println(pq.peek());            // Passenger (72)
    System.out.println(pq);                   // [Passenger (72, 7, 29, 49)]
    System.out.println(pq.remove());          // Passenger (72)
    System.out.println(pq.poll());            // Passenger (7)
    System.out.println(pq.poll());            // Passenger (29)
    System.out.println(pq.poll());            // Passenger (49)
    System.out.println(pq.size());            // 0
    System.out.println(pq.poll());            // null
    System.out.println(pq.size());            // 0

    pq.add(new Passenger2(94));
    pq.add(new Passenger2(92));
    pq.add(new Passenger2(2));
    pq.add(new Passenger2(4));
    System.out.println(pq);

    pq.clear();
    System.out.println(pq);                   // []
    System.out.println(pq.size());            // 0

  }
}









