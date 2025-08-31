package src.abstraction;

public abstract class Animal implements Survivable {
  private String name;
  private String gender;
  private String species;
  private String subSpecies;
  private int age;

  public Animal(String species, String subSpecies, String name, String gender, int age) {
    this.species = species;
    this.subSpecies = subSpecies;
    this.name = name;
    this.gender = gender;
    this.age = age;
  }

  public String getSpecies() {
    return this.species;
  }

  public String getSubSpecies() {
    return this.subSpecies;
  }

  public String getGender() {
    return this.gender;
  }

  public String getName() {
    return this.name;
  }

  public int getAge() {
    return this.age;
  }

}
