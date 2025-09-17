import java.util.Objects;

public class Cat1 extends Animal1 {    // Child (Cat), Parent (Animal)
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
  public Cat1(String name, int age, double weight) {
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
    // return this.age;           // invalid, age is invisible outside Parent class Animal.
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
    if (!(obj instanceof Cat1)) {
      return false;
    }
    // Step 3: Because obj MUST be a cat object, this becomes non-risky.
    Cat1 otherCat = (Cat1) obj;
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return Objects.equals(super.toString(), this.toString());
    return Objects.equals(super.getName(), otherCat.getName()) //
        && Objects.equals(super.getAge(), otherCat.getAge()) //
        && Objects.equals(this.weight, otherCat.getWeight());
        
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return super.getName().equals(otherCat.getName())  //
    //    && super.getAge() == otherCat.getAge()       //
    //    && this.weight == otherCat.getWeight();
  }
    
  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.weight, super.getAge(), super.getName());
  }

  // if lack of the following @Override, printout 會變亂碼.
  @Override
  public String toString() {
    return "Cat (" //
      + "Name = " + super.toString()    //
      + ", age = " + super.getAge()    //
      + ", weight = " + this.weight    //
      + ")";
    }
  
  public static void main(String[] args) {
    Cat1 c1 = new Cat1("John", 8, 4.5);
    System.out.println(c1.getAge());

    Cat1 c2 = new Cat1("Peter", 9, 5.5);
    System.out.println(c2.getAge());

    System.out.println(c1);
    System.out.println(c2);

    System.out.println(c1.intro());
    System.out.println(c2.intro());

    System.out.println(c1.toString());
    System.out.println(c2.toString());
  }

}
