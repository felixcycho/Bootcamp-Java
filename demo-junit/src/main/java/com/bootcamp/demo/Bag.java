package com.bootcamp.demo;

import java.util.ArrayList;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

// @AllArgsConstructor  不可用
  // because encapsulation
    // 如果 developer 提供 parameter 予 constructor, 
      // 一旦 user 走去 create 一個 null object,
        // program 就即時發生 runtime error.
          // 所以, developer 應該將 constructor 進行 encapsulation (封裝).
@Getter
public class Bag {
  private List<Ball> balls;

  public Bag() {
    this.balls = new ArrayList<>();
  }

  public boolean add(Ball ball) {
    return this.balls.add(ball);     // NPE
  }

  @Getter
  @EqualsAndHashCode
  @ToString
  public static class Ball {
    private Color color;

    // ! the following three static methods:
      // to limit user must put color onto Ball object.
        // thus, prohibit user to add null object.
    public static Ball ofBlue() {
      return new Ball(Color.BLUE);
    }

    public static Ball ofRed() {
      return new Ball(Color.RED);
    }

    public static Ball ofYellow() {
      return new Ball(Color.YELLOW);
    }

    private Ball(Color color) {
      this.color = color;
    }

    @Getter
    public static enum Color {
      RED, BLUE, YELLOW,;
    }

  }
}
