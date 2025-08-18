import java.math.BigDecimal;

public class hktvItem {
  
  private double price;
  private int quantity;

  // method: presentation -> subtotal

  // empty constructor

  // Constructor
  // constructor has no return type, but method has return type.
  // constructor only has Class name, e.g. Item() is UpperCase I
  // empty constructor: No input parameter
  // By default, Java Class contains empty constructor (implicitly exists)
  public hktvItem() {

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

  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main (String[] args) {
    // ! "new" is calling constructor "Item()".
    hktvItem i1 = new hktvItem();
  }

}
