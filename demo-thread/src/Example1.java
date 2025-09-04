public class Example1 {
  public static void main(String[] args) throws Exception {

    Task task = new Task();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);
    worker1.start();                       // execute task.run()
    worker2.start();                       // 同步與 worker1 execute task.run()

    // ! main thread come the end of the program, without waiting the 2 new threads.
    // ! the 2 new threads still working on the x, but the main thread want to read x value.
    System.out.println(task.getX());       // 原則上 500 至 1000, 可惜我部機太慢, worker1 & worker2 仍未開工


      
  }
}
