import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class DemoLambdaExamples {
  public static void main(String[] args) {
    // 1. for loop
    List<String> names = new ArrayList<>();
    names.add("Peter");
    names.add("Leo");
    names.add("Mary");
    for (String name : names) {
      System.out.println(name);
    }

    names.forEach(n -> System.out.println(n));

    names.forEach(n -> {
      if (n.length() > 4) {
        System.out.println(n);
      }
    });

    // Comparator
    // int compare(T o1, T o2);
    Comparator<Person> sortByAgeDesc = (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    List<Person> persons = new ArrayList<>();
    persons.add(new Person(72));
    persons.add(new Person(42));
    persons.add(new Person(27));
    persons.add(new Person(29));
    persons.add(new Person(92));
    persons.add(new Person(94));
    persons.add(new Person(2));
    persons.add(new Person(74));
    persons.add(new Person(77));
    persons.add(new Person(7));
    persons.add(new Person(49));
    Collections.sort(persons, sortByAgeDesc);
    System.out.println(persons);

    Collections.sort(persons, (p1, p2) -> p1.getAge() < p2.getAge() ? -1 : 1);
    System.out.println(persons);

  }

  public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }

    public String toString() {
      return "Person ("
           + "age = " + this.age
           + ")";
    }
  }

}
