public class ArrayTask implements Runnable {
  private int[] arr; 

  public ArrayTask() {
    this.arr = new int[1];
  }
  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.arr[0]++;
    }
  }

  public int[] getArr() {
    return this.arr;
  }


}
