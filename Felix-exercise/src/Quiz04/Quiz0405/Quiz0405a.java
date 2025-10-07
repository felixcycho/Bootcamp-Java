import java.util.ArrayList;
import java.util.List;

class Solid1 {
    double weight;

    Solid1(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Solid{" + "weight = " + weight + "}";
    }
}

class Good1 extends Solid1 {
    double price;

    Good1(double weight, double price) {
        super(weight);
        this.price = price;
    }

    @Override
    public String toString() {
        return "Good{" + "weight = " + weight + ", price = " + price + "}";
    }
}

class SmartPhone1 extends Good1 {
    String model;

    SmartPhone1(double weight, double price, String model) {
        super(weight, price);
        this.model = model;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "weight = " + weight + ", price = " + price + ", model = " + model + "}";
    }
}

class Furniture1 extends Good1 {
    String color;

    Furniture1(double weight, double price, String color) {
        super(weight, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Furniture{" + "weight = " + weight + ", price = " + price + ", color = " + color + "}";
    }
}

class Door1 extends Good1 {
    double height;

    Door1(double weight, double price, double height) {
        super(weight, price);
        this.height = height;
    }

    @Override
    public String toString() {
        return "Door{" + "weight = " + weight + ", price = " + price + ", height = " + height + "}";
    }
}

public class Quiz0405a {
    static List<Solid1> cart = new ArrayList<>();

    public static <U extends Good1> void addToCart(U item) {
    // public static void addToCart(Good item) {
        cart.add(item);
    }

    public static void main(String[] args) {
        // addToCart(new Solid1(10.0));                         // Still a compile error (Solid is not a Good)
        addToCart(new Good1(10.0, 10.0));                       // Now compiles
        addToCart(new SmartPhone1(20.0, 20.0, "Galaxy"));       // Now compiles
        addToCart(new Door1(30.0, 30.0, 30.0));                 // Now compiles
        addToCart(new Furniture1(40.0, 40.0, "Red"));           // Now compiles
        System.out.println(cart);
    }

    // public static void main(String[] args) {
    //     // addToCart(new Solid(10.0));                         // Still a compile error (Solid is not a Good)
    //     cart.add(new Good1(10.0, 10.0));                       // Now compiles
    //     cart.add(new SmartPhone1(20.0, 20.0, "Galaxy"));       // Now compiles
    //     cart.add(new Door1(30.0, 30.0, 30.0));                 // Now compiles
    //     cart.add(new Furniture1(40.0, 40.0, "Red"));           // Now compiles
    //     System.out.println(cart);
    // }
}