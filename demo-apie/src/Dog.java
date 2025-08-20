package src;
public class Dog {

  private String name;
  private int age;
  private boolean isMale;
  
  public Dog(String name, int age, boolean isMale) {
    this.age = age;
    this.name = name;
    this.isMale = isMale;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  // For Gender, only initial status has been set up in Constructor,
  // then no need to change gender subsequently.
  // Thus, no need to set Setter, may be just set Getter is OK.
  public boolean isMale() {
    return this.isMale;
  }













}

