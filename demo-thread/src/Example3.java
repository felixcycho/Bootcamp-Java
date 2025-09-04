public class Example3 {
  public static void main(String[] args) {
    SyncTask task = new SyncTask();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();                       // execute task.run()
    worker2.start();                       // 同步與 worker1 execute task.run()

    // InterruptedException 屬於 checked exception
    try {
      // ! main thread will wait until worker 1 come back.
      worker1.join();
      // ! main thread will wait until worker 2 come back.
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(task.getX());       //  200_000
  }
}

