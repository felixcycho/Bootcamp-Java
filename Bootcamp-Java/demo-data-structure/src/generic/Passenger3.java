package generic;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Passenger3 {
    private int age;

  public Passenger3 (int age) {
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
  public int compareTo(Passenger3 passenger) {
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
    List<Passenger3> pq = new LinkedList<>();          // compareTo() from Comparable<T>
    pq.add(new Passenger3(42));
    pq.add(new Passenger3(42));
    pq.add(new Passenger3(49));
    pq.add(new Passenger3(2));
    pq.add(new Passenger3(49));
    pq.add(new Passenger3(27));
    pq.add(new Passenger3(72));
    pq.add(new Passenger3(72));
    pq.add(new Passenger3(74));
    pq.add(new Passenger3(77));
    System.out.println(pq);                   // [Passenger (42, 42, 49, 2, 49, 27, 72, 72, 74, 77)]
    System.out.println(pq.remove(0));         // Passenger (42)
    System.out.println(pq.remove(2));         // Passenger (2)
    System.out.println(pq.remove(4));         // Passenger (72)
    System.out.println(pq);                   // [Passenger (42, 49, 49, 27, 72, 74, 77)]
    pq.add(new Passenger3(7));                
    pq.add(new Passenger3(29));
    pq.add(new Passenger3(72));
    System.out.println(pq);                   // [Passenger (42, 49, 49, 27, 72, 74, 77, 7, 29, 72)]
    System.out.println(pq.add(new Passenger3(92)));       // true
    System.out.println(pq);                   // [Passenger (42, 49, 49, 27, 72, 74, 77, 7, 29, 72, 92)]
    System.out.println(pq.size());            // 11
    pq.add(2, new Passenger3(94));
    System.out.println(pq);                   // [Passenger (42, 49, 94, 49, 27, 72, 74, 77, 7, 29, 72, 92)]
    pq.set(3, new Passenger3(94));
    System.out.println(pq);                   // [Passenger (42, 49, 94, 94, 27, 72, 74, 77, 7, 29, 72, 92)]

    System.out.println(pq.get(7));            // Passenger (77)
    System.out.println(pq.getFirst());        // Passenger (42)
    System.out.println(pq.getLast());         // Passenger (92)
    System.out.println(pq);                   // [Passenger (42, 49, 94, 94, 27, 72, 74, 77, 7, 29, 72, 92)]
    
    pq.clear();
    System.out.println(pq);                   // []

  }
}
