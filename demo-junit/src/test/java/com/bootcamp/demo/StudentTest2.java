package com.bootcamp.demo;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

public class StudentTest2 {
   // Student depends on Calculator
@ExtendWith(MockitoExtension.class)
public class StudentTest {
  @Mock
  private MathOperation mathOperation;

  @InjectMocks
  private Student student;

  @Test
  void testStudentOperate1() {
    // Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
      // 鑑粗屈 result = 72
    Mockito.when(mathOperation.operate(2, 3)).thenReturn(72);
    // Start testing
    int actualResult = student.operate(2, 3);
    // result * result * x => 72 * 72 * 2 => 10368
    Assertions.assertEquals(10368, actualResult);
    // 限制 test 2 次
      // 1st time: 72 * 72 => 5184;  2nd time: 5184 * 2 => 10368
    verify(mathOperation, times(2)).operate(2, 3);

    // 這句限制 test 1 次
    // verify(mathOperation, times(1)).operate(2, 3);
    // verify(mathOperation, times(10)).operate(2, 3);

  }

  @Test
  void testStudentOperate2() {
    // Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
      // 鑑粗屈 return 是 60
    Mockito.when(mathOperation.operate(8, 3)).thenReturn(60);
    // Start testing
    int actualResult = student.operate(8, 3);
    // result(x, y) * x => 60 * 8 => 480
    Assertions.assertEquals(480, actualResult);
    // 1st time: 60 * 8 => 480
    verify(mathOperation, times(1)).operate(8, 3);

    // 這句限制 test 1 次
    // verify(mathOperation, times(1)).operate(2, 3);
    // verify(mathOperation, times(10)).operate(8, 3);

  }
  
}



}
