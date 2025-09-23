import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

// Stream, 是 for-loop 寫法
public class DemoStream {
  public static void main(String[] args) {
  // Lambda -> Stream
  // Prepare Persons: John 38, Jennie 67, Steven 18
  // Use loop to filter elderly (age > 65), and then print the name.
    List<Person> persons = new LinkedList<>();
    persons.add(new Person("Felix", 42));
    persons.add(new Person("Philip", 72));
    persons.add(new Person("Justin", 74));
    persons.add(new Person("Fucker", 49));
    persons.forEach(p -> {
      if (p.getAge() > 65) {
        System.out.println(p.getName());
      }
    });

    // ! Lambda --> Stream mode
    persons.stream()        // stream<Person>
      .filter(p -> p.getAge() > 65)
      .forEach(p -> System.out.println(p.name));

    // filter + collect into another list
    // List<Person> -> Stream<Person> -> List<Person>
    // 死背
    List<Person> elderPersons 
      = persons.stream()
      //  .filter(p -> p.getAge() > 65)
      //  .filter(p -> p.isElderly())
        .filter(Person::isElderly)
        .collect(Collectors.toList());
    System.out.println(elderPersons);

    // name contains F and age < 65
    // collect to another list
    // ! Lambda --> Stream mode
    persons.stream()        // stream<Person>
    .filter(p -> p.getAge() < 65)
    .filter(p -> p.getName().startsWith("F"))
    .forEach(p -> System.out.println(p.name));

    // filter + collect into another list
    // List<Person> -> Stream<Person> -> List<Person>
    // 死背
    List<Person> personsWithF
      = persons.stream()
        .filter(p -> p.getAge() < 65)
        .filter(p -> p.getName().startsWith("F"))
        .collect(Collectors.toList());
    System.out.println(personsWithF);

    List<Person> personsWithF2
      = persons.stream()
        .filter(p -> p.getAge() < 65 && p.getName().startsWith("F"))
        .collect(Collectors.toList());
    System.out.println(personsWithF2);

    // List<Integer>: 8, 7, 3, 100, 97
    // Collect all odd numbers to another List<Integer>
    List<Integer> integers = new LinkedList<>();
    integers.add(2);
    integers.add(7);
    integers.add(27);
    integers.add(29);
    integers.add(42);
    integers.add(49);
    integers.add(72);
    integers.add(74);
    integers.add(77);
    integers.add(92);
    integers.add(94);

    integers.forEach(i -> {
      if (i % 2 == 1) {
        System.out.println(i);
      }
    });
    integers.stream()
      .filter(i -> i % 2 == 1)
      .forEach(i -> System.out.println(i));

    List<Integer> oddIntegers 
      = integers.stream()
        .filter(i -> i % 2 == 1)
        .collect(Collectors.toList()); 
    System.out.println(oddIntegers);

    
    // List<List<String>>
    // "apple", "banana", "orange"
    // "John", "Lucas", "Leo"
    // "Monday", "Tuesday", "Wednesday"
    // filter list with string length > 5
    // Output: List<List<String>>
    List<String> stringsList1 = new ArrayList<>();
    stringsList1.add("apple");
    stringsList1.add("banana");
    stringsList1.add("orange");

    List<String> stringsList2 = new ArrayList<>();
    stringsList2.add("John");
    stringsList2.add("Lucas");
    stringsList2.add("Leo");

    List<String> stringsList3 = new ArrayList<>();
    stringsList3.add("Monday");
    stringsList3.add("Tuesday");
    stringsList3.add("Wednesday");

    List<List<String>> listsWithString = new LinkedList<>();
    listsWithString.add(stringsList1);
    listsWithString.add(stringsList2);
    listsWithString.add(stringsList3);

    System.out.println(listsWithString);

    List<List<String>> filteredListsWithLength6 
      = listsWithString.stream()
        .filter(list -> {
          // return true
          for (String s : list) {
            if (s.length() > 5) {
              return true;
            }
          }
          return false;
        }).collect(Collectors.toList());

    System.out.println(filteredListsWithLength6);

    // List<Person> -> List<String>
    List<String> nameList = persons.stream()   // Stream<Person>
      .map(p -> p.getName())                   // Stream<String>, return this.name
      .collect(Collectors.toList());           // List<String>
    //.collect(Collectors.toSet());            // HashSet<Person>
    System.out.println(nameList);

    // Termination Operation
    // collect(), foreach(), count()
    List<String> names2 = new ArrayList<>();
    names2.add("John");
    names2.add("Peter");
    long count 
      = names2.stream()
        .filter(e -> e.length() > 3)
        .map(e -> e + "!!!")
        .count();
    System.out.println(count);

    // ! Intermediate Operation (return Stream<>)
    // filter(), map(), distinct(), sort()


    List<String> nameList2 
      = persons.stream()                         // Stream<Person>
        //.sorted()                              // sorted() should be next to map()
        .map(p -> p.getName())                   // Stream<String>, return this.name
        .sorted()
        .collect(Collectors.toList());           // List<String>
      //.collect(Collectors.toSet());            // HashSet<Person>
    System.out.println(nameList2);

    // List<Person> -> List<String>
    // Comparator<Person> sortedByAge
    //  = (p1, p2) -> p1.getAge() > p2.getAge() ? -1 : 1;
    Comparator<Person> sortedByAge 
    = (p1, p2) -> {
      if (p1.getAge() > p2.getAge())
        return -1;
      return 1;
    };

    List<String> nameList3 = persons.stream()    // Stream<Person>
      .sorted(sortedByAge)
      .map(p -> p.getName())                     // Stream<String>
      .collect(Collectors.toList());             // List<String>
    System.out.println(nameList3);

    // generate 6 random integer between 1 to 49
    // these 6 integers should not be duplicated
    Set<Integer> markSixSet = new HashSet<>();
    Random random = new Random();

    // Generate 6 distinct random integers
    while (markSixSet.size() < 6) {
      int randomNumber = random.nextInt(49) + 1;      // Generates a number between 1 and 49
      markSixSet.add(randomNumber);                   // Set will ensure no duplicates
    }
    System.out.println(markSixSet);

    List<Integer> markSixList = new ArrayList<>();
    while (markSixList.size() < 6) {
      // contains
      int num = new Random().nextInt(49) + 1;                //  0 - 48 再加 1
      if (!markSixList.contains(num)) {
        markSixList.add(num);
      }
    }
    System.out.println(markSixList);
    
    // distinct()
    List<Character> characters = new ArrayList<>();
    characters.add('b');
    characters.add('a');
    characters.add('b');

    List<Character> uniqueCharacters
    = characters.stream()                 // Stream<Character>
      .distinct()                         // remove duplicated (equals())
      .collect(Collectors.toList());
    System.out.println(uniqueCharacters);


  }

  public static class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public String toString() {
      return "Person ("
           + "name = " + this.name
           + ", age = " + this.age
           + ")";
    }

    public boolean isElderly() {
      return this.age > 65;
    }

  }

}
