public class Example6 {
  public static void main(String[] args) {
    ArrayListTask task = new ArrayListTask();
    Thread worker1 = new Thread(task);
    Thread worker2 = new Thread(task);

    // ! Most likely cause Error --> ArrayList --> Array --> copy of array fixed length
    worker1.start();                       
    worker2.start();                       

    try {
      worker1.join();
      worker2.join();
    } catch (InterruptedException e) {

    }
    System.out.println(task.getIntegers().size());     // 20000

  }
}
