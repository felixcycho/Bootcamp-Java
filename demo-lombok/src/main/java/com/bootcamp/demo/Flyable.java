package com.bootcamp.demo;

public interface Flyable {
  // abstract method, must be implemented by class.
  void fly();

  // after Java 8 --> default method in interface.
  // concrete method
    // maybe, Class is entitled not to implement concrete method.
  default void swim() {
    System.out.println("By default, I am able to swim.");
  }
}
