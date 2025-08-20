package src;
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

  public static void main(String[] args) {
    Cat c1 = new Cat("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat c2 = new Cat("Peter", 9, 5.5);
    System.out.println(c2.getAge());
  }

}
