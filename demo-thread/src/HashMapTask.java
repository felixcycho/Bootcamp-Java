import java.util.HashMap;
import java.util.Map;

public class HashMapTask implements Runnable {
  private Map<String, Integer> map;

  public HashMapTask() {
    this.map = new HashMap<>();
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.map.put("apple", this.map.getOrDefault("apple", 0) + 1);
    }
  }

  public Map<String, Integer> getMap() {
    return this.map;
  }




}
