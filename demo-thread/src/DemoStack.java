import java.util.List;
import java.util.Stack;

// Stack, 用作 extends Vector 的 synchronized methods.
// Stack 上鎖, 如果既想達至 LIFO 效果, 又想解鎖, 可用 interface Deque.
  // 根據 interface Deque 特性, Deque 既可 FIFO, 又可 LIFO,
    // interface 特性不能改變, 原則上沒路可走.
       // but, in practical, 就是在 ArrayDeque 限制 FIFO 功能.
public class DemoStack {
  public static void main(String[] args) {
    Stack<String> names = new Stack<>();
    names.add("John");
    names.add("Steven");
    names.add("Leo");

    System.out.println(names.pop());   // Leo
    System.out.println(names.pop());   // Steven
    System.out.println(names.pop());   // John
    System.out.println(names);         // []
    names.push("Felix");
    names.push("Philip");
    names.push("Justin");
    System.out.println(names);

    System.out.println(names.size());
    System.out.println(names.contains("Felix"));
    System.out.println(names.peek());

    while (!names.isEmpty()) {          // 去 consume, if 用 for-loop, 建議用 Vector.
                                        // 去 consume, Stack 最好用 while.
      System.out.println(names);
      System.out.println(names.pop());     
    }

    List<String> emails = new Stack<>();
    emails.add("abc@gmail.com");
    emails.add("def@gmail.com");
    emails.add("ghi@gmail.com");

    // emails.pop();               // invalid
    // emails.push();              // invalid
    System.out.println(emails.get(0));            
    System.out.println(emails.getFirst());
    System.out.println(emails.getLast());
    emails.remove(0);
    System.out.println(emails);
    
  }
}
