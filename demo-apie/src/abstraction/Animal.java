package src.abstraction;

public class Animal implements Survivable {

  @Override
  public void sleep() {

  }

  @Override
  public void eat() {

  }

  @Override
  public void drink() {

  }

  public void run() {

  }


  public static void main(String[] args) {
    Survivable[] animals = new Survivable[3];
    for (Survivable animal : animals) {
      animal.drink();             // Survivable has drink().
      animal.eat();               // Survivable has eat().
      animal.sleep();             // Survivable has sleep().
    //  animal.run();             invalid, because Survivable does not have run().

    }
  }
}
