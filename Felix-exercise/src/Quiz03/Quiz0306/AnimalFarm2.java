class Animal2 {
    void eat() {
        System.out.println("[Animal] Eating something ...");
    }
}

class Cow2 extends Animal2 {
    void eat(String food) {
        System.out.println("[Cow] Eating " + food + " ...");
    }
}

public class AnimalFarm2 {
    public static void main(String[] args) {
        Animal2 cow = new Cow2();
        ((Cow2) cow).eat("grass");      // [Cow] Eating grass ...

        Animal2 cow2 = new Animal2();
        cow2.eat();                     // [Animal] Eating something ...
    }
}