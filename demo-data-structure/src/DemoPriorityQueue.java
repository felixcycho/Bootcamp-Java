import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
  public static void main(String[] args) {
    // Queue
    // Deque<String> names = new PriorityQueue<>();
      // invalid, because PriorityQueue cannot be defined as Deque.
    Queue<String> names = new PriorityQueue<>();
      // PriorityQueue can only be defined as Queue.
      // PriorityQueue can be put into HashMap.
      names.add("John");
      names.add("Steven");
      names.add("Lucas");
      names.add("Vincent");
      names.add("Cathy");

      // ! the ordering algorithm does not happen in add() method.
      System.out.println(names);

      // ! Priority Queue poll elements in given ordering.
      // ! By defalut natural ordering (compartTo())
      System.out.println(names.poll());          // Cathy
      System.out.println(names.poll());          // John
      
      names.add("Alex");
      System.out.println(names.poll());          // Alex
      System.out.println(names.poll());          // Lucas

      // add() or poll() --> ordering?
      // ordering --> nlogn
      // to PriorityQueue, 可輕鬆 add(), 但 poll() 要小心處理.
      // poll() PriorityQueue 有順序

      // PQ --> Integer
      // 100, -80, 800, 799, 20
      Queue<Integer> integers = new PriorityQueue<>();
      integers.add(100);
      integers.add(-80);
      integers.add(800);
      integers.add(799);
      integers.add(20);
      System.out.println(integers);             // [-80, 20, 800, 799, 100]

      System.out.println(integers.poll());      // -80
      System.out.println(integers.poll());      // 20
      System.out.println(integers.poll());      // 100
      System.out.println(integers.poll());      // 799
      System.out.println(integers);             // [800]
      System.out.println(integers.poll());      // 800
      System.out.println(integers);             // []
      System.out.println(integers.isEmpty());   // true
      // PriorityQueue 用處, 在於 poll() 有順序,
      // 否則, 可用 ArrayList or LinkedList, 因為 polling 速度慢 (i.e. O(N))

      integers.add(1);
      integers.add(2);
      integers.add(3);
      integers.add(4);
      while (!integers.isEmpty()) {
        System.out.println(integers.poll());
      }

      


  }
}
