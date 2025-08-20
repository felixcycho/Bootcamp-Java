package src;
public class Animal {

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
    System.out.println("Animal getAge ")
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

}

