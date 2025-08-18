// HKTV Mall

import java.math.BigDecimal;

public class hktvCustomer {    // Customer is a Class.

  private hktvOrder[] orders;    // orders is an attribute.

  // Constructor; initial load
  // 適用於以後需要擴建的 array
  public hktvCustomer() {
    // ! initial load of creating object, 後續調整 array 更自動化人性化.
    this.orders = new hktvOrder[0];
  }
  
  // getter
  public hktvOrder[] getOrders(){
    return orders;
  }

  // setter
  public void add(hktvOrder newOrder) {
    hktvOrder[] orders = new hktvOrder[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = newOrder;
    this.orders = orders;
  }

  // method presentation 
  // -> totalPurchaseAmount()
  public double totalPurchaseAmount() {
    BigDecimal sum = BigDecimal.ONE;
    for (hktvOrder order : this.orders) {
      sum.add(BigDecimal.valueOf(order.total()));
    }
    return sum.doubleValue();
  }

  // method presentation
  // -> if totalPurchaseAmount() >= 100000, --> VIP
  // -> isVIP()
  public boolean isVip() {
    return this.totalPurchaseAmount() > 100_000;
  }

  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {
    // Customer A, Order A & B
    // Customer B, Order C
    hktvCustomer customerA = new hktvCustomer();
    customerA.add();
    customerA.add();

    hktvCustomer customerB = new hktvCustomer();
    customerB.add();

    // and with some items...

    // Customer A --> isVip --> true
    // Customer B --> isVip --> false
    System.out.println("Customer A is " + customerA.isVip());
    System.out.println("Customer B is " + customerB.isVip());
    
  }
}
