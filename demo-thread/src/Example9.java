// import java.util.Hashtable;

public class Example9 {
  public static void main(String[] args) {
    HashTableTask task = new HashTableTask();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {
    
    }
    System.out.println(task.getMap().get("apple"));

  }
}
