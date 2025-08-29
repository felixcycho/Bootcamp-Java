import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class DemoLoop {
  public static void main(String[] args) {
    String s = "hello";
    for (int i = 0; i < s.length(); i++) {
      System.out.println((int) s.charAt(i));
    }
    // for-each
    for (char ch : s.toCharArray()) {
      System.out.println(ch);
    }

    // Queue -> consume -> !isEmpty
    // LinkedList -> loop through -> != null
    // unknown number of iterations
    Queue<String> names = new ArrayDeque<>();
    names.add("John");
    names.add("Peter");
    names.add("Lucas");
    while (!names.isEmpty()) {
      System.out.println(names.poll());
    }

    names.clear();

    Queue<Person> personQueue = new LinkedList<>();
    Person john = new Person("John");
    john.addPocket();
    john.saveMoney(110);

    Person peter = new Person("Peter");
    peter.addPocket();
    peter.saveMoney(210);

    personQueue.add(john);
    personQueue.add(peter);

    while (!personQueue.isEmpty()) {
      Person p = personQueue.poll();
      if (p.getPocket().deduct(20)) {
        System.out.println(
            p.getName() + " deducted $20. Money left: " + p.getMoney());
        if (p.getMoney() > 0) {
          personQueue.add(p);
        }
      } else {
        System.out.println(
            p.getName() + " left the queue. Money left: " + p.getMoney());
      }
    }


  }
}
