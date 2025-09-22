interface Vegetarian {
  default public String eat() {
    return "[Vegetarian] I am able to eat";
  }  
}

interface Runner {
  default public String eat() {
    return "[Runner] I am able to eat.";
  }
}

class Animal {
  public String eat() {
    return "[Animal] I am able to eat.";
  }

}

class Pig extends Animal {
  public String eat() {
    return "[Pig] I am able to eat.";
  }
}

public class SmallPig extends Pig implements Vegetarian, Runner {
  public static void main(String[] args) {
    SmallPig smallPig = new SmallPig();
    System.out.println(smallPig.eat());        // [Pig] I am able to eat.

    // SmallPig mediumPig = new Animal();      // Compile error: 
                                                 // cannot convert from Animal to SmallPig
    // System.out.println(mediumPig.eat());

    // Animal bigPig = new SmallPig();
    // System.out.println(bigPig.eat());       // Runtime error: java.lang.NoSuchMethodError
  }
}
