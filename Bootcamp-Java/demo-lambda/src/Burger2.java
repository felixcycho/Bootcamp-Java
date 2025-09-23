import java.util.Objects;

public class Burger2 {
  private String meat;
  private String cheese;
  // ...如果太多 attributes
  // ...
  // ...

  // private Burger(String meat, String cheese) {        
  // 如果 private Constructor, 一旦沒有 Builder, 則無法 new Object.
  //  this.meat = meat;
  //  this.cheese = cheese;
  // }

  public static Builder builder() {
    return new Builder();
  }

  private Burger2(Builder builder) {        // private constructor, 以限制 users 以 developer 的方針, 去 create Object.
  // 如果 private Constructor, 一旦沒有 Builder, 則無法 new Object.
    this.meat = builder.meat;
    this.cheese = builder.cheese;
  }

  // getter, without "get"
  public String getMeat() {
    return this.meat;
  }

  // getter, without "get"
  public String getCheese() {
    return this.cheese;
  }

  
  // ! Builder pattern
  public static class Builder {
    private String meat;
    private String cheese;

    // setter, without "set"
    public Builder meat(String meat) {
      this.meat = meat;
      return this;                       // ! 可 return this, 但不可 return super (Java 不承認 Parent 的地址)
    }

    // setter, without "set"
    public Builder cheese(String cheese) {
      this.cheese = cheese;
      return this;                       // ! 可 return this, 但不可 return super (Java 不承認 Parent 的地址)
    }

    public Burger2 build() {
    //  return new Burger(this.meat, this.cheese);
      return new Burger2(this);
    }

  }

  @Override
  public boolean equals(Object obj) {
    // Step 1: Check if address are same
    if (this == obj) {
      return true;
    }
    // Step 2: if obj is not a Square Object, return false.
    // ! instanceOf = asking if obj is an object of Square
    if (!(obj instanceof Burger2)) {
      return false;
    }
    // Step 3: Because obj MUST be a square object, this becomes non-risky.
    Burger2 otherBurger = (Burger2) obj;
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return Objects.equals(super.toString(), this.toString());
    return Objects.equals(this.meat, otherBurger.meat) //
        && Objects.equals(this.cheese, otherBurger.cheese);
        
    // Step 4: this.name is stored in Parent Class, thus use super to call name.
    // return super.getColor().equals(otherSquare.getColor())  //
    //     && this.length == otherSquare.getLength();
  }
    
  @Override    // Checking if your Parent Class has this method.
  public int hashCode() {
    return Objects.hash(this.meat, this.cheese);
  }

  // if lack of the following @Override, printout 會變亂碼.
  @Override
  public String toString() {
    return "Burger (" //
      + "meat = " + this.meat    //
      + ", cheese = " + this.cheese    //
      + ")";
   }
  

  public static void main(String[] args) {
    new Burger("ABC", "IJK");
    // ! If there are 10 attributes and 8 of them are null, 
      // it is hard to assign null/non-null value.
    new Burger(null, "IJK");
    new Burger("ABC", null);

  // ! builder pattern advantage:
    // avoid assigning null value during initial creation
  Burger2 b1 = Burger2.builder()                       // create Builder Object
    .meat("Wagyu A5 beef")
    .cheese("Hokkaido snow cheese")
    .build();        // ! create Burger Object
  
  Burger2 b2 = Burger2.builder()                       // create Builder Object
    .meat("Australian M5 beef")
    .build();

  Burger2 b3 = Burger2.builder()                       // create Builder Object
    .cheese("Buffalo cheese")
    .build();

  System.out.println(b1);
  System.out.println(b2);
  System.out.println(b3);

  }

}
