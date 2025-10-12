class Animal1 {
    void eat() {
        System.out.println("[Animal] Eating something ...");
    }
}

class Cow1 extends Animal1 {
    @Override
    void eat() {
        System.out.println("[Cow] Eating something specific ...");
    }

    void eat(String food) {
        System.out.println("[Cow] Eating " + food + " ...");
    }
}

public class AnimalFarm1 {
    public static void main(String[] args) {
        Cow1 cow = new Cow1();
        cow.eat("grass");                  // [Cow] Eating grass ...

        Animal1 cow2 = new Cow1();
        cow2.eat();                        // [Cow] Eating something specific ...
    }
}