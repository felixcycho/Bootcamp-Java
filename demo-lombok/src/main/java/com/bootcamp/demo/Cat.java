package com.bootcamp.demo;

// import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

// @AllArgsConstructor           // ! because lombok --> all args (double weight)
@Getter                          // 
// @Setter
@ToString(callSuper = true, exclude = "height")
@EqualsAndHashCode(callSuper = true)      // if no this sentence, 則 cannot remove cat.

public class Cat extends Animal {
  @Setter    // ! weight has setter, but height has no setter
  private double weight;
  private double height;

  public Cat(int age, double weight, double height) {
    super(age);
    this.weight = weight;
    this.height = height;
  }

  // public Cat() {

  // }

  public static void main(String[] args) {
    Cat c1 = new Cat(10, 100.0, 2.8);
    Cat c2 = new Cat(10, 100.0, 2.8);
    Cat c3 = new Cat(11, 100.0, 2.8);

    System.out.println(c1);                     // Cat(super=Animal(age=10), weight=2.8)
    System.out.println(c1.equals(c2));          // true
    System.out.println(c1 == c2);               // false
    System.out.println(c1.equals(c3));          // false


  }







  
}
