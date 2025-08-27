import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// As long as LIST, both of ArrayList and LinkedList is concerned about sequence (重視次序).
// SET, is not concerned about sequence (不重視次序).

// ! The main difference between ArrayList and LinkedList,
//   ArrayList: address is only uni-directionally arrowed by another address.
//   LinkedList:  address is bi-directionally arrowed by another address.
//   Linkedlist:  唯一橫跨 List 與 Queue 兩大 Interfaces, 所以 LinkedList 同時具備 List 與 Queue 的 Skills 及 Contracts.
public class DemoLinkedList {
  private Person person;          // Person 是 Class (Object), 而 person 則是 attribute.
  private String name;            // Person 指向 person, 亦指向 name.

  public static void main(String[] args) {
    // Lucas -> Leo -> Sue -> Jennie -> Mary
    Person p1 = new Person("Lucas", new Person("Leo",   //
      new Person("Sue", new Person("Jennie", new Person("Mary", null)))));
    
      System.out.println(p1.getName());                                             // Lucas
      System.out.println(p1.getPerson());                                           // Person@54bedef2
      System.out.println(p1.getPerson().getName());                                 // Leo
      System.out.println(p1.getPerson().getPerson().getPerson().getName());         // Jennie

    // Use loop to count the number of persons.
    // for (Object : Array) can only be applicable in Array, ArrayList, HashSet.
    // Thus, this format is not applicable in this case.
    Person head = p1;
    int countHead = 0;
    while (head != null) {
      head = head.getPerson();
      countHead++;
    }
    System.out.println(countHead);           // 5
    System.out.println(head);                // null
    
    LinkedList<Person2> persons = new LinkedList<>();
    persons.add(new Person2("Lucas"));
    persons.add(new Person2("Leo"));
    persons.add(new Person2("Sue"));
    persons.add(new Person2("Jennie"));
    persons.add(new Person2("Mary"));
    System.out.println(persons);
    System.out.println(persons.get(2).getName());                 // Sue
    System.out.println(persons.size());                           // 5
    System.out.println(persons.getFirst());                       // 亂碼
    System.out.println(persons.getLast());                        // 亂碼
    System.out.println(persons.getFirst().getName());             // Lucas
    System.out.println(persons.getLast().getName());              // Mary

    // List
    List<Person2> personList = new LinkedList<>();
    personList.add(new Person2("Lucas"));
    personList.add(new Person2("Mary"));

    personList = new LinkedList<>();
    //System.out.println(getFirstPerson(personList).getName());     // Lucas

    // ArrayList 較直接 access to targeted Object / address, 較 LinkedList 少走 looping.
    ArrayList<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(3.2));
    shapes.add(new Square(2.5));
    shapes.add(new Circle(6.1));
    System.out.println(totalArea(shapes));      // 155.31857141283567
    System.out.println(shapes.get(2));          // Circle@65b54208
    System.out.println(shapes.size());          // 3

    List<Shape> shapes1 = new LinkedList<>();
    shapes1.add(new Circle(3.2));
    shapes1.add(new Square(2.5));
    shapes1.add(new Circle(6.1));
    System.out.println(totalArea(shapes1));      // 155.31857141283567
    System.out.println(shapes1.get(2));          // Circle@1be6f5c3
    System.out.println(shapes1.size());          // 3

    // ! Queue / Deque
    // Queue 永遠也 First-In-First-Out (FIFO), 不可 Last-In-First-Out (LIFO)
    // Deque 除了 FIFO, 也可 LIFO
    Queue <String> names = new LinkedList<>();
    names.add("John");
    names.add("Leo");
    names.add("Lucas");
    System.out.println(names);                   // [John, Leo, Lucas]
    System.out.println(names.size());            // 3
    names.poll();                   // retrieves and removes
    // names.pollLast();            // invalid, because Queue cannot LIFO.
    System.out.println(names);                   // [Leo, Lucas]
    System.out.println(names.size());            // 2
    System.out.println(names.isEmpty());         // false

    Queue <String> names1 = new ArrayDeque<>();    // LinkedList or ArrayDeque
    names1.add("John");
    names1.add("Leo");
    names1.add("Lucas");
    System.out.println(names1);                   // [John, Leo, Lucas]
    System.out.println(names1.size());            // 3
    names1.poll();                   // retrieves and removes
    System.out.println(names1);                   // [Leo, Lucas]
    System.out.println(names1.size());            // 2
    System.out.println(names1.isEmpty());         // false
    names1.remove();
    System.out.println(names1);                   // [Lucas]
    

    // loop Queue 不如 loop 
    for (String name : names) {
      System.out.println(name);                   // Leo, Lucas (verticle)
    }
    // Queue is not for looping
    // Queue is for consume (消耗)
    // Queue is FIFO.
    // while (!names1.isEmpty()) {
    //   System.out.println(names.poll());        // NULL (indefinite loop)
    // }

    // List 只能 get 與 add, 不能 consume.
    Deque <String> nameDeque = new LinkedList<>();    // ArrayList or LinkedList
    nameDeque.add("Vincent");
    nameDeque.add("Steven");       // add to tail
    nameDeque.add("Tracy");        // add to tail
    nameDeque.addFirst("Fucky");   // add to head
    nameDeque.addLast("Fucker");   // add to tail
    System.out.println(nameDeque);      // [Fucky, Vincent, Steven, Tracy, Fucker]
    nameDeque.poll();
    System.out.println(nameDeque);      // [Vincent, Steven, Tracy, Fucker]
    nameDeque.pollLast();
    System.out.println(nameDeque);      // [Vincent, Steven, Tracy]

    System.out.println(nameDeque.peek());       // Vincent (lookup or get head)
    System.out.println(nameDeque.peekLast());   // Tracy (lookup or get tail)

    while (!nameDeque.isEmpty()) {
      System.out.println(nameDeque.poll());     // Vincent  Steven  Tracy (verticle)
    }



  }

    // get the head of list, if not found, return null.
  public static Person2 getFirstPerson(List<Person2> persons) {
    if (persons == null || persons.size() == 0) 
      return null;
    return persons.get(0);
  }

  // static method: List<Shape> --> calculate total area
  public static double totalArea(Collection <Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

}

