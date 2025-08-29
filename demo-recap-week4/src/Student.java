import java.util.ArrayList;
import java.util.List;

public class Student extends Person {
  public Student(String name) {
    super(name);
  }

  public static void main(String[] args) {
    Person p1 = new Student("John");
    p1 = new Teacher("Peter");

    List<Person> persons = new ArrayList<>();
    persons.add(new Teacher("Steven"));
    persons.add(new Student("Jennie"));
    
    for (Person p : persons) {
      p.saveMoney(100);
    }
  }
}
