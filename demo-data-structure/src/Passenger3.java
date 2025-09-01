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
    System.out.println(pq);
    System.out.println(pq.remove(0));
    System.out.println(pq.remove(2));
    System.out.println(pq.remove(4));    
    System.out.println(pq);
    pq.add(new Passenger3(7));
    pq.add(new Passenger3(29));
    pq.add(new Passenger3(72));
    System.out.println(pq);


  }
}
