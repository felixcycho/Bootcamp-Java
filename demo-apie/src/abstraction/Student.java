package src.abstraction;

public class Student extends Human {
// or instead, public class Student extends Human implements Eatable {        is also OK.
// because Human also has skill eat().
// Once if child class Student extends parent class Human, no matter if "implements Eatable" written, is OK.

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
