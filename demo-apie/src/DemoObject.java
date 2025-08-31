package src;

import java.math.BigDecimal;
import java.math.RoundingMode;
import src.Animal.Animal;
import src.Animal.Cat;
import src.Animal.Dog;
import src.Shape.Circle;
import src.Shape.Shape;
import src.Shape.Square;

// ! In Java, all classes by default implicitly extends Object.class
public class DemoObject {

  // Parent Class is needed, because 用於 Polymorphism.
  // Polymorphism 則用於封裝.
  // 封裝 (封裝有條件, 就是 Shape 不變, 則封裝不變)
  // The follows are Encapsulation (封裝)
  public static double totalArea(Shape[] shapes) {
    // if 沒有 Polymorphism, 則上述只能 Circle()
    BigDecimal totalArea = BigDecimal.ZERO;
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()).setScale(2, RoundingMode.HALF_UP));
    }
    return totalArea.doubleValue();
  }


  public static void main(String[] args) {
    // Object o1 = new Object();        // Object.class is a concrete class
    
    // ! In primitive world, Java helps conversion.
    int x = 3;    // int variable and int value
    long l = 3;   // long variable and int value

    // ! In Class (non-primitive) world, Java use Polymorphism
    // to explain reference and object.
    // Long l2 = new Integer(3);           // invalid,
    // ! Classes by default have no relationship with each others.

    Cat c1 = new Cat("Lucas", 10, 2.3);

    Animal a1 = new Cat("Leo", 3, 2.4);
    // Dog d1 = new Cat ("Vincent", 2.3, 1);     // invalid, because Dog has no relationship with Cat.
    // Even though both Dog and Cat are created by Animal.
    // Only Parent Class can create Child Object.
    System.out.println(a1.toString());
    System.out.println(a1.intro());
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    a1 = new Dog("Vincent", 2, true);
    System.out.println(a1.toString());
    System.out.println(a1.intro());    
    System.out.println(a1.getName());
    System.out.println(a1.getAge());

    // a1.getWeight();                // invalid, because 只可 call parent class method
    // a1.isMale();                   // invalid, because 只可 call parent class method

    // Object.class
    // Cat extends Animal, Animal extends Object.
    Object o1 = new Object();           // Object.class is a concrete class
    o1 = new Cat("Lucas", 2, 3.4);
    // Disadvantage:
    // o1 can only call Object's method.
    // o1.getName();        invalid, because Parent Class (i.e. Object class) does not have this method.
    // Cat c2 = o1;         invalid, because o1 is parent (i.e. Object class).
    // By default, Java disallow assigning o1 (Object object) to c2 (Cat type), too risky.
    // Solution:    Taking risk for conversion by Casting
    Cat c2 = (Cat) o1;       // 強行 assign, 有機會 down 機, 後果自負.
    System.out.println(c2.getName());          // Lucas

    Cat c3 = new Cat("Lucas", 2, 3.4);
    System.out.println(c2.equals(c3));        // true, because content (i.e. attributes) are same.
                                              // not necessary to ensure addresses are equal.
    System.out.println(c2 == c3);             // false, because different objects, thus different address.
    // False, because c2 and c3 are different Object, before rewriting equals() in Cat.class.
    // So, actually c2.equals(c3) is refering to Object.equals

    // True, after rewriting equals() in Cat.class
    System.out.println(c2.hashCode() == c3.hashCode());    // true, because rewriting hashCode
    System.out.println(c2 == c3);                          // false
    System.out.println(c2);         // Cat (Animal(name = Lucas, age = 2), weight = 3.4)
    System.out.println(c3);         // Cat (Animal(name = Lucas, age = 2), weight = 3.4)


    // ! Why do we need Parent Class.
    // 1. Inheritance -> Polymorphism -> Encapsulation (封裝)
    Shape s1 = new Circle(3.5, "RED");      // Polymorphism
    Shape s2 = new Square(8, "BLACK");      // Polymorphism
    Shape s3 = new Circle(4, "BLUE");       // Polymorphism

    // Parent Class 做 反向 control
    // Method Designer: Requires Object can do sth (i.e. area())
    // Method User: Use Child/Parent classes relationship to implement how to use method
    //              (i.e. how to calculate area)
    Shape[] shapes = new Shape[] {s1, s2, s3};
    System.out.println(totalArea(shapes));

    BigDecimal totalArea = BigDecimal.valueOf(0.0);
    for (int i = 0; i < shapes.length; i++) {
      totalArea = totalArea.add(BigDecimal.valueOf(shapes[i].area()).setScale(2, RoundingMode.HALF_UP));
    }
    System.out.println(totalArea.doubleValue());

    System.out.println(s1.toString());
    System.out.println(s2.toString());
    System.out.println(s3.toString());








  }


}
