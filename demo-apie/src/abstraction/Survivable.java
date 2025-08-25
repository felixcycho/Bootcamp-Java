package src.abstraction;


// ! "extends" --> Class extends Parent Class
// ! "extends" --> Interface extends Interface
public interface Survivable extends Eatable, Drinkable {
  void sleep();        // Of course, you may open a new interface "Sleepable.java"
}
