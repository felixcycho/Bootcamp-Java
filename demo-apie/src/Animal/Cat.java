package src.Animal;

import java.util.Objects;

public class Cat extends Animal {    // Child (Cat), Parent (Animal)
  // A = Abstraction (Interface) 抽象化
  // P = Polymorphism 多形態
  // I = Inheritance 繼承
  // E = Encapsulation 封裝

  // Inherit
  // 1. Attributes
  // 2. Instance Methods
  private double weight;


  // Do not inherit.
  // 1. Constructor
  //    Need to set up Constuctor
  public Cat(String name, int age, double weight) {
    // New Java keyword: super
    super(name, age);    // Calling parent class (Animal) Constructor 
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

   // Child instance method call Parent instance method
  public int getAge() {
    System.out.println("Cat getAge");
    return super.getAge();
  }

  // Method Signature = method name + parameters
  // for Override, rule = method signature + return type
  @Override
  public boolean equals(Object obj) {
    // Step 1: Check if address are same
    if (this == obj) {
      return true;
    }
    // Step 2: if obj is not an Cat Object, return false.
    // ! instanceOf = asking if obj is an object of Cat
    if (!(obj instanceof Cat)) {
      return false;
    }
    // Step 3: Because obj MUST be a cat object, this becomes non-risky.
    Cat cat = (Cat) obj;
    // return Objects.equals(super.toString(), this.toString());
    return Objects.equals(super.getName(), cat.getName()) //
        && Objects.equals(super.getAge(), cat.getAge()) //
        && Objects.equals(this.weight, cat.getWeight());
        
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return super.getName().equals(cat.getName())  //
    //    && super.getAge() == cat.getAge()       //
    //    && this.weight == cat.getWeight();
  }
    
  @Override
  public String toString() {
    return "Cat (" //
      + "Animal = " + super.toString()    //
      + ", age = " + super.getAge()    //
      + ", weight = " + this.weight    //
      + ")";
  }

  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }
  
  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());

    System.out.println(c1);

  }

}
