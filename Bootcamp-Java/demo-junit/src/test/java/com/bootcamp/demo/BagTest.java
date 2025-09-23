package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.MatcherAssert.*;
import org.junit.jupiter.api.Test;
import com.bootcamp.demo.Bag.Ball;

public class BagTest {
  
  @Test
  void testBagCreation() {
    Bag b1 = new Bag();
    assertEquals(0, b1.getBalls().size());
      // 0 是 size
  }

  @Test
  void testAdd() {
    Bag b1 = new Bag();
    b1.add(Ball.ofBlue());
    b1.add(Ball.ofYellow());
    // b1.add(Ball.ofRed());                                 // even though red() is added, no effect on following results
    assertEquals(2, b1.getBalls().size());                   // size() = 2
    
    // MatcherAssert.assertThat(null, false);
      // if import without static
    // ! Hamcrest
    assertThat(b1.getBalls(), hasItem(Ball.ofYellow()));     // for loop
    assertThat(b1.getBalls(), not(hasItem(Ball.ofRed())));   
    assertThat(b1.getBalls(), hasItems(Ball.ofBlue(), Ball.ofYellow()));
    // ! hasItems --> similar to containsInAnyOrder()
    assertThat(b1.getBalls(), hasItems(Ball.ofYellow(), Ball.ofBlue()));
    assertThat(b1.getBalls(), hasSize(2));
    // ! contains() (check with order)
    assertThat(b1.getBalls(), contains(Ball.ofBlue(), Ball.ofYellow()));
    // ! not(contains())  (check with converse order)
    assertThat(b1.getBalls(), not(contains(Ball.ofYellow(), Ball.ofBlue())));
    // ! containsInAnyOrder()
    assertThat(b1.getBalls(), containsInAnyOrder(Ball.ofYellow(), Ball.ofBlue()));



  }




}
