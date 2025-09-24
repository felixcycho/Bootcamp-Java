import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    String[] names = new String[] {"Alex", "Jessie", "Jennie"};

    for (String name : names) {
      System.out.println(name);       // Alex, Jessie, Jennie (vertical)
    }
    System.out.println(names);                    // 亂碼
    System.out.println(names.toString());         // 依然亂碼
    System.out.println(Arrays.toString(names));   // [Alex, Jessie, Jennie]

    System.out.println(names.length);       // 3
    // names.remove(new String("Alex"));    // invalid, cannot invoke remove(String) on array.
    
    // Disadvantage of array
    // 1. We need to re-create a new array, if we need to add new element. 
    // 2. When use array, we cannot expect when need to modify the size of array.
    // 3. Modify element:  search element one by one, and then replace it.

    // Solution: ArrayList
    // ArrayList cannot store 8 primitives.
    ArrayList<String> emails = new ArrayList<String> ();
    // emails = new ArrayList<Integer>();
    // ! ArrayList of String has no relationship with ArrayList of Integer.
    // ! ArrayList of Long has no relationship with ArrayList of Integer.
    // Long l1 = new Integer(3);         // invalid
    // ArrayList<Long> longs = new ArrayList<Integer>();         // invalid

    // Conclusion: The type of arraylist must be same as the Object type of arraylist.
    // So, after java 5+, Java allows implicitly align reference type and Object type for arraylist.
    ArrayList<String> bookNames = new ArrayList<> ();       // implicitly defined based on leftside
    bookNames.add("ABC");
    bookNames.add("DEF");
    bookNames.add("GHI");

    for (String bookName : bookNames) {
      System.out.println(bookName);
    }
    System.out.println(bookNames);                           // [ABC, DEF, GHI]
    System.out.println(bookNames.size());                    // 3
    // ArrayList 提升 readability, 以及 speed of writing codes.
    String s = "hello";    // s 是 address, "hello" 是 object. 
    // address 指向 object, 因此可透過 address, 去找出 object.
    System.out.println(s.toUpperCase());        
    s = null;      // primitives 不可 null, 而 String 及 Wrapped Classes 可以 null.
    s = "John";
    // In this case, s (address) 重新指向 John (Object), 因此可透過 s 去找出 John.
    // 從而, s 可放棄 null.
    bookNames.remove(1);          // remove the 2nd element.
    System.out.println(bookNames);       // ArrayList.class --> method: toString()
    
    // count the number of bookNames starting with "A"
    int countA = 0;
    for (String bookName : bookNames) {
      if (bookName.charAt(0) == 'A') {
         countA++;
      }
    }
    System.out.println("There are " + countA + " books starting with 'A' in bookNames.");

    countA = 0;
    for (String bookName : bookNames) {
      if (bookName.startsWith("A")) {
         countA++;
      }
    }
    System.out.println("There are " + countA + " books starting with 'A' in bookNames.");

    // ! ArrayList is in order, because the underlying data structure is an array.
    bookNames.add("MNO");
    System.out.println(bookNames);        // "MNO" will be the last element.
    bookNames.addFirst("OPQ");
    System.out.println(bookNames);        // "OPQ" will be the first element.

    bookNames.addLast(null);
    System.out.println(bookNames);        // [OPQ, ABC, GHI, MNO, null]
    bookNames.addLast("");
    System.out.println(bookNames);        // [OPQ, ABC, GHI, MNO, null, ]

    System.out.println(bookNames.contains("JJJ"));       // false
    System.out.println(bookNames.isEmpty());             // false
    // bookNames = null;  // Null Pointer, not same as Empty.
    System.out.println(bookNames.size());       // 6
    // same as array length

    bookNames.set(1, "BCD");
    System.out.println(bookNames);       // [OPQ, BCD, GHI, MNO, null, ]
    System.out.println(bookNames.get(2));     // GHI

    bookNames.clear();
    System.out.println(bookNames.isEmpty());             // true
    System.out.println(bookNames);       // []
    System.out.println(bookNames.size());    // 0
    // System.out.println(bookNames.length());       // invalid
    
    // System.out.println(bookNames.get(2));        // invalid, because cleared

    bookNames.add("ABC");
    bookNames.add("DEF");
    bookNames.add("GHI");
    System.out.println(bookNames.get(2));     // GHI (3rd element)

    // ! Basic ArrayList methods:  add, remove, isEmpty, size, contains, get, set, ...
    // ! We cannot put primitives into ArrayList.
    // ArrayList<int>
    ArrayList<Integer> integers = new ArrayList<>();    // That's why we need Wrapper Class
    integers.add(1);               // add 1 on 1st element
    integers.add(2);               // add 2 on 2nd element
    integers.add(3);               // add 3 on 3rd element
    System.out.println(integers);
    integers.remove(2);                        // remove the 3rd element
    System.out.println(integers);              // [1, 2]

    // ArrayList<Cat>
    // loop cat.getName()
    ArrayList<Cat> cats = new ArrayList<>();
    Cat c1 = new Cat("John");                     // John 是 object, c1 是 address.
    cats.add(c1);
    c1.setName("Peter");

    cats.add(new Cat("Leo", 100));

    for (Cat cat : cats) {
      System.out.println(cat.getName());          // Peter, Leo
    }
    Dog d1 = new Dog("Felix", 4);
    // cats.add(d1);                              // invalid, Dog object cannot be added into Cat Array nor ArrayList.



    // ! Interface: List
    // ! Polymorphism: List is an interface of ArrayList, List<X> is also the interface of ArrayList<X>.
    // ArrayList<Long> has no relationship with ArrayList<Integer>.
    List<String> names2 = new ArrayList<>();     // new ArrayList<>() implicitly defines the type of left side (i.e. List <String>)
    // List<String> names3 = new ArrayList<Integer> ()       // invalid, because no relationship
    names2.add("John");
    names2.add("Sue");

    for (String name : names2) {
      System.out.println(name);         // John, Sue (vertical)
    }
    System.out.println(names2);         // [John, Sue]

    names2.remove(new String("John"));
    System.out.println(names2);         // [Sue]

  }
}
