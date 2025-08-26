import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class DemoHashSet {
  public static void main(String[] args) {
    HashSet<String> names = new HashSet<>();       // implicitly defined as String
    names.add("John");
    names.add("Leo");
    names.add("John");             // HashSet cannot store duplicated objects.
    System.out.println(names.size());             // 2
    System.out.println(names.isEmpty());          // false
    System.out.println(names.contains("Leo"));    // true
    System.out.println(names);                    // [Leo, John]

    for (String name : names) {
      System.out.println(name);                   // Leo, John (verticle)
    }

    // remove Leo
    names.remove("Leo");                  // the same Object as "Leo" above
    names.remove(new String("John"));     // new Object, not the same Object as "John" above
    // In this case, if [new String("John")] is not equals() to John above,
    // then java implicitly defines [new String("John")] as address,
    // as a result, "John" cannot be removed.
    System.out.println(names.size());         // 0

    // ! HashSet vs ArrayList
    // 1. HashSet disallows duplicated objects.
    // 2. HashSet has no ordering.
    names.add("Oscar");
    names.add("Jacky");
    names.add("Oscar");      // duplicated
    names.add("oscar");
    System.out.println(names.size());         // 3
    System.out.println(names);                // [oscar, Jacky, Oscar] (randomly sequenced)
    // because HashSet disallow duplicated objects automatically.
    // Reason:  HashSet.add()  -->  object.equals()  -->  String.equals()
    
    // ArrayList<Hero> heros.
    // Object.class --> equals() --> checking "=="
    // heros.remove(new Hero("John"));

    // ! Important point for both ArrayList and HashSet --> Override equals() for Object
    
    ArrayList<Cat> cats = new ArrayList<>();
    cats.add(new Cat("Kelly"));
    cats.add(new Cat("Sue"));
    cats.add(new Cat("Kelly"));
    System.out.println(cats.size());                           // 3
    // because ArrayList can store duplicated objects.

    cats.remove(new Cat("Kelly"));     // Failure to remove
    System.out.println(cats.size());                           // 3 (if missing equals() in Cat Class)
                                                               // 2 (add equals() in Cat Class)
    cats.remove(new Cat("Kelly"));
    System.out.println(cats.size());                           // 3 (if missing equals() in Cat Class)
                                                               // 1 (add equals() in Cat Class)
    // remove fail, because missing equals() in Cat.class

    Cat c1 = new Cat("Susan");
    cats.add(c1);
    Cat c3 = new Cat("Susan");
    cats.add(c3);
    System.out.println(cats.size());                           // 5

    cats.remove(c1);
    cats.remove(c3);
    System.out.println(cats.size());                           // 3
    
    // Correct solution: rewrite equals() in Cat.class

    // Question 1:  Remove duplicates by HashSet
    ArrayList<String> emails = new ArrayList<>();
    emails.add("leo123@gmail.com");
    emails.add("lucas234@gmail.com");
    emails.add("leo123@gmail.com");

    HashSet<String> uniqueEmails = new HashSet<>(emails);
    emails.clear();
    emails.addAll(uniqueEmails);

    for (String email : emails) {
      System.out.println(email);
    }

    // Question 2:  Construct a HashMap (at least 2 entries)
    HashMap<String, ArrayList<Dog>>  dogListMap = new HashMap<>();

    ArrayList<Dog> goldenRetrievers = new ArrayList<>();
    goldenRetrievers.add(new Dog("Felix", 4));

    ArrayList<Dog> malamutes = new ArrayList<>();
    malamutes.add(new Dog("Philip", 3));

    dogListMap.put("goldenRetrivers", goldenRetrievers);
    dogListMap.put("Malamutes", malamutes);

    System.out.println(dogListMap);

    // Question 3:  Convert Cat Array into Cat ArrayList, then print out all Cat names.
    Cat[] catArray = new Cat[] {new Cat("Kelly", 3), new Cat("Oscar", 10)};

    ArrayList<Cat> catArrayList = new ArrayList<>();
    for (Cat cat : catArray) {
      catArrayList.add(cat);
    }
    System.out.println(catArrayList);

  }
}
