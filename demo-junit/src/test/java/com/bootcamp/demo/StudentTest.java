package com.bootcamp.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

// Student depends on Calculator
@ExtendWith(MockitoExtension.class)
public class StudentTest {
  @Mock
  private MathOperation mathOperation;

  @Test
  void testStudent() {
    Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
    Mockito.when(mathOperation.operate(2,3)).thenReturn(100);
    // Start testing
    int actualResult = s1.operate(2, 3);
    Assertions.assertEquals(200, actualResult);

  }
  
}
