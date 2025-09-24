package com.bootcamp.demo;

public class Superman implements Flyable {
  // ! Superman have to override fly() method.
  @Override
  public void fly() {
    System.out.println("Superman is flying.");
  }

  // ! Optional to override swim() method, because swim() is a default method.
  @Override
  public void swim() {
    System.out.println("Superman is swimming.");
  }

  public static void main(String[] args) {
    Superman s1 = new Superman();
    s1.swim();                            // By default, I am able to swim.
    s1.fly();                             // Superman is flying.

    Flyable s2 = new Superman();          // ! Flyable --> swim()
    s2.swim();                            // By default, I am able to swim.
    s2.fly();                             // Superman is flying.

    Superman s3 = new Superman();
    s3.fly();

    Superman s4 = new Superman();
    s4.swim();


  }

}
