import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


public class DataStructureExercise1 {

  public static class Student {
    private int id;
    private String name;

    // constructor
    public Student (int id, String name) {
      this.id = id;
      this.name = name;
    }
    // getter, setter
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public void setName (String name) {
      this.name = name;
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.id, this.name);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Student)) return false;
      Student student = (Student) obj;
      return Objects.equals(this.id, student.getId())
          && Objects.equals(this.name, student.getName());
    }

    @Override
    public String toString() {
      return "Student ("
      + "id = " + this.id //
      + ", name = " + this.name //
      + ")";
    }
    
    // public static String findStudentById(List<Student> students, int id) {
    //   for (Student student : students) {
    //     if (student.id == id) {
    //       return student.name;
    //     } 
    //     break;
    //   }
    //   return "Student not found." ;
    // }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    // Exercise 1: Array List Basic Operations

    // 1a. Create an ArrayList of integers.
    List <Integer> integers = new ArrayList<Integer>();
    // 1b. Add the following numbers: 10, 20, 30, 40, and 50.
    integers.add(10);
    integers.add(20);
    integers.add(30);
    integers.add(40);
    integers.add(50);
    // 1c. Print all the elements in the list.
    System.out.println(integers);                              // [10, 20, 30, 40, 50]
    // 1d. Remove the number 30 from the list.
    // integers.remove(30);                                    // invalid, index(30)
    int index30 = integers.indexOf(30);
    if (index30 != -1) {
      integers.remove(index30);
    }
    
    // 1e. Print the size of the list.
    System.out.println(integers.size());                       // 4

    // Exercise 2: Search and Update

    // 2a. Create an ArrayList of strings to store names of fruits: 
    // "Apple", "Banana", "Mango", and "Orange".
    List<String> fruitNames = new ArrayList<String>();
    fruitNames.add("Apple");
    fruitNames.add("Banana");
    fruitNames.add("Mango");
    fruitNames.add("Orange");

    // 2b. Check if "Grapes" exists in the list.
    boolean containGrapes = fruitNames.contains("Grapes");
    System.out.println(containGrapes);                        // false
    // 2c. If it doesn’t exist, add it to the list.
    if (!containGrapes) {
      fruitNames.add("Grapes");
    }
    // 2d. Update "Mango" to "Peach".
    int indexMango = fruitNames.indexOf("Mango");
    if (indexMango != -1) {
      fruitNames.set(indexMango, "Peach");
    }
    // 2e. Print the final list.
    System.out.println(fruitNames);                          // [Apple, Banana, Peach, Orange, Grapes]

    // Exercise 3: Remove Duplicates

    // 3a. Create an ArrayList with the following numbers: 10, 20, 10, 30, 40, 20, 50.
    List<Integer> duplicateIntegers = new ArrayList<Integer>();
    duplicateIntegers.add(10);
    duplicateIntegers.add(20);
    duplicateIntegers.add(10);
    duplicateIntegers.add(30);
    duplicateIntegers.add(40);
    duplicateIntegers.add(20);
    duplicateIntegers.add(50);
    // 3b. Remove duplicates from the list using a HashSet.
    HashSet<Integer> integerHashSet = new HashSet<Integer>();
    for (int i = 0; i < duplicateIntegers.size(); i++) {
      integerHashSet.add(duplicateIntegers.get(i));
    }
    System.out.println(integerHashSet);                      // [50, 20, 40, 10, 30]
    // 3c. Print the list after removing duplicates.
    List<Integer> uniquIntegers 
      = new ArrayList<Integer>(integerHashSet);
    System.out.println(uniquIntegers);                       // [50, 20, 40, 10, 30]
    Collections.sort(uniquIntegers);
    System.out.println(uniquIntegers);                       // [10, 20, 30, 40, 50]

    // Exercise 4: HashSet Basic Operations

    // 4a. Create a HashSet of strings to store country names: "USA", "India", "China", "Japan".
    HashSet countryNames = new HashSet<String>();
    countryNames.add("USA");
    countryNames.add("India");
    countryNames.add("China");
    countryNames.add("Japan");
    // 4b. Add "Canada" to the set.
    countryNames.add("Canada");
    // 4c. Add "India" again. Print the result.
    System.out.println(countryNames.add("India"));             // false
    // 4d. Print all elements in the set.
    System.out.println(countryNames);

    // Exercise 5: Check the numbers

    // 5a. Create a HashSet of numbers: 1.1, 2.2, 3.3, 4.4, 5.5
    HashSet<Double> doublesHashSet = new HashSet<Double>();
    doublesHashSet.add(1.1);
    doublesHashSet.add(2.2);
    doublesHashSet.add(3.3);
    doublesHashSet.add(4.4);
    doublesHashSet.add(5.5);
    // 5b. Check if the set contains the number 3.3
    System.out.println(doublesHashSet.contains(3.3));
    // 5c. Remove the number 2.2 from the set.
    doublesHashSet.remove(2.2);

    // 5d. Print the size of the set.
    System.out.println(doublesHashSet.size());

    // Exercise 6: Intersection of Sets

    // 6a. Create two HashSets:
    // 6b. Set 1: 10, 20, 30, 40
    HashSet<Integer> tenMultipliers1 = new HashSet<Integer>();
    tenMultipliers1.add(10);
    tenMultipliers1.add(20);
    tenMultipliers1.add(30);
    tenMultipliers1.add(40);
    // 6c. Set 2: 30, 40, 50, 60
    HashSet<Integer> tenMultipliers2 = new HashSet<Integer>();
    tenMultipliers2.add(30);
    tenMultipliers2.add(40);
    tenMultipliers2.add(50);
    tenMultipliers2.add(60);
    // 6d. Find the common numbers of the two sets.
    // 6e. Print the resulting set.
    HashSet<Integer> commonNumbers = new HashSet<Integer> (tenMultipliers1);
    commonNumbers.retainAll(tenMultipliers2);
    System.out.println(commonNumbers);

    // Exercise 7: Convert HashSet to ArrayList

    // 7a. Create a HashSet with the following String: "Cherry", "Steve", "Chole", "Jenny", "Vicky".
    HashSet<String> personNamesSet = new HashSet<String>();
    personNamesSet.add("Cherry");
    personNamesSet.add("Steve");
    personNamesSet.add("Chole");
    personNamesSet.add("Jenny");
    personNamesSet.add("Vicky");
    // 7b. Convert the HashSet to an ArrayList.
    List<String> personNamesList = new ArrayList<String>(personNamesSet);
    // 7c. Print the converted list.
    System.out.println(personNamesList);

    // Exercise 8: ArrayList of Students
    // 8a. Create an ArrayList to store Student objects.
    List<Student> students = new ArrayList<Student>();
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    students.add(new Student(1, "Alice"));
    students.add(new Student(2, "Bob"));
    students.add(new Student(3, "Charlie"));
    // 8b. Iterate over the ArrayList and print each student's details.
    // System.out.println(students);
    for (Student student : students) {
      System.out.println(student);
    }
    // 8c. Remove the student Bob.
    boolean isStudentFound = false;
    System.out.println("Please enter student name to be removed: ");
    String studentNameRemoved = scanner.nextLine();
    for (Student student : students) {
      if (student.name.equals(studentNameRemoved)) {
        isStudentFound = true;
        students.remove(student);
        System.out.println(studentNameRemoved + " is removed.");
      } 
    }
    if (!isStudentFound) {
      System.out.println("Student " + studentNameRemoved + " not exist. Please input again.");
    }
    // 8d. Write a static method to search for a student by ID and return their name. If the student is
    // not found,
    // return "Student not found".
    // System.out.println("Searching for Student with ID 1: " + findStudentById(students, 1));
    // System.out.println("Searching for Student with ID 2: " + findStudentById(students, 2));
    System.out.println("Please enter student id for searching: ");
    int searchId = scanner.nextInt();
    String studentNameSearched = "Student not found.";
    for (Student student : students) {
      if (student.id == searchId) {
        studentNameSearched = student.name;
        break;
      }
    }
    System.out.println("Searching for Student with ID: " + searchId + " with " + studentNameSearched);

    // 8e. Create another ArrayList to store student with name starts with 'A'
    List<Student> studentsWithA = new ArrayList<Student>();
    for (Student student : students) {
      if (student.name.startsWith("A"))
        studentsWithA.add(student);
    }
    System.out.println(studentsWithA);

    // Exercise 9: HashSet of Students
    // 9a. Create two HashSets of Student objects:
    // Set 1: Alice (ID: 1), Bob (ID: 2), Charlie (ID: 3)
    HashSet<Student> studentsSet1 = new HashSet<Student>();
    studentsSet1.add(new Student(1, "Alice"));
    studentsSet1.add(new Student(2, "Bob"));
    studentsSet1.add(new Student(3, "Charlie"));
    // Set 2: Bob (ID: 2), Charlie (ID: 3), David (ID: 4)
    HashSet<Student> studentsSet2 = new HashSet<Student>();
    studentsSet2.add(new Student(2, "Bob"));
    studentsSet2.add(new Student(3, "Charlie"));
    studentsSet2.add(new Student(4, "David"));
    // 9b. Find the common students of the two sets
    // 9c. Print the result.
    HashSet<Student> commonStudents = new HashSet<Student> (studentsSet1);
    commonStudents.retainAll(studentsSet2);
    System.out.println(commonStudents);

    scanner.close();














  }
}
