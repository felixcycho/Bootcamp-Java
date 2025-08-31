package src.abstraction;

public class Dog extends Animal implements Survivable {

  // constructor
  public Dog(String species, String subSpecies, String name, String gender, int age) {
    // super(name);                 // invalid
    // super(gender);               // invalid
    super(species, subSpecies, name, gender, age);
  }

  @Override
  public void sleep() {
    System.out.println(super.getSubSpecies() + " " + super.getName() + " is sleeping.");
  }

  @Override
  public void eat() {
    System.out.println(super.getSubSpecies() + " " + super.getName() + " is eating.");
  }

  @Override
  public void drink() {
    System.out.println(super.getSubSpecies() + " " + super.getName() + " is drinking.");
  }

  public void run() {
    System.out.println(super.getSubSpecies() + " " + super.getName() + " is running.");
  }


  public static void main(String[] args) {

    Survivable[] survivals = new Survivable[3];
    survivals[0] = new Dog("Dog", "Alaskan Malamute", "Justin", "male", 4);
    survivals[1] = new Dog("Dog", "Golden Retriever", "Felix", "male", 3);
    survivals[2] = new Dog("Dog", "Husky", "Fucker", "female", 10);
    for (Survivable survival : survivals) {
      survival.drink();             // Survivable has drink().
      survival.eat();               // Survivable has eat().
      survival.sleep();             // Survivable has sleep().
      // survival.run();            // invalid, because Survivable does not have run().
    }

    Dog[] dogs = new Dog[3];
    dogs[0] = new Dog("Dog", "Alaskan Malamute", "Justin", "male", 4);
    dogs[1] = new Dog("Dog", "Golden Retriever", "Felix", "male", 3);
    dogs[2] = new Dog("Dog", "Husky", "Fucker", "male", 10);
    for (Dog dog : dogs) {
      dog.drink();             // Survivable has drink().
      dog.eat();               // Survivable has eat().
      dog.sleep();             // Survivable has sleep().
      dog.run();               // invalid, because Survivable does not have run().
    }

  }
  
}
