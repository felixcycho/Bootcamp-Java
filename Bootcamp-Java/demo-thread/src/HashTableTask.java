import java.util.Hashtable;
import java.util.Map;

public class HashTableTask implements Runnable {
  private Map<String, Integer> map;

  public HashTableTask() {
    this.map = new Hashtable<>();
  }

  @Override
  public void run() {
    // ! Now we need to lock getOrDefault() and put() together, for one thread.
    for (int i = 0; i < 10_000; i++) {
      int value = this.map.getOrDefault("apple", 0);      // key, 兩個 key 要一齊運行完, 才可到下一個 thread
      this.map.put("apple", value + 1);                   // key, 兩個 key 要一齊運行完, 才可到下一個 thread
    }
  }

  public Map<String, Integer> getMap() {
    return this.map;
  }

}
