package com.bootcamp.demo;

// ! static import: copy all static method from Mochiko into StudentTest class.
// After static import, you no longer need to use static Mochiko call.
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class StudentTest1 {
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
    // Mockito.when(mathOperation.operate(2,3)).thenReturn(100);
    when(mathOperation.operate(2,3)).thenReturn(100);
    // Start testing
    int actualResult = s1.operate(2, 3);
    Assertions.assertEquals(200, actualResult);

    verify(mathOperation, times(1)).operate(2, 3);
  }
  
}

}
