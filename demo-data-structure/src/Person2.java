public class Person2 {

  // This method is faster than using ArrayList.
  // private Person2 person;          // Person 是 Class (Object), 而 person 則是 attribute.
  private String name;            // Person 指向 person, 亦指向 name.

  // constructor
  public Person2(String name) {
  //  this.person = person;
    this.name = name;
  }

  // getter
  // public Person2 getPerson() {
  //  return this.person;
  // }

  public String getName() {
    return this.name;
  }

  // setter (如果 developer 不打算更改 attributes, 則可以不寫 Setter)
  // public void setPerson(Person2 person) {
  //  this.person = person;
  // }

  // In this case, Person2 不打算改名.
  // public void setName(String name) {
  //  this.name = name;
  // }


}
