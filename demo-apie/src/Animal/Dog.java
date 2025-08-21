package src.Animal;

import java.util.Objects;

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

  @Override
  public boolean equals(Object obj) {
    // Step 1: Check if address are same
    if (this == obj) {
      return true;
    }
    // Step 2: if obj is not an Dog Object, return false.
    // ! instanceOf = asking if obj is an object of Dog
    if (!(obj instanceof Dog)) {
      return false;
    }
    // Step 3: Because obj MUST be a cat object, this becomes non-risky.
    Dog dog = (Dog) obj;
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    return super.getName().equals(dog.getName())  //
        && super.getAge() == dog.getAge()       // check String 是否相等, 需要用 .equal()
        && this.isMale == dog.isMale();
  }

  @Override
  public String toString() {
    return "Dog (" //
      + "Animal = " + super.toString()    //
      + ", age = " + super.getAge()    //
      + ", isMale = " + this.isMale    //
      + ")";
  }

  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.isMale, super.getAge(), super.getName());
  }
  

  public static void main(String[] args) {
    Dog d1 = new Dog("John", 3, false);
    Dog d2 = new Dog("Peter", 4, true);
    System.out.println(d1.isMale());

    System.out.println(d1);
    System.out.println(d2);
  }



  
}

