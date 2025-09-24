public class Example8 {
  public static void main(String[] args) {
    VectorTask task = new VectorTask();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    worker1.start();
    worker2.start();

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(task.getIntegers().size());              // 20000

  }
}
