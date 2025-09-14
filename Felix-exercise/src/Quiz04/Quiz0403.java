import java.util.HashMap;
import java.util.Map;

public class Quiz0403 {
  static int hashCounter = 0;
  static Map<Integer, Animal>  hashMap = new HashMap<>();

  static class Animal {
    String name;

    Animal(String name) {
      this.name = name;
      hashCounter++;
    }

    String getName() {
      return this.name;
    }
  }

  public static void addAnimal(Animal animal) {
    hashMap.put(hashCounter, animal);
  }

  public static void main(String[] args) {
    
    addAnimal(new Animal("Yes"));
    addAnimal(new Animal("No"));
    addAnimal(new Animal("Yes"));
    addAnimal(new Animal("Nope"));

    hashMap.remove(3);
    System.out.println(hashMap.get(3).getName());        //NullPointerException, Map.get(Object) is null
  }
}
