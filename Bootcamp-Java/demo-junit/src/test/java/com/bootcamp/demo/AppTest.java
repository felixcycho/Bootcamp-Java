package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**App
 * Unit test for simple App.
 */
public class AppTest {

  // ! "mvn clean test" --> execute @Test methods
  // if any assertions fail, that means test case fail.
  @Test
  void testSum() {
    long actualResult = App.sum(3, 4);
    Assertions.assertEquals(7, actualResult);
    long actualResult2 = App.sum(9, -1);
    Assertions.assertEquals(8, actualResult2);

    // 2.1 billion + 2.1 billion => 4.2 billion
  }

  @Test
  void testGetLength() {

    Assertions.assertEquals(5, App.getLength("hello"));
    Assertions.assertEquals(0, App.getLength(null));
  }


  
}
