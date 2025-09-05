import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class DemoLambda {
  public static void main(String[] args) {

    // ! Annoymous class approach
    // ! applicable to all interfaces, regardless of one method interfaces or multi-method interfaces.
    Eatable student = new Eatable() {
      @Override
      public void eat() {
        System.out.println("Human is able to eat ...");
      }
    };
    student.eat();


    // ! Lambda approach (starting from Java 8 (2014))
    // ! "()" :   Functional Interface method signature (i.e. eat()) 
    // ! "->" :   You are going to implement method content for eat() method
    // ! this approach is only for Functional Interface (one method interface).
    Eatable human = () -> {
      System.out.println("Human is able to eat ...");
    };
    human.eat();

    // ! Lambda Syntax
    // 1. Skip brackets when there is only one line of code.
    Eatable human2 = () -> System.out.println("Human is able to eat ...");
    human2.eat();

    MathOperation sumFormula = (x, y) -> x + y;        // 原本 define static method 需要預先在 Class define
                                                         // but, 自從有 Lambda, user 可 on demand 去 call over method.

    System.out.println(sumFormula.operate(10, 3));     // 13

    MathOperation subtractFormula = (x, y) -> x - y;
    System.out.println(subtractFormula.operate(7, 4));        // 3

    MathOperation maxFormula = (x, y) -> {
      if (x > y)
        return x;
      return y;
    };
    System.out.println(maxFormula.operate(7, 4));            // 7

    MathOperation minFormula = (x, y) -> x < y ? x : y;
    System.out.println(minFormula.operate(7, 4));            // 4

    MathOperation divideFormula = (x, y) -> x / y;
    System.out.println(divideFormula.operate(10, 3));                  // 3
    System.out.println((double)divideFormula.operate(10, 3));          // 3.0  (not 3.33)

    List<MathOperation> operations = new ArrayList<>();
    System.out.println(operations);

    // Java Built-in functional 
    // R apply(T t)
    // 1. Function (one input -> ont output)
    Function<String, Integer> stringLength = str -> str.length();
    System.out.println(stringLength.apply("hello"));                           // 5

    // 2. Function (two inputs -> one output)
    BiFunction<Integer, Integer, Integer> multiplyFormula = (x, y) -> x * y;
    System.out.println(multiplyFormula.apply(7, 4));                           // 28

    // 3. Consumer
    Consumer<String> stringPrinter = s -> System.out.println(s + " hello!");
    stringPrinter.accept("John");
    

  }
}
