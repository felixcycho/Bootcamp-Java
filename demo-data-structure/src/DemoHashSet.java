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
    // In this case, even though [new String("John")] is not equals() to John above,
    // then java implicitly defines [new String("John")] as same object because of same address ("John".equals("John")),
    // as a result, "John" can be removed.
    System.out.println(names.size());         // 0

    // ! HashSet vs ArrayList
    // 1. HashSet disallows duplicated objects.
    // 2. HashSet has no ordering.
    names.add("Oscar");
    names.add("Jacky");
    names.add("Oscar");      // duplicated
    names.add("oscar");      // "oscar" is different from "Oscar"
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
    System.out.println(cats.size());                           // 2 (because add equals() in Cat Class)
                                                               // 3 (if missing equals() in Cat Class)
                                                               
    cats.remove(new Cat("Kelly"));
    System.out.println(cats.size());                           // 1 (because add equals() in Cat Class)
                                                               // 3 (if missing equals() in Cat Class)
                                                               
    // remove fail, if missing method @Override equals() in Cat.class

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
    // emails.clear();
    // emails.addAll(uniqueEmails);

    for (String email : emails) {
      uniqueEmails.add(email);
    }
    System.out.println(uniqueEmails);                          // [lucas234@gmail.com, leo123@gmail.com]

    // Question 1b:  Put duplicated emails into another ArrayList
    ArrayList<String> duplicatedEmails = new ArrayList<>();
    HashSet<String> dummySet = new HashSet<>();
    // 1. HashSet add() returns true. -->  It means not duplicated.
    //    Otherwise, HashSet add() returns false. --> It means duplicated.
    for (String email : emails) {
      if (!dummySet.add(email)) {     // ! return false if duplicated
        duplicatedEmails.add(email);
      }
    }
    System.out.println(duplicatedEmails);               // [leo123@gmail.com]

    // Question 2:  Construct a HashMap (at least 2 entries)
    HashMap<String, ArrayList<Dog>>  dogListMap = new HashMap<>();
    // Array store address only, ArrayList also store address only.

    ArrayList<Dog> goldenRetrievers = new ArrayList<>();
    goldenRetrievers.add(new Dog("Felix", 4));
    goldenRetrievers.add(new Dog("Pheobe", 5));

    ArrayList<Dog> alaskanMalamutes = new ArrayList<>();
    alaskanMalamutes.add(new Dog("Philip", 3));
    alaskanMalamutes.add(new Dog("Fiona", 1));


    dogListMap.put("goldenRetrievers", goldenRetrievers);
    dogListMap.put("alaskanMalamutes", alaskanMalamutes);

    System.out.println(dogListMap);
    System.out.println(dogListMap.get(alaskanMalamutes));         // NULL
    System.out.println(dogListMap.get(goldenRetrievers));         // NULL

    System.out.println(dogListMap.get("alaskanMalamutes"));       // [Dog (name = Philip, age = 3), Dog (name = Fiona, age = 1)]
    System.out.println(dogListMap.get("goldenRetrievers"));      // [Dog (name = Felix, age = 4), Dog (name = Pheobe, age = 5)]

    // System.out.println(dogListMap.get(Husky))                          // NULL
    // System.out.println(dogListMap.get(Husky).get(0).getName());        // java.lang.NullPointerException

    // Question 3:  Convert Cat Array into Cat ArrayList, then print out all Cat names.
    Cat[] catArray = new Cat[] {new Cat("Kelly", 3), new Cat("Oscar", 10)};

    ArrayList<Cat> catArrayList = new ArrayList<>();
    for (Cat cat : catArray) {
      catArrayList.add(cat);
    }
    System.out.println(catArrayList);
    for (Cat cat : catArrayList) {
      System.out.println(cat.getName());     // Kelly, Oscar
    }

  }
}
