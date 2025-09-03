package generic;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// 如果沒有 <T>, 雖則我可不斷開立 different Classes (i.e. Panda Zoo, Lion Zoo, Tiger Zoo, ..., etc.)
  // but, this increases the number of classes, especially for future increase of species to Zoo.
    // Generic, 作用是擴張 Class 延伸性.
public class Zoo<T extends Animal> {
  private List<T> animals;

  public Zoo() {
    this.animals = new ArrayList<>();
  }

  public boolean add(T animal) {
    return this.animals.add(animal);
  }

  // static method cannot have relationship with Class method.
  // public static int countAnimal(Zoo<T> zoo) {
    // T has red underline.
  public static <T extends Animal> int countAnimal(Zoo<T> zoo) {
    return -1;
  }

  public static <T extends Animal> String getAnimalSpecies(T animal) {
    return animal.getSpecies();
  }

  // ! static method generic type has NO relationship with Class generic type.
  // ! Either use T or U is not problem, just a word. Maybe you can use A, B, C...
  public static <U extends Animal> String getAnimalName(U animal) {
    return animal.getName();
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.getAnimalSpecies(), super.getAnimalName());
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof Animal)) return false;
      Animal animal = (Animal) obj;
    return Objects.equals(super.species, animal.getAnimalSpecies())
        && Objects.equals(super.species, animal.getAnimalName());
  }

  @Override
  public String toString() {
    return "Animal ("
    + "species = " + super.getAnimalSpecies() //
    + ", name = " + super.getAnimalName() //
    + ")";
  }
    

  public static void main(String[] args) {
    Zoo<Lion> lionZoo = new Zoo<>();
    lionZoo.add(new Lion("Lion", "John"));

    Zoo<Animal> animalZoo = new Zoo<>();
    animalZoo.add(new Lion("Lion", "Lucas"));

    Zoo1 zoo = new Zoo1();
    zoo.add(new Lion("Lion", "Jennie"));
    zoo.add(new Lion("Lion", "Steve"));

    System.out.println(lionZoo);
    System.out.println(animalZoo);
    System.out.println(zoo);

  }
  
}
