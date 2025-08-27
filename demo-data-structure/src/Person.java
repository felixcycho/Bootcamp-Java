import java.util.LinkedList;

public class Person { // This method is faster than using ArrayList.
  
  private Person person;          // Person 是 Class (Object), 而 person 則是 attribute.
  private String name;            // Person 指向 person, 亦指向 name.

  // constructor
  public Person(String name, Person person) {
    this.person = person;
    this.name = name;
  }

  // getter
  public Person getPerson() {
    return this.person;
  }

  public String getName() {
    return this.name;
  }

  // setter (如果 developer 不打算更改 attributes, 則可以不寫 Setter)
  public void setPerson(Person person) {
    this.person = person;
  }

  public void setName(String name) {
    this.name = name;
  }

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
    System.out.println(persons);                        // 一堆亂碼
    // System.out.println(persons.getName());           // compile error, getName() is undefined for type LinkedList<Person2>
    System.out.println(persons.get(2).getName());       // Sue
    System.out.println(persons.size());                 // 5
    System.out.println(persons.getFirst().getName());             // Lucas
    System.out.println(persons.getLast().getName());              // Mary


  }

}
