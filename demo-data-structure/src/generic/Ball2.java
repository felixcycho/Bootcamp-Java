package generic;

import java.util.PriorityQueue;
import java.util.Queue;

// PriorityQueue 需要有 Comparable<> 陪襯, 否則不能運行.
public class Ball2 implements Comparable<Ball2> {
  private Color color;
  private int value;

  // constructor
  public Ball2(Color color, int value) {
    this.color = color;
    this.value = value;
  }

  // getter
  public Color getColor() {
    return this.color;
  }

  public int getValue() {
    return this.value;
  }

  // Question 1:  BLUE --> RED --> YELLOW
  // Question 2:  YELLOW --> RED --> BLUE
  // Question 3:  RED --> YELLOW --> BLUE
  // ! this: -1, that: 1
  @Override                                              // Overrides public interface Comparable<T>
  public int compareTo(Ball2 ball) {                      // the definition of ordering of Ball2
  //  return this.color.compareTo(ball.getColor());      // ! Ascending order   順方向
  //  return ball.getColor().compareTo(this.color);      // ! Descending order   逆方向
    if (this.color == ball.getColor()) {
      if (this.value > ball.getValue()) {
        return -1;
        } else {
          return 1;
        }
    } 
    if (this.color == Color.RED) 
      return -1;
    if (ball.getColor() == Color.RED)
      return 1;
    if (this.color == Color.YELLOW)
      return -1;
    if (ball.getColor() == Color.YELLOW)
      return 1;
    return -1;
  }


  @Override
  public String toString() {
    return "Ball (" 
         + "color = " + this.color
         + ", value = " + this.value
         + ")";
  }


  public static void main(String[] args) {
    // final ordering: BLUE RED YELLOW
    System.out.println(new Ball2(Color.BLUE, 7).compareTo(new Ball2(Color.BLUE, 14)));             // 1
    System.out.println(new Ball2(Color.BLUE, 7).compareTo(new Ball2(Color.RED, 7)));               // 1
    System.out.println(new Ball2(Color.BLUE, 7).compareTo(new Ball2(Color.RED, 14)));              // 1
    System.out.println(new Ball2(Color.RED, 7).compareTo(new Ball2(Color.YELLOW, 7)));             // -1
    System.out.println(new Ball2(Color.YELLOW, 7).compareTo(new Ball2(Color.BLUE, 7)));            // -1

    Queue<Ball2> balls = new PriorityQueue<>();
    balls.add(new Ball2(Color.RED, 7));
    balls.add(new Ball2(Color.BLUE, 42));
    balls.add(new Ball2(Color.RED, 2));
    balls.add(new Ball2(Color.YELLOW, 29));
    balls.add(new Ball2(Color.YELLOW, 22));
    balls.add(new Ball2(Color.BLUE, 49));
    
    while (!balls.isEmpty()) {
      System.out.println(balls.poll());                      // Ball (color = BLUE), ..., Ball (color = YELLOW) (vertical)
                                                             // 四行亂碼 (if no toString())  
                                                             // poll() --> compareTo()
    }

  }
}

