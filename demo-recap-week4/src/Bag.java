import java.util.ArrayList;
import java.util.List;

public class Bag {
  private static final double FIXED_SIZE = 3.4;
  private static int idCounter = 0;

  private int id;
  private List<Ball> balls;

  public Bag() {
    this.id = ++idCounter;
    this.balls = new ArrayList<>();
  }

  public int getId() {
    return this.id;
  }

  public boolean add(Ball ball) {
    return this.balls.add(ball);
  }

  public double getSize() {
    return FIXED_SIZE;
  }

  public void clear() {
    this.balls.clear();
  }

  public int size() {
    return this.balls.size();
  }

  public void remove(Color ballColor) {
    // this.balls.remove(); // remove the first target ball
    List<Ball> newBalls = new ArrayList<>();
    for (int i = 0; i < this.balls.size(); i++) {
      if (this.balls.get(i).getColor() != ballColor) {
        newBalls.add(this.balls.get(i));
      }
    }
    this.balls = newBalls;
  }

}
