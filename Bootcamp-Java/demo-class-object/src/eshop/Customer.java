// HKTV Mall
package eshop;

import java.math.BigDecimal;

// One to many
public class Customer {    // Customer is a Class.

  private Order[] orders;    // orders is an address.
  private int age;    // age is an address.

  // Constructor; initial load
  // 適用於以後需要擴建的 array
  public Customer() {
    // ! initial load of creating object, 後續調整 array 更自動化人性化.
    this.orders = new Order[0];    // new hktvOrder[0] is object.
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
  public void add(Order newOrder) {
    Order[] orders = new Order[this.orders.length + 1];
    for (int i = 0; i < this.orders.length; i++) {
      orders[i] = this.orders[i];
    }
    orders[orders.length - 1] = newOrder;
    this.orders = orders;
  }

    // getter
  public Order[] getOrders(){
    return orders;
  }

  // method presentation 
  // -> totalPurchaseAmount()
  public double totalPurchaseAmount() {
    BigDecimal sum = BigDecimal.ONE;
    for (Order order : this.orders) {
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
    // Customer A, Order 1 & 2
    // Customer B, Order 3
    Customer customerA = new Customer();
    Customer customerB = new Customer();
    Order order1 = new Order();
    Order order2 = new Order();
    Order order3 = new Order();
    
    customerA.add(order1);
    customerA.add(order2);
    customerB.add(order3);

    // and with some items...

    // Customer A --> isVip --> true
    // Customer B --> isVip --> false
    System.out.println("Customer A is " + customerA.isVip());
    System.out.println("Customer B is " + customerB.isVip());
    
  }
}
