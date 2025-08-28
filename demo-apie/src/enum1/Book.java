package src.enum1;

public class Book {
  private int id;
  private Color color;

  public Book(int id, Color color) {
    this.id = id;
    this.color = color;
  }

  public int getId() {
    return this.id;
  }

  public Color getColor() {
    return this.color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

}
