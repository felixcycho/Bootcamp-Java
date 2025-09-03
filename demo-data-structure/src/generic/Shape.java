package generic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

// interface 不得有 attribute
// abstract class (i.e. parent class) 可以有 attribute
// e.g. Noun 不建議作為 Interface
// e.g. Interface 建議用 verb 去 define
// 要 extend abstract class, 則必需能 implement abstract class' abstract method.
// in this case, 如果 cannot compute area, 則 cannot extend abstract class Shape.
public abstract class Shape {
  abstract double area();

  // 指針必須指向 Shape, 不得指向 neither Circle nor Square.
  // 指針可以指向 Shape, 再由 Shape 指向 Circle.
  // 因此, T 只可放入 List<Shape>, 不得放入 List<Circle> nor List<Square>.
  public static double totalArea(List<Shape> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  // 用於 control (or even expand) T 的指針範圍, by compile time.
  // T 增加靈活性
  public static <T extends Shape> double totalArea2(List<T> shapes) {
    BigDecimal total = BigDecimal.ZERO;
    for (Shape shape : shapes) {
      total = total.add(BigDecimal.valueOf(shape.area()));
    }
    return total.doubleValue();
  }

  public static void main(String[] args) {
    List<Circle> circles = new ArrayList<>();
    circles.add(new Circle(3));
    circles.add(new Circle(4));
    // totalArea(circles);        
      // ! invalid, because List<Shape> has no relationship with List<Circle> nor List<Square>

    totalArea2(circles);
  }

  
}
