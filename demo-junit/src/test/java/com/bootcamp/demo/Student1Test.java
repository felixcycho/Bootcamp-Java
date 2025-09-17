package com.bootcamp.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
// ! static import: copy all static method from Mochiko into StudentTest class.
// After static import, you no longer need to use static Mochiko call.
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class Student1Test {
  // Student depends on Calculator

  @Mock
  private MathOperation mathOperation;

  @InjectMocks
  private Student student;


  // ! You don't need to write this main(), because the framework generates it for you.
  public static void main(String[] args) {
    Student1Test st1 = new Student1Test();
    st1.testStudentOperate1();
    st1.testStudentOperate2();
  }

  // ! assertfEquals: usually for raw types only: Primitives, Wrapper Class, String
  @Test
  void testStudentOperate1() {
    Student s1 = new Student("John", mathOperation);
    // test getter, setter

    // Assumption
    // ! Day 1
    //   Mockito.when(mathOperation.operate(2,3)).thenReturn(100);
    when(mathOperation.operate(2,6)).thenReturn(100);
    // Start testing
    int actualResult = s1.operate(2, 3);
    Assertions.assertEquals(300, actualResult);          // ! object --> equals()

    verify(mathOperation, times(1)).operate(2, 6);
  }

  @Test
  void testStudentOperate2() {
    // Student s1 = new Student("John", mathOperation);
    // Assumption
    when(mathOperation.operate(8, 5)).thenReturn(60);
    // Start Testing
    int actualResult = student.operate(8, 3);
    assertEquals(480, actualResult);
    verify(mathOperation, times(1)).operate(8, 5);
  }
  
}


