import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    // 3. Consumer (1 input -> 0 output)
    Consumer<String> stringPrinter = s -> System.out.println(s + " hello!");
    stringPrinter.accept("John");
    
    // 4. BiConsumer
    BiConsumer<String, String> longerStringFormula = (s1, s2) -> {
      if (s1.length() > s2.length()) {
        System.out.println(s1);
        return;
      }
      System.out.println(s2);
    };
    longerStringFormula.accept("hello ", "Steven");

    // 5. Supplier (0 input -> 1 output)
    // Random number generator (1 - 100)
    // T get()
    // Supplier 作用, 就是將 static method 當作 variable 用. 否則, 需要另外再寫 static method.
    Supplier<Integer> randomNumberGenerator = () -> new Random().nextInt(100) + 1;      // (0 - 99) + 1
    System.out.println(randomNumberGenerator.get());

    // 6. Predicate (boolean formula)
    // age > 65
    // boolean test(T t);
    Predicate<Person> elderlyDefinition = p -> p.getAge() > 65;
    System.out.println(elderlyDefinition.test(new Person(66)));                      // true
    System.out.println(elderlyDefinition.test(new Person(65)));                      // false

    BiPredicate<Person, Person> bothElderly 
      = (p1, p2) -> elderlyDefinition.test(p1) && elderlyDefinition.test(p2);
    System.out.println(bothElderly.test(new Person(72), new Person(74)));            // true

  }

  public static int generateRandomNumber() {
    return new Random().nextInt(100) + 1;
  }

  public static class Person {
    private int age;

    public Person(int age) {
      this.age = age;
    }

    public int getAge() {
      return this.age;
    }
  }


}

