import java.util.ArrayDeque;
import java.util.Deque;

public class Passenger4 {
      private int age;

  public Passenger4 (int age) {
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
  public int compareTo(Passenger4 passenger) {
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
    Deque<Passenger4> pq = new ArrayDeque();          // compareTo() from Comparable<T>
    pq.add(new Passenger4(42));
    pq.add(new Passenger4(42));
    pq.add(new Passenger4(49));
    pq.add(new Passenger4(2));
    pq.add(new Passenger4(49));
    pq.add(new Passenger4(27));
    pq.add(new Passenger4(72));
    pq.add(new Passenger4(72));
    pq.add(new Passenger4(74));
    pq.add(new Passenger4(77));
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
    pq.add(new Passenger4(7));
    pq.add(new Passenger4(29));
    pq.add(new Passenger4(72));
    System.out.println(pq);
    System.out.println(pq.poll());    
    System.out.println(pq.poll());
    System.out.println(pq.poll());    
    System.out.println(pq.poll());

  }
}
