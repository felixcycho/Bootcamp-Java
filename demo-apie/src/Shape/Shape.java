package src.Shape;

public abstract class Shape {
  private String color;
  
  // method
  public abstract double area();    // ! abstract method: child class has to implement it.
  // because parent class has abstract method, @Override must be written in child class.

  // Constructor
  public Shape(String color) {
    this.color = color;
  }

  // Getter
  public String getColor() {
    return this.color;
  }

  // Setter
  public void setColor(String color) {
    this.color = color;
  }
  
}
