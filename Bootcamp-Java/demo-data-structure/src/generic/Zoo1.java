package generic;

import java.util.ArrayList;
import java.util.List;

// this Zoo1, 只可以放入任意動物 (i.e. Animal(tiger), Animal(lion), ...), 
  // 不能規限 zoo1 內再建立 pandaZoo, lionZoo, tigerZoo, ...
// 簡潔使用
public class Zoo1 {
  private List<Animal> animals;

  public Zoo1() {
    this.animals = new ArrayList<>();
  }

  public boolean add(Animal animal) {
    return this.animals.add(animal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Zoo1: ");
    if (animals.isEmpty()) {
      sb.append("No animals in Zoo.");
    } else {
        for (Animal animal : animals) {
          sb.append(animal.getSpecies()).append(" (").append(animal.getName()).append("), ");
        }
          sb.setLength(sb.length() - 2); // Remove the last comma and space
    }
      return sb.toString();
  }

}
