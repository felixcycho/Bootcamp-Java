package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

// import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

// ! TestFile = Test Environment
public class HamcrestTest {
  // ! Test List
  @Test
  void testCalculator() {
    String actualResult = "hello";
    // ! Junit 5
    // Assertions.assertEquals("hello", actualResult);
      // if import without static
    assertEquals("hello", actualResult);
    // ! Hamcrest
    // MatcherAssert.assertThat(actualResult, Matchers.equalTo("hello"));
      // if import without static
    assertThat(actualResult, is(equalTo("hello")));

    Calculator c1 = new Calculator();
    assertThat(c1.sum(10, 4), is(equalTo(14)));
    
  }
    
}
