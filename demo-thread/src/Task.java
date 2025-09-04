public class Task implements Runnable {
  private int x;

  // 通常, thread 常用於 high volume 的 transaction system.
  @Override
  public void run() {
    System.out.println("hello");
    for (int i = 0; i < 100_000; i++) {
      this.x++;
    }
  }

  public int getX() {
    return this.x;
  }

}
