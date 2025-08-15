import java.math.BigDecimal;

public class Item {
  
  private double price;
  private int quantity;

  // method: presentation -> subtotal

  // empty constructor

  // Constructor
  // constructor has no return type, but method has return type.
  // constructor only has Class name, e.g. Item() is UpperCase I
  // empty constructor: No input parameter
  // By default, Java Class contains empty constructor (implicitly exists)
  public Item() {

  }

  // setter
  public void setPrice(double price) {
    this.price = price;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public double subtotal() {
    return BigDecimal.valueOf(this.price) //
           .multiply(BigDecimal.valueOf(this.quantity))  //
           .doubleValue();
  }

  public static void main (String[] args) {
    
  }

}
