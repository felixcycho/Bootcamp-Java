// ! Bag<Object> vs. Bag<T>
// Bag<Object> means Bag has attribute Object.

public class Bag<T> {         // <T> stands for every type
  private T value;            // T, 用於千變萬化 object, e.g. bag 既可裝 balls, 又可裝 books.
  // class Team<T> --> List<T> heros --> compile time 決定 Team<Warrior>, Team<Archer>, Team<Mage>, 以至其他 Team<>
  // class Team --> List<Object> heros;  --> compile time 暫不決定任何 class, 待至 run time 才決定 object.

  public Bag(T value) {
    this.value = value;
  }

  // T is similar to object
  // T (not yet defined)
  // object (already defined)
  public T getValue() {
    return this.value;       // T cannot call compareTo()
  }

  public static void main(String[] args) {
    // ! During compile time, we have to define T.
    // ! Generic Class --> reduce number of classes in the system.
    // Bag<String> names = new Bag<>();           // invalid
    Bag<String> bag = new Bag<>("hello");
    Bag<Ball2> bag2 = new Bag<>(new Ball2(Color.BLUE, 3));

    StringBag bag3 = new StringBag();
    BallBag bag4 = new BallBag();

    // ! Bag attribute Object vs Bag<T>
    Bag<Object> magicBag = new Bag<>(new Passenger1(23));
    Bag<String> stringBag = new Bag<>("hello");
    Bag<Ball2> ballBag = new Bag<>(new Ball2(Color.BLUE, 3));

    Bag2 magicBag2 = new Bag2(new Passenger1(23));

  }
}
