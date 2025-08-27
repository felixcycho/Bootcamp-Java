import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

// As long as LIST, both of ArrayList and LinkedList is concerned about sequence (重視次序).
// SET, is not concerned about sequence (不重視次序).

// ! The main difference between ArrayList and LinkedList,
//   ArrayList: address is only uni-directionally arrowed by another address.
//   LinkedList:  address is bi-directionally arrowed by another address.
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
    System.out.println(persons.get(2).getName());       // Sue
    System.out.println(persons.size());                 // 5
    System.out.println(persons.getFirst());             // 亂碼
    System.out.println(persons.getLast());              // 亂碼
    System.out.println(persons.getFirst().getName());             // Lucas
    System.out.println(persons.getLast().getName());              // Mary

    // List
    List<Person2> personList = new LinkedList<>();
    personList.add(new Person2("Lucas"));
    personList.add(new Person2("Mary"));

    personList = new ArrayList<>();

    // Shape --> Circle / Square



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

