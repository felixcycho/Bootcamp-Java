import java.util.Objects;

public class Car {
  private int capacity;
  private Color color;

  // constructor
  // public Car() {}

  public Car(Color color, int capacity) {
    this.color = color;
    this.capacity = capacity;
  }

  // ! Basic Instance methods:
  // getter, setter ..
  public int getCapacity() {
    return this.capacity;
  }

  public Color getColor() {
    return this.color;
  }

  // public void setCapacity(int capacity) {
  // this.capacity = capacity;
  // }

  // equals, hashCode, toString
  @Override
  public int hashCode() {
    return Objects.hash(this.color, this.capacity);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (!(o instanceof Car))
      return false;
    Car car = (Car) o;
    return Objects.equals(this.color, car.getColor()) //
        && Objects.equals(this.capacity, car.getCapacity());
  }

  @Override
  public String toString() {
    return "Car(" //
      + "capacity=" + this.capacity //
      + ",color=" + this.color //
      + ")";
  }
}
