// HKTV Mall
public class Customer {    // Customer is a Class.

  private Order[] orders;    // orders is an attribute.
  private String name;
  private String email;

  // Constructor; initial load
  // 適用於以後需要擴建的 array
  public Customer() {
    // ! initial load of creating object, 後續調整 array 更自動化人性化.
    this.orders = new Order[0];
  }

  
  // setter

  // getter

  public void add(Order newOrder) {


  }

  // method presentation 
  // -> totalPurchaseAmount()
  // -> if totalPurchaseAmount() >= 100000, --> VIP
  // -> isVIP()







  
}
