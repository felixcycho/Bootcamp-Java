public interface Flyable {
  void fly();
  // ! Traditionally, we create a class to create an object with fly() method.

  public static void main(String[] args) {
    Flyable superman = new Flyable() {          
    // 原則上, Interface 不可 new, 但這種例外, 於 runtime 去 define a object.
      @Override
      public void fly() {
        System.out.println("Superman is flying ...");
      }
    };
    superman.fly();         // 原則上, 開 Class 才可開 Object.
                            // 但這種情況底下, 可以不開 Class 依然去 define Object, 以指針指向 Interface.

    Flyable superwoman = new Flyable() {          
      @Override
      public void fly() {
        System.out.println("Superwoman is flying ...");
      }
    };
    superwoman.fly();   
    
    superman = new Bird();
    superman.fly();



  }
  
}
