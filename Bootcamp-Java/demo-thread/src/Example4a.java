public class Example4a {
  public static void main(String[] args) {
    StringTaskA task = new StringTaskA();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();                       
    worker2.start();                       

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(task.getStr().length());        // 20000
  }
}

