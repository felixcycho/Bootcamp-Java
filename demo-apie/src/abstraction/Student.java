package src.abstraction;

public class Student extends Human implements Eatable {

  // Constructor
  public Student(String name) {
    // New Java keyword: super
    super(name);    // Calling parent class (Human) Constructor 
  }

  @ Override
  public void eat() {
    System.out.println("Student " + super.getName() + " is eating.");
  }
  
}
