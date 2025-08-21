package src.Animal;
public abstract class Animal {     // abstract 代表 虛構, 所以不能 add new Object.

// ! Abstract class
// 1. can be extended
// 2. with Constructor (for inheritance)
// 3. We don't have Animal Object in the world.
// 4. We cannot create new Object in Abstract class.
// 5. with Attribute & instance method
// 6. with abstract method OR concrete method

// ! Class
// 1. can be extended
// 2. with Constructor (for creation of new Object)
// 3. for creating new Object
// 4. with Attribute & instance method
// 5. with concrete method ONLY

  private String name;
  private int age;
  
  public Animal(String name, int age) {
    this.age = age;
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    System.out.println("Animal getAge ");
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String intro() {
    return "This is " + this.name + ", and " + this.age + " years old.";
  }

  // 緊記, Parent Class 一樣要 @Override, 否則會影響 Child Classes.
  @Override
  public String toString() {
    return "("     //
      + "name = " + this.name    //
      + ", weight = " + this.age    //
      + ")";
  }
  // public static void main(String[] args) {
  //   new Animal ("John", 3);
  // }
}

