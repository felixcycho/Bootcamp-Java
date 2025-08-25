package src.abstraction;

// ! abstract class implement abstract method.
public abstract class Human implements Eatable {
  private String name;

  public Human(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }



  
}
