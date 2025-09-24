import java.util.List;
import java.util.Vector;

public class VectorTask implements Runnable {
  // Vector implements List
  private List<Integer> integers;

  public VectorTask() {
      this.integers = new Vector<>();
  }

  @Override
  public void run() {
    for (int i = 0; i < 10_000; i++) {
      this.integers.add(i);
    }
  }

  public List<Integer> getIntegers() {
    return this.integers;
  }

}
