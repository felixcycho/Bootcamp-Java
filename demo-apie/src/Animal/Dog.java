package src.Animal;

public class Dog extends Animal {

  private boolean isMale;
  
  public Dog(String name, int age, boolean isMale) {
    super(name, age);
    this.isMale = isMale;
  }

  // For Gender, only initial status has been set up in Constructor,
  // then no need to change gender subsequently.
  // Thus, no need to set Setter, may be just set Getter is OK.
  public boolean isMale() {
    return this.isMale;
  }

  public static void main(String[] args) {
    Dog d1 = new Dog("John", 3, false);
    Dog d2 = new Dog("Peter", 4, true);
    System.out.println(d1.isMale());



  }
}

