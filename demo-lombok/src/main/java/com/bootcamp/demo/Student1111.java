package com.bootcamp.demo;

public class Student1111 implements Readable1 {

  @Override
  public void read() {
    System.out.println("Student is reading.");
  }
  
  public static void main(String[] args) {
    // 1,000,000 lines for students.....
    System.out.println(Readable1.sum(3, 4));         // 7


  }

}
