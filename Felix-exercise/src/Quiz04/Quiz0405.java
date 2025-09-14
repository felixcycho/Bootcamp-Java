import java.util.ArrayList;
import java.util.List;

class Solid {
  double weight;
}

class Good extends Solid {
  double price;
}

class SmartPhone extends Good {
  String model;
}

class Furniture extends Good {
  String color;
}

class Door extends Good {
  double height;
}

public class Quiz0405 {
  static List<Solid> cart = new ArrayList<>();

  public static <U extends Good> void addToCart(U item) {
    cart.add(item);
  }

  public static void main(String[] args) {
    addToCart(new Good(10.0, 10.0));
    addToCart(new SmartPhone(20.0, 20.0, "Galaxy"));
    // addToCart(new Solid());                 // compile error
    addToCart(new Door(30.0, 30.0, 30.0));
    addToCart(new Furniture(40.0, 40.0, "Red"));
  }
}