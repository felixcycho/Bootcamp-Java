package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationTest {
  
  @Test
  void testOperation() {
    MathOperation sumFormula = (x, y) -> x + y;
    Assertions.assertEquals(5, sumFormula.operate(2, 3));
    Assertions.assertEquals(-4, sumFormula.operate(-7, 3));
  }
}
