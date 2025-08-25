package src.abstraction;

// Class name "implements" Interface name
// Class Superman 履行 Flyable 合約.
// ! Interface control the child class method availability at compile time.

public class Superman extends Human implements Flyable, Eatable {
  // private String name;

  // public Superman(String name) {
  //  this.name = name;
  // }

  // public String getName() {
  //  return this.name;
  // }

  // Constructor
  public Superman(String name) {
    // New Java keyword: super
    super(name);    // Calling parent class (Human) Constructor 
  }

  // 1. Skill
  @ Override
  public void fly() {
    System.out.println("Superman " + super.getName() + " is flying.");      
    // because parent class has private its name.
    // Thus, child class cannot directly access to parent's name.
    // So, child class should super.getName() the parent's name.
  }
  @ Override
  public void eat() {
    System.out.println("Superman " + super.getName() + " is eating.");
  }

  public static void main (String[] args) {

    Superman s1 = new Superman("John");
    s1.fly();
    s1.eat();
    Superman s2 = new Superman("Lucas");
    s2.fly();
    s2.eat();







  }
}
