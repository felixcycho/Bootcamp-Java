import java.util.LinkedList;
import java.util.List;

public class Bag {
  private List<Ball> balls;

  public Bag() {
    this.balls = new LinkedList<>();
  }

  public boolean add(Ball ball) {
    return this.balls.add(ball);
  }

  public static enum Color {
    RED, BLUE, YELLOW,;
  }

  public static class Ball {
    private Color color;

    public Ball(Color color) {
      this.color = color;
    }

  }

  public static void main(String[] args) {
    Bag b1 = new Bag();
    b1.add(new Ball(Bag.Color.RED));
    


  }

}
