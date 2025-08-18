// HKTV Mall

import java.math.BigDecimal;

// One to many
public class hktvCustomer {    // Customer is a Class.

  private hktvOrder[] orders;    // orders is an address.
  private int age;    // age is an address.

  // Constructor; initial load
  // 適用於以後需要擴建的 array
  public hktvCustomer() {
    // ! initial load of creating object, 後續調整 array 更自動化人性化.
    this.orders = new hktvOrder[0];    // new hktvOrder[0] is object.
    // this.age = 0;
    // this.age is object. By default, except for array, all other objects by default 0.
    // 有 address, 無 object, programme 依然 void.
  }
  
  // setter
  // setter 功能, 就是防止 constructor array 被人破壞.
  // 一旦 setOrders(Order[] orders) 被人放入 Order[0], 則整條 array 被人破壞.
  // array 是 fixed length, 所以不能隨時更新 length, 繼而不斷 add new arrays.
  // array has no default value. 
  // Different from other variables (i.e. int), even though no value input, default 0.
  // But if no input to array, NULL (空氣).
  // 因此, add/remove method, 是用於合法更新.
  public void add(hktvOrder newOrder) {
    hktvOrder[] orders = new hktvOrder[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = newOrder;
    this.orders = orders;
  }

    // getter
  public hktvOrder[] getOrders(){
    return orders;
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
    customerA.add(orderA);
    customerA.add(orderB);

    hktvCustomer customerB = new hktvCustomer();
    customerB.add(orderC);

    // and with some items...

    // Customer A --> isVip --> true
    // Customer B --> isVip --> false
    System.out.println("Customer A is " + customerA.isVip());
    System.out.println("Customer B is " + customerB.isVip());
    
  }
}
