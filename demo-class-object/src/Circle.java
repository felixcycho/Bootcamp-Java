import java.math.BigDecimal;
// ! Class Author (Circle Class)
// ! Class User (Circle Class, BigDecimal)
import java.math.RoundingMode;

public class Circle {
  // attribute: raw data (權衡 attribute, 視乎到底需否利用 this data 去運算)
  private double radius;    // (半徑)
  
  // We won't add diameter(直徑) as an attribute in Class Circle,
  // because the existing attribute (i.e. radius) can derive the new attribute.

  // ! Method: Presentation of existing attributes
  public double getDiameter() {
    // BigDecimal.valueOf(), 將 primitive 轉化成 BigDecimal.
    // BigDecimal 只可與 BigDecimal 進行數學運算, 不得與 Primitive 運算.
    // 先將 double value 轉化成 BigDecimal, 與其他 BigDecimal 進行運算.
    // 接著, 再將 BigDecimal 再轉化成 double value.
    BigDecimal.valueOf(this.radius).multiply(BigDecimal.valueOf(2.0)).doubleValue();
    return this.radius * 2;
  }
  
  public double getArea() {
    return BigDecimal.valueOf(this.radius)             
           .multiply(BigDecimal.valueOf(this.radius))  
           .multiply(BigDecimal.valueOf(Math.PI))      
           .setScale(2, RoundingMode.HALF_UP)          
           .doubleValue();
  }

  // setter
  public void setRadius(double radius) {    // 這個 radius 是 parameter 參數.
    this.radius = radius;    
  }

  // getter
  public double getRadius() {
    return this.radius;
  }

  public static void main(String[] args) {
    // create circle object
    // set radius 3.3
    // get radius 
    // get diameter
    // get area
    Circle c1 = new Circle();    // 上面 line 1 已經 define Circle 是一個 Class.
    c1.setRadius(3.3);
    System.out.println(c1.getRadius());
    System.out.println(c1.getDiameter());
    System.out.println(c1.getArea());

  }
}
