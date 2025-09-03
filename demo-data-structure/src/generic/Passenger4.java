package generic;
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
    System.out.println(pq);                    // [Passenger (42, 42, 49, 2, 49, 27, 72, 72, 74, 77)]
    System.out.println(pq.size());             // 10
    System.out.println(pq.poll());             // Passenger (42)
    System.out.println(pq.poll());             // Passenger (42)
    System.out.println(pq.poll());             // Passenger (49)
    System.out.println(pq.poll());             // Passenger (2)
    System.out.println(pq.poll());             // Passenger (49)
    System.out.println(pq.poll());             // Passenger (27)
    System.out.println(pq.poll());             // Passenger (72)
    System.out.println(pq.poll());             // Passenger (72)
    System.out.println(pq.poll());             // Passenger (74)
    System.out.println(pq);                    // [Passenger (77)]
    pq.addFirst(new Passenger4(7));
    pq.add(new Passenger4(29));
    pq.add(new Passenger4(72));
    System.out.println(pq);                    // [Passenger (7, 77, 29, 72)]
    System.out.println(pq.peek());             // Passenger (7)
    System.out.println(pq.peekFirst());        // Passenger (7)
    System.out.println(pq.peekLast());         // Passenger (72)
    System.out.println(pq);                    // [Passenger (7, 77, 29, 72)]
    System.out.println(pq.pollLast());         // Passenger (72)
    System.out.println(pq.poll());             // Passenger (77)
    System.out.println(pq.poll());             // Passenger (7)
    System.out.println(pq.poll());             // Passenger (29)
    System.out.println(pq);                    // []
    
    pq.add(new Passenger4(92));
    pq.add(new Passenger4(94));
    pq.addFirst(new Passenger4(7));
    pq.addFirst(new Passenger4(2));
    pq.addLast(new Passenger4(72));
    pq.add(new Passenger4(29));
    pq.add(new Passenger4(77));
    System.out.println(pq);                    // [Passenger (2, 7, 92, 94, 72, 29, 77)]


    pq.removeLast();
    pq.removeFirst();
    pq.remove(new Passenger4(72));             // cannot remove
    System.out.println(pq);                    // [Passenger (7, 92, 94, 72, 29)]
    pq.poll();
    pq.pollLast();
    System.out.println(pq);                    // [Passenger (92, 94, 72)]


    pq.clear();
    System.out.println(pq);                    // []
    System.out.println(pq.size());             // 0

    // pq.remove();                            // invalid, NoSuchElementException
    System.out.println(pq.poll());             // null
    System.out.println(pq);                    // []


  }
}
