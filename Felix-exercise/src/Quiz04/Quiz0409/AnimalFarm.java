import java.util.ArrayList;
import java.util.List;

class Farm {

}

class Animal {
  private int age;

  public int getAge() {
    return this.age;
  }
}

class Pig extends Animal {

}

class AnimalFarm extends Farm {
  List<Animal> animals = new ArrayList<>();

  private void setAnimals (Animal pig) {
    this.animals.add(pig);
  }

  private List<Animal> getAnimals() {
    return this.animals;
  }

  public static void main(String[] args) {
    AnimalFarm animalFarm = new AnimalFarm();
    animalFarm.setAnimals(new Pig());
    for (Animal animal : animalFarm.getAnimals()) {
      System.out.println(animal.getAge());                // 0
    }
  }
  
}
