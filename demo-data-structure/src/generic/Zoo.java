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
  //  return -1;
    return zoo.animals.size();
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
  //  return Objects.hash(super.getAnimalSpecies(), super.getAnimalName());
    return Objects.hash(animals);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    // if (!(obj instanceof Animal)) return false;
    if (!(obj instanceof Zoo)) return false;          // check if obj is a Zoo
    //  Animal animal = (Animal) obj;
      Zoo<?> otherZoo = (Zoo<?>) obj;                 // cast to Zoo
    // return Objects.equals(super.species, animal.getAnimalSpecies())
    //     && Objects.equals(super.species, animal.getAnimalName());
    return Objects.equals(this.animals, otherZoo.animals);
  }

  @Override
  public String toString() {
    // return "Animal ("
    // + "species = " + super.getAnimalSpecies() //
    // + ", name = " + super.getAnimalName() //
    StringBuilder sb = new StringBuilder("Zoo: ");
    if (animals.isEmpty()) {
      sb.append("No animal in the zoo. ");
    } 
    else {
      for (T animal : animals) {
        sb.append(animal.getSpecies()).append(" (").append(animal.getName()).append("), ");
      }
    }
    sb.setLength(sb.length() - 2);        // Remove the last comma and space
    //  sb.append(".");
    return sb.toString();
  }
    

  public static void main(String[] args) {
    Zoo<Lion> lionZoo = new Zoo<>();
    lionZoo.add(new Lion("Lion", "John"));

    Zoo<Animal> animalZoo = new Zoo<>();
    animalZoo.add(new Lion("Lion", "Lucas"));

    // Zoo<T> zoo = new Zoo<>();           // cannot Zoo<T>
    // Zoo zoo = new Zoo();                // can run program, but not good expression
    Zoo<Animal> zoo = new Zoo<>();
    zoo.add(new Lion("Lion", "Jennie"));
    zoo.add(new Lion("Lion", "Steve"));
    zoo.add(new Tiger("Tiger", "Felix"));
    zoo.add(new Panda("Panda", "Candice"));

    Zoo1 zoo1 = new Zoo1();
    zoo1.add(new Lion("Lion", "Jennie"));
    zoo1.add(new Lion("Lion", "Steve"));

    System.out.println(lionZoo);          // Zoo: Lion (John)
    System.out.println(animalZoo);        // Zoo: Lion (Lucas)
    System.out.println(zoo);              // Zoo: Lion (Jennie), Lion (Steve), Tiger (Felix), Panda (Candice)
    System.out.println(zoo1);             // generic.Zoo1@8efb846 (without toString in Zoo1) /
                                             //  Zoo: Lion (Jennie), Lion (Steve) (with toString in Zoo1)

  }
  
}
