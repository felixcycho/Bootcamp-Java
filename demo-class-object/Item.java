import java.math.BigDecimal;

public class Item {
  
  private double price;
  private int quantity;

  // setter

  // getter

  // method: presentation -> subtotal

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
}
