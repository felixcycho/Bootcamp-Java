package generic;

public abstract class Animal {
  private String name;
  private String species;

  public Animal (String species, String name) {
    this.name = name;
    this.species = species;
  }

  public String getName() {
    return this.name;
  }

  public String getSpecies() {
    return this.species;
  }

}
