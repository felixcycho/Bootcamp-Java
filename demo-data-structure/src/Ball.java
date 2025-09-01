import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue 需要有 Comparable<> 陪襯, 否則不能運行.
public class Ball implements Comparable<Ball> {
  private Color color;
  private int value;

  // constructor
  public Ball(Color color) {
    this.color = color;
  }

  // getter
  public Color getColor() {
    return this.color;
  }

  // BLUE --> RED --> YELLOW
  // ! this: -1, that: 1
  @Override                                              // Overrides public interface Comparable<T>
  public int compareTo(Ball ball) {                      // the definition of ordering of Ball
  //  return this.color.compareTo(ball.getColor());      // ! Ascending order   順方向
  //  return ball.getColor().compareTo(this.color);      // ! Descending order   逆方向
  if (this.color == Color.BLUE)
    return -1;
  if (ball.getColor() == Color.BLUE)
    return 1;
  if (this.color == Color.RED)
    return -1;
  if (ball.getColor() == Color.RED)
    return 1;
  return -1;
  }


  @Override
  public String toString() {
    return "Ball (" 
         + "color = " + this.color
         + ")";
  }


  public static void main(String[] args) {
    // final ordering: BLUE RED YELLOW
    System.out.println("BLUE".compareTo("RED"));             // -16
    System.out.println("BLUE".compareTo("YELLOW"));          // -23
    System.out.println("RED".compareTo("BLUE"));             // 16
    System.out.println("RED".compareTo("YELLOW"));           // -7
    System.out.println("YELLOW".compareTo("BLUE"));          // 23
    System.out.println("YELLOW".compareTo("RED"));           // 7

    Queue<Ball> balls = new PriorityQueue<>();
    balls.add(new Ball(Color.YELLOW));
    balls.add(new Ball(Color.BLUE));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.RED));
    balls.add(new Ball(Color.BLUE));
    while (!balls.isEmpty()) {
      System.out.println(balls.poll());                             // Ball (color = BLUE), ..., Ball (color = YELLOW) (vertical)
                                                                    // 四行亂碼 (if no toString())  
                                                                    // poll() --> compareTo()
    }






  }
}
