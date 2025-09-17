package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Student2aTest {
  @Mock
  private SumCalculator sumCalculator;

  @InjectMocks
  private Student student;

  @Test
  void testStudentOperate() {
    // Assumption
    when(sumCalculator.operate(3, 7)).thenReturn(100);
    // Test Case
    int actualResult = student.operate(3, 4);
    assertEquals(400, actualResult);
    verify(sumCalculator, times(1)).operate(3, 7);
  }
}
