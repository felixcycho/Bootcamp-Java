import java.util.ArrayList;
import java.util.List;

public class ArrayListTask implements Runnable {
  private List<Integer> integers;
  
  public ArrayListTask() {
    this.integers = new ArrayList<>();
  }

  @Override
  public synchronized void run() {
    for (int i = 0; i < 10_000; i++) {
      this.integers.add(1);
    }
  }

  public List<Integer> getIntegers() {
    return this.integers;
  }

}
