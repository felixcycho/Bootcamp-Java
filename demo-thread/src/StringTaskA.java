public class StringTaskA implements Runnable {
  // private String str = null;        // if null, 出到 20004
  private String str = "";             // if "", 鐵定出到 20000

  @Override
  // null + "a"
  public synchronized void run() {      // synchronized, 可確保 thread safe
    for (int i = 0; i < 10_000; i++) {
      this.str += "a";
    }
  }

  public String getStr() {
    return this.str;
  }
  


}
