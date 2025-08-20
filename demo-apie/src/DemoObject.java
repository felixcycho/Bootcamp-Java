package src;

import java.math.BigDecimal;
import src.Animal.Animal;
import src.Animal.Cat;
import src.Animal.Dog;
import src.Shape.Circle;
import src.Shape.Shape;
import src.Shape.Square;

// ! In Java, all classes by default implicitly extends Object.class
public class DemoObject {

  public static void main(String[] args) {
    Object o1 = new Object();        // Object.class is a concrete class
    
    // ! In primitive world, Java helps conversion.
    int x = 3;    // int variable and int value
    long l = 3;   // long variable and int value

    // ! In Class (non-primitive) world, Java use Polymorphism
    // to explain reference and object.
    // Long l2 = new Integer(3);           // invalid,
    // ! Classes by default have no relationship with each others.

    Cat c1 = new Cat("Lucas", 10, 2.3);

    Animal a1 = new Cat("Leo", 3, 2.4);
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    a1 = new Dog("Vincent", 2, true);
    System.out.println(a1.intro());    
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    // a1.getWeight();                // invalid, because 只可 call parent class method
    // a1.isMale();                   // invalid, because 只可 call parent class method

    Shape s1 = new Circle(3.5, "RED");
    Shape s2 = new Square(8, "BLACK");
    Shape s3 = new Circle(4, "BLUE");

    // Parent Class 做 反向 control
    // Method Designer: Requires Object can do sth (i.e. area())
    // Method User: Use Child/Parent classes relationship to implement how to use method
    //              (i.e. how to calculate area)
    Shape[] shapes = new Shape[] {s1, s2, s3};
    System.out.println(totalArea(shapes));

    BigDecimal totalArea = BigDecimal.valueOf(0.0);
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
    }
    System.out.println(totalArea.doubleValue());
  }

  public static double totalArea(Shape[] shapes) {
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()));
    }
    return totalArea.doubleValue();
  
  }
}
