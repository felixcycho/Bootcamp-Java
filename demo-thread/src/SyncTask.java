public class SyncTask implements Runnable {
  private int x;

  @Override
  public synchronized void run() {
    for (int i = 0; i < 100_000; i++) {
      this.increment();
    }
  }

  public synchronized void increment() {
    this.x++;          // this.x++ 受 key 房保護, 限制只有一個 thread 進入 key 房, 執行 task.
                          // 以確保 memory 低耗損
  }

  public int getX() {
    return this.x;
  }
  
}
