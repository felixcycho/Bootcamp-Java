class Animal {
  void eat() {
    System.out.println("[Animal] Eating something ...");
  }
}

class Cow extends Animal {
  void eat(String food) {
    System.out.println("[Cow] Eating " + food + " ...");
  } 
}
public class AnimalFarm {
  public static void main(String[] args) {
    Animal cow = new Cow();
    cow.eat("something");                      // Compile error

    Animal cow2 = new Animal();
    cow2.eat("something");                     // Compile error
  }
}
