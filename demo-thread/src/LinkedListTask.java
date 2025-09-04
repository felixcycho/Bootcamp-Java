import java.util.LinkedList;
import java.util.List;

public class LinkedListTask implements Runnable{
  private List<Integer> integers;
  
  public LinkedListTask() {
    this.integers = new LinkedList<>();
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
