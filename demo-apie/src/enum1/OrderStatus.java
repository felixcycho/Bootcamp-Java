// enum has sequence.
public enum OrderStatus {
  PAID(1), PREPARING(2), DELIVERING(3), DELIVERED(4), CANCELLED(99);

  private int value;

  // ! enum constructor --> private
  private OrderStatus(int value) {
    this.value = value;
  }

  // Java Virtual Machine creates enum object by constructor.
  // I, as a developer, cannot create enum object by constructor.

  public int getValue() {
    return this.value;
  }

  public static OrderStatus valueOf(int value) {
    for (OrderStatus o : OrderStatus.values()) {
      if(o.getValue() == value) 
        return o;
    }
    return null;
  }

  public OrderStatus next() {
    return OrderStatus.valueOf(this.value + 1);
  }

  public OrderStatus cancel() {
    if (this.value >= PREPARING.getValue()) {
      System.out.println("The order has been processing. Cancellation is prohibited.");
      return OrderStatus.valueOf(this.value);
    } else {
      return OrderStatus.valueOf(99);
    }
  }

  // ! OrderStatus.values() --> return all enum values
  
}
