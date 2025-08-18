import java.math.BigDecimal;
import java.math.RoundingMode;

public class Human {
  // height, weight
  // BMI = weight / height ^ 2
  private double height;
  private double weight;

  public void setHeight(double height) {
    this.height = height;
  }

  public double getHeight() {
    return this.height;
  }

    public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getWeight() {
    return this.weight;
  }

  public double getBMI () {
    BigDecimal bd = BigDecimal.valueOf(this.height) 
                    .multiply(BigDecimal.valueOf(this.height));
    return BigDecimal.valueOf(this.weight) 
           .divide(bd, 2, RoundingMode.HALF_UP) 
           .doubleValue();
  }

  public double getBMI(int scale, RoundingMode roundingMode) {

    BigDecimal bd = BigDecimal.valueOf(this.height) //
                    .multiply(BigDecimal.valueOf(this.height));

    return BigDecimal.valueOf(this.weight) //
           .divide(bd, scale, roundingMode) //
           .doubleValue();
  }

  // Method: isOverweight, return boolean, BMI > 30
  public boolean isOverweight() {
    return this.getBMI() > 30;
  }


  public static void main(String[] args) {
    // Human Object
    // 70kg / 1.76m ^ 2
    // get BMI
    Human h1 = new Human();    // 上面 line 1 已經 define Human 是一個 Class.
    h1.setHeight(1.76);
    h1.setWeight(100);
    // System.out.println(h1.getBMI());
    System.out.println(h1.getBMI(3, RoundingMode.HALF_UP));    // 23.728

    if (h1.getBMI() > 30) {
      System.out.println("The person is overweight.");
    } else {
      System.out.println("The person is not overweight.");
    }
    if (h1.isOverweight()) {
      System.out.println("The person is overweight");
    } else {
      System.out.println("The person is not overweight.");
    }
  }
}
