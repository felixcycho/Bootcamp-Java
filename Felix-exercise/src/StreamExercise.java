import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamExercise {

  // if public class Student 另外 java sheet 再開, 則不用 static.
  // 否則, if public class Student 在 main method 同一張 sheet 開, 則要 static.
  public static class Student {
    private String name;
    private int score;

    public Student (String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setScore(int score) {
      this.score = score;
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.score);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Student)) return false;
      Student student = (Student) obj;
      return Objects.equals(this.name, student.getName())
          && Objects.equals(this.score, student.getScore());
    }

    @Override
    public String toString() {
      return "Student ("
      + "name = " + this.name //
      + ", score = " + this.score //
      + ")";
    }

  }

  public static class Employee {
    private String name;
    private double salary;

    public Employee (String name, double salary) {
      this.name = name;
      this.salary = salary;
    }

    public String getName() {
      return this.name;
    }

    public double getSalary() {
      return this.salary;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setSalary(double salary) {
      this.salary = salary;
    }
    
    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.salary);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Employee)) return false;
      Employee employee = (Employee) obj;
      return Objects.equals(this.name, employee.getName())
          && Objects.equals(this.salary, employee.getSalary());
    }

    @Override
    public String toString() {
      return "Employee ("
      + "name = " + this.name //
      + ", salary = " + this.salary //
      + ")";
    }

  }

  public static class Person {
    private String name;
    private int age;

    public Person (String name, int age) {
      this.name = name;
      this.age = age;
    }

    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setAge(int age) {
      this.age = age;
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.age);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Person)) return false;
      Person person = (Person) obj;
      return Objects.equals(this.name, person.getName())
          && Objects.equals(this.age, person.getAge());
    }

    @Override
    public String toString() {
      return "Person ("
      + "name = " + this.name //
      + ", age = " + this.age //
      + ")";
    }

  }

  public static enum Gender {
    MALE,  FEMALE;
  }

  public static class Staff {
    private String name;
    private Gender gender;

    public Staff(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return this.name;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setName(String name) {
      this.name = name;
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.gender);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Staff)) return false;
      Staff staff = (Staff) obj;
      return Objects.equals(this.name, staff.getName())
          && Objects.equals(this.gender, staff.getGender());
    }

    @Override
    public String toString() {
      return "Staff ("
      + "name = " + this.name //
      + ", gender = " + this.gender //
      + ")";
    }
  }

  
  public static class Product {
    private String item;
    private int quantity;
    private double price;

    public Product (String item, int quantity, double price) {
      this.item = item;
      this.quantity = quantity;
      this.price = price;
    }

    public String getItem() {
      return this.item;
    }

    public int getQuantity() {
      return this.quantity;
    }

    public double getPrice() {
      return this.price;
    }

    public void setPrice(int price) {
      this.price = price;
    }

    public double getAmount() {
        return quantity * price; // Calculate the amount for this product stocked
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.item, this.quantity, this.price);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Product)) return false;
      Product product = (Product) obj;
      return Objects.equals(this.item, product.getItem())
          && Objects.equals(this.quantity, product.getQuantity())
          && Objects.equals(this.price, product.getPrice());
    }

    @Override
    public String toString() {
      return "Product ("
      + "item = " + this.item //
      + ", quantity = " + this.quantity //
      + ", price = " + this.price //
      + ")";
    }

  }

  
  public static class Worker {
    private String name;
    private String department;

    public Worker (String name, String department) {
      this.name = name;
      this.department = department;
    }

    public String getName() {
      return this.name;
    }

    public String getDepartment() {
      return this.department;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setDepartment (String department) {
      this.department = department;
    }
    
    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.department);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Worker)) return false;
      Worker worker = (Worker) obj;
      return Objects.equals(this.name, worker.getName())
          && Objects.equals(this.department, worker.getDepartment());
    }

    @Override
    public String toString() {
      return "Worker ("
      + "name = " + this.name //
      + ", department = " + this.department //
      + ")";
    }

  }

  public static class Children {
    private String name;
    private int score;

    public Children (String name, int score) {
      this.name = name;
      this.score = score;
    }

    public String getName() {
      return this.name;
    }

    public int getScore() {
      return this.score;
    }

    public void setName(String name) {
      this.name = name;
    }

    public void setScore(int score) {
      this.score = score;
    }

    public boolean isPassed() {
      return this.score >= 50;
    }

    @Override
    public int hashCode() {
    return Objects.hash(this.name, this.score);
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (!(obj instanceof Children)) return false;
      Children children = (Children) obj;
      return Objects.equals(this.name, children.getName())
          && Objects.equals(this.score, children.getScore());
    }

    @Override
    public String toString() {
      return "Children ("
      + "name = " + this.name //
      + ", score = " + this.score //
      + ")";
    }

  }

  // Question 17.
  // Synchronized method to safely add values to totalSum
  private static int totalSum = 0;
  private synchronized static void addToTotal(int number) {
    totalSum += number;
  }

  // Question 25.
  private static Optional<String> findFirstLongerThanFourOptional(List<String> strings) {
    return strings.stream()
           .filter(s -> s.length() > 4)
           .findFirst();
  }

  private static String findFirstLongerThanFour(List<String> strings) {
    return strings.stream()
           .filter(s -> s.length() > 4)
           .findFirst()
           .orElse("No string found");               // Default value if not found
  }

  public static void main(String[] args) {

    // 1. Basic Stream Operations
    // Task: Given a list of integers, use a stream to find all the even numbers, square them, and then
    // sort the result in descending order.
    List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10); 
    List<Integer> evenNumbers1 = new ArrayList<>();
    
    for (Integer number : numbers1) {
      if (number % 2 == 0) {
        evenNumbers1.add(number);
      }
    }
    System.out.println("The list of even numbers is: " + evenNumbers1);

    List<Integer> squaredNumbers1 = new ArrayList<>();
    for (Integer evenNumber : evenNumbers1) {
      squaredNumbers1.add(evenNumber * evenNumber);
    }

    // Squaring and sorting by descending order (by Collections.sort())
    Collections.sort(squaredNumbers1, Collections.reverseOrder());     // by descending order
    // Collections.sort(squaredNumbers);                              // by ascending order
    System.out.println("The descending list of squared numbers is: " + squaredNumbers1);
    // Output: [100, 64, 36, 16, 4]

    // Squaring and sorting by descending order (by stream)
    List<Integer> squaredAndSorted1  
      = evenNumbers1.stream()
        .map(n -> n * n) // Square the numbers
        .sorted((a, b) -> b - a) // Sort in descending order
        .collect(Collectors.toList());
    System.out.println("The descending list of squared numbers is: " + squaredAndSorted1);
        
    squaredAndSorted1
      = numbers1.stream()
        .filter(e -> e % 2 == 0)
        .map(e -> e * e)
        .sorted((n1, n2) -> n1 > n2 ? -1 : 1)
        .collect(Collectors.toList());
    System.out.println("The descending list of squared numbers is: " + squaredAndSorted1);
            
        
    // 2. Filtering and Collecting
    // Task: Given a list of names, filter the names that start with "A" and collect them into a list.
    List<String> names2 = Arrays.asList("Alice", "Bob", "Annie", "David", "Alex");
    List<String> namesWithA2 = new ArrayList<>();
    for (String name : names2) {
      if (name.charAt(0) == 'A') {
        namesWithA2.add(name);
      }
    }
    System.out.println("The list of names with A is: " + namesWithA2);
        
    List<String> namesWithA2a 
      = names2.stream()
        .filter(name -> name.startsWith("A"))   // Filter names that start with "A"
        .collect(Collectors.toList());          // Collect results into a list
        
    System.out.println("The list of names with A is: " + namesWithA2a);
    // Output: [Alice, Annie, Alex]
        
        
    // 3. Finding Maximum and Minimum
    // Task: Given a list of integers, find the maximum and minimum values using Streams.
    List<Integer> numbers3 = Arrays.asList(10, 20, 5, 30, 15);
        
    // Finding the maximum value (by stream, mapToInt, max, and Lambda)
    int maxInt3 
      = numbers3.stream()
        .mapToInt(Integer::intValue)                                   // Convert to IntStream
        .max()                                                         // Get the maximum value
        .orElseThrow(() -> new RuntimeException("List is empty"));     // Handle empty list
        
    // Finding the minimum value (by stream, mapToInt, min, and Lambda)
    int minInt3 
      = numbers3.stream()
        .mapToInt(Integer::intValue)                                   // Convert to IntStream
        .min()                                                         // Get the minimum value
        .orElseThrow(() -> new RuntimeException("List is empty"));     // Handle empty list
        
    // Output the results
    System.out.println("Max: " + maxInt3);
    System.out.println("Min: " + minInt3);
        
    // Finding the maximum value (by stream, comparator, ifPresent, Lambda)
    Optional<Integer> maxInteger3 
      = numbers3.stream()
        .max(Integer::compareTo); // Use a comparator
        
    // Finding the minimum value (by stream, comparator, ifPresent, Lambda)
    Optional<Integer> minInteger3 
      = numbers3.stream()
        .min(Integer::compareTo); // Use a comparator
        
    // Output the results
    maxInteger3.ifPresent(max -> System.out.println("Max: " + max));
    minInteger3.ifPresent(min -> System.out.println("Min: " + min));
    // Output: Max: 30
    // Output: Min: 5
        
        
    // 4. Mapping to a List of Lengths
    // Task: Given a list of strings, map each string to its length and collect the lengths into a
    // List<Integer>
    List<String> words4 = Arrays.asList("apple", "banana", "pear");
        
    // Mapping string into length and collect lengths (beginner level)
    List<Integer> lengths4 = new ArrayList<>();
    for (String word : words4) {
      lengths4.add(word.length());
    }
    System.out.println("The list of words' length is: " + lengths4);
        
    // Mapping string into length using streams (intermediate level)
    List<Integer> lengths4a 
      = words4.stream()
        .map(String::length)              // Map each string to its length
        .collect(Collectors.toList());    // Collect the lengths into a List
    System.out.println("The list of words' length is: " + lengths4a);
        
    lengths4a
      = words4.stream()
        .map(e -> e.length())
        .collect(Collectors.toList());
    System.out.println("The list of words' length is: " + lengths4a);
    // Output: [5, 6, 4] (List)
        
        
    // 5. Counting Elements
    // Task: Given a list of strings, count how many strings have a length greater than 3.
    List<String> words5 = Arrays.asList("hi", "hello", "world", "java", "stream");
        
    // Counting strings with length greater than 3  (beginner level)
    int counter5 = 0;
    for (String word : words5) {
      if (word.length() > 3)   counter5++;
    }
    System.out.println("The number of words with length longer than 3: " + counter5);
        
    // Counting strings with length greater than 3  (with stream (intermediate level))
    // long counter5a = words5.stream()                           // convert collection (i.e. list, set, map) into stream
    //                 .filter(word -> word.length() > 3)         // Filter words with length greater than 3
    //                 .count();                                  // Count, and returns long
    int counter5a 
      = (int) words5.stream()                  // convert the long value into int value
        .filter(word -> word.length() > 3)     // Filter words with length greater than 3
        .count();                              // Count, and returns long
    System.out.println("The number of words with length longer than 3: " + counter5a);
    // Output: 4
        
        
    // 6. Filtering and Collecting to a Set
    // Task: Given a list of numbers, filter out all numbers greater than 10 and collect them into a Set.
    List<Integer> numbers6 = Arrays.asList(5, 10, 20, 15, 20, 10, 5);
    Set<Integer> numbersGreaterThanTen6 = new HashSet<>();
        
    // Filtering numbers greater than 10 and collecting them into a Set (by for-loop)
    for (int number : numbers6) {
      if (number > 10)       numbersGreaterThanTen6.add(number);
    }
    System.out.println("The set of numbers greater than 10 is: " + numbersGreaterThanTen6);
        
    // Filtering numbers greater than 10 and collecting them into a Set (by stream)
    Set<Integer> numbersGreaterThanTen6a 
      = numbers6.stream()
        .filter(number -> number > 10)       // Filter for numbers greater than 10
        .collect(Collectors.toSet());        // Collect results into a Set
    System.out.println("The set of numbers greater than 10 is: " + numbersGreaterThanTen6a);
    // Output: [20, 15] (toSet 自動 remove duplicated elements)
        
        
    // 7. Mapping to a Map (Key-Value Pairs)
    // Task: Given a list of students with their names and scores, map them to a Map<String, Integer>,
    // where the key is the student's name and the value is their score.
    List<Student> students7 = new LinkedList<>();
            
    // Create Student Class
    // new Student("Alice", 85)
    // new Student("Bob", 75)
    Student student71 = new Student("Alice", 85);
    Student student72 = new Student("Bob", 75);
    students7.add(student71);
    students7.add(student72);
        
    // Mapping students to a Map<String, Integer> (by for-loop and put, beginner level)
    Map<String, Integer> studentMap7 = new HashMap<>();
    for (Student student : students7) {
      studentMap7.put(student.getName(), student.getScore());
    }
    // Custom output formatting for the Map
    String studentMapOutput7 
      = studentMap7.entrySet().stream()
        .map(entry -> entry.getKey() + " = " + entry.getValue())
        .collect(Collectors.joining(", ", "{", "}"));
        
    System.out.println("Student scores: " + studentMapOutput7);      // Student scores: {Bob = 75, Alice = 85}
                                                                     // Student scores: {Bob=75, Alice=85} (without Custom method)
        
    // Mapping students to a Map<String, Integer> (by stream and collectors, intermediate level)
    Map<String, Integer> studentMap7a 
      = students7.stream()
        .collect(Collectors.toMap(Student::getName, Student::getScore));
        
    System.out.println("Student scores: " + studentMap7a);          // Student scores: {Bob=75, Alice=85}
    // Output: {Alice=85, Bob=75}
        
        
    // 8. Filtering and Mapping to a List of Objects
    // Task: Given a list of Employee objects, filter out employees with a salary less than 50,000 and
    // map them to a list of their names.
    List<Employee> employees8 = new LinkedList<>();
    // Create Employee Class
    Employee employee81 = new Employee("John", 65000);
    Employee employee82 = new Employee("Jane", 55000);
    Employee employee83 = new Employee("Doe", 40000);
    employees8.add(employee81);
    employees8.add(employee82);
    employees8.add(employee83);
        
    // Mapping employees to a Map<String, Double> (by for-loop and put, beginner level)
    Map<String, Double> employeeMap8 = new HashMap<>();
    for (Employee employee : employees8) {
    //  if (employee.getSalary() >= 50000) {
      employeeMap8.put(employee.getName(), employee.getSalary());
    //  }
    }
    // Employees' salary higher than 50000: {John = 65000.0, Doe = 40000.0, Jane = 55000.0}
    // Employees' salary higher than 50000: {John=65000.0, Doe=40000.0, Jane =55000.0} (without Custom method)
        
    // Custom output formatting for the Map
    String employeeMapOutput8 
      = employeeMap8.entrySet().stream()
        .map(entry -> entry.getKey() + " = " + entry.getValue())
        .collect(Collectors.joining(", ", "{", "}"));
        
    System.out.println("List of all employees with salary: " + employeeMapOutput8);      
    // Employees' salary higher than 50000: {John = 65000, Jane = 55000}
      // Employees' salary higher than 50000: {John = 65000, Jane = 55000} (without Custom method)
        
    // Using a for-loop to filter and print names with salary > 50000
    System.out.print("Employees' salary higher than 50000: {");
    boolean first8 = true;                 // To format output correctly
    for (Map.Entry<String, Double> entry : employeeMap8.entrySet()) {
      if (entry.getValue() > 50000) {
        if (!first8) {
          System.out.print(", ");
        }
          System.out.print(entry.getKey());
          first8 = false; // After the first entry, set to false
      }
    }
    System.out.println("}");
    // Employees' salary higher than 50000: {John, Jane}
        
    // Mapping employees to a Map<String, Integer> (by stream and collectors, intermediate level)
    Map<String, Double> employeeMap8a 
      = employees8.stream()
        .collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        
    // Custom output formatting for the Map
    String employeeMapOutput8a 
      = employeeMap8a.entrySet().stream()
        // .filter(entry -> entry.getValue() > 50000)                  // Filter by salary
        .map(entry -> entry.getKey() + " = " + entry.getValue())
        .collect(Collectors.joining(", ", "{", "}"));
        
    System.out.println("List of all employees with salary: " + employeeMapOutput8a);
    // List of all employees with salary: {John = 65000.0, Doe = 40000.0, Jane = 55000.0}
            
    // Filtering the map by salary > 50000 and collecting names
    String employeeNamesOutput8a 
      = employeeMap8a.entrySet().stream()
        .filter(entry -> entry.getValue() > 50000)           // Filter by salary
        .map(Map.Entry::getKey)                              // Map to names
        .collect(Collectors.joining(", ", "[", "]"));        // Format the output
        
    System.out.println("Employees' salary higher than 50000: " + employeeNamesOutput8a);   
            
    List<String> q8Result = new ArrayList<>();
    q8Result = employees8.stream()
               .filter(e -> e.getSalary() > 50_000)
               .map(e -> e.getName())
               .collect(Collectors.toList());
    System.out.println("Employees' salary higher than 50000: " + q8Result);
    // Employees' salary higher than 50000: {John, Jane}
    // Output: [John, Jane]
        
        
    // 9. Grouping and Collecting to a Map (Group by Age)
    // Task: Given a list of people with their names and ages, group them by age and collect the result
    // into a Map<Integer, List<String>> where the key is the age and the value is a list of names.
    List<Person> persons9 = new LinkedList<>();
    // Create Person Class
    Person person91 = new Person("Alice", 30);
    Person person92 = new Person("Bob", 25);
    Person person93 = new Person("Charlie", 30);
    persons9.add(person91);
    persons9.add(person92);
    persons9.add(person93);
    System.out.println("The list of all persons is: " + persons9);
        
    // version with putIfAbsent
    Map<Integer, List<String>> personMap9 = new HashMap<>();
    // Group names by age
    for (Person person : persons9) {
      // If the age is not already a key, create a new list
      personMap9.putIfAbsent(person.age, new LinkedList<>());
      // Add the person's name to the list for this age
      personMap9.get(person.age).add(person.name);
    }
        
    // Display the results
    for (Map.Entry<Integer, List<String>> entry : personMap9.entrySet()) {
      System.out.println("Age: " + entry.getKey() + ", Names: " + entry.getValue());
    }
        
    // version with containsKey
    Map<Integer, List<String>> personMap9a = new HashMap<>();
        
    // Group names by age
    for (Person person : persons9) {
      // Check if the age exists in the map
      if (!personMap9a.containsKey(person.age)) {
        // Create a new list if it doesn't exist
        personMap9a.put(person.age, new LinkedList<>());
      }
    // Add the person's name to the list
        personMap9a.get(person.age).add(person.name);
    }
        
    // Display the results
    // for (Map.Entry<Integer, List<String>> entry : personMap9a.entrySet()) {
    //   System.out.println("Age: " + entry.getKey() + ", Names: " + entry.getValue());
    // }
    System.out.println(personMap9a);
    // Output: {30=[Alice, Charlie], 25=[Bob]} (Map)
        
        
    // 10. Partitioning and Collecting to a Map (Partition by Gender)
    // Task: Given a list of Staff with their names and genders, partition them into two groups: male
    // and female, and collect the result into a Map<Boolean, List<Person>>.
        
    // Create Staff Class
    Staff staff101 = new Staff("Alice", Gender.FEMALE);
    Staff staff102 = new Staff("Bob", Gender.MALE);
    Staff staff103 = new Staff("Charlie", Gender.MALE);
        
    List<Staff> staffList10 = Arrays.asList(staff101, staff102, staff103);
        
    // Partition staff members into a Map
    // Map<Boolean, List<Staff>> staffMap10 
    //   = staffList10.stream()
    //     .collect(Collectors.partitioningBy(staff -> staff.getGender() == Gender.MALE));
        
    // Grouping staff members into a Map by Gender
    Map<Gender, List<Staff>> staffMap10 
      = staffList10.stream()
        .collect(Collectors.groupingBy(staff -> staff.getGender()));
            
    // Custom output formatting for the Map
    String staffMapOutput10
      = staffMap10.entrySet().stream()
        .map(entry -> entry.getKey() + " = " + entry.getValue())
        .collect(Collectors.joining(", ", "{", "}"));
        
    System.out.println(staffMapOutput10);
    // Output: {false=[Alice], true=[Bob, Charlie]} (Map)
        
            
    // 11. Filtering, Mapping, and Collecting to a List
    // Task: Given a list of integers, filter out numbers less than 10, multiply the remaining numbers
    // by 2, and collect the result into a List.
        
    List<Integer> numbers11 = Arrays.asList(5, 15, 20, 7, 30);
        
    List<Integer> numbersList11 = new ArrayList<>();
    for (int number : numbers11) {
      if (number >= 10) {
        numbersList11.add(number);
      }
    }
    List<Integer> numbersOutputList11 = new ArrayList<>();
    for (int number : numbersList11) {
      numbersOutputList11.add(number * 2);
    }
    System.out.println("The list of numbers multiplied by 2 is: " + numbersOutputList11);
        
    List<Integer> numbersOutput11a 
      = numbers11.stream()
        .filter(n -> n >= 10)                // Filter out numbers less than 10
        .map(n -> n * 2)                     // Multiply remaining numbers by 2
        .collect(Collectors.toList());       // Collect the results into a List
                
    System.out.println("The list of numbers multiplied by 2 is: " + numbersOutput11a); 
    // Output: [30, 40, 60]
        
        
    // 12. Mapping to a Custom Object and Collecting to a List
    // Task: Given a list of names and a constant default value, map each name to a Person object (name
    // and default value for age) and collect the result into a list.
        
    List<String> names12 = Arrays.asList("Alice", "Bob", "Charlie");
    int defaultAge = 30;
        
    List<Person> namesOutput12 = new ArrayList<>();
    for (String name : names12) {
      namesOutput12.add(new Person(name, defaultAge));
    }
    System.out.println(namesOutput12);
        
    List<Person> namesOutput12a 
      = names12.stream()
        .map(name -> new Person(name, defaultAge))        // Map each name to a Person object
        .collect(Collectors.toList());                    // Collect the results into a List
    System.out.println(namesOutput12a);
    // Output: [Person(name=Alice, age=30), Person(name=Bob, age=30), Person(name=Charlie, age=30)]
        
        
    // 13. Mapping and Collecting to a Deque
    // Task: Given a list of words, map each word to its uppercase form and collect the result into a
    // Deque.
    List<String> words13 = Arrays.asList("hello", "world", "java");
            
    Deque<String> wordsDeque13 = new ArrayDeque<>();
            
    for (String word : words13) {
      wordsDeque13.add(word.toUpperCase());
    }
    System.out.println("The deque of words is: " + wordsDeque13);
        
    Deque<String> wordsDeque13a = new ArrayDeque<>();
        
    wordsDeque13a 
      = words13.stream()
        .map(String::toUpperCase)                               // Map each word to its uppercase form
        .collect(Collectors.toCollection(ArrayDeque::new));     // Collect into a Deque
    System.out.println("The deque of words is: " + wordsDeque13a);
    // Output: [HELLO, WORLD, JAVA] (Deque)
        
        
    // 14. Transforming and Collecting to an Array
    // Task: Given a list of integers, square each number and collect the result into an array.
    List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4);
        
    int[] intArray14 = new int[numbers14.size()];
        
    for (int i = 0; i < numbers14.size(); i++) {
      intArray14[i] = numbers14.get(i) * numbers14.get(i);
    }
    System.out.println("The array of squared numbers is: " + Arrays.toString(intArray14));
        
    Integer[] numberArray14a
      = numbers14.stream()
        .map(n -> n * n)                 // square each number
        .toArray(Integer[]::new);        // collect into an array
        
    System.out.println("The array of squared numbers is: " + Arrays.toString(numberArray14a));
    // Output: [1, 4, 9, 16]
        
        
    // 15. Map and Reduce
    // Task: Given a list of products with their prices, use the map and reduce methods to calculate the
    // total price of all products.
        
    // Create Product Class
    Product product151 = new Product("Book", 92_000, 100.0);
    Product product152 = new Product("Pen", 72_000, 5.0);
    Product product153 = new Product("Notebook", 49_000, 7.0);
        
    // Create a list of products
    List<Product> products15 = Arrays.asList(product151, product152, product153);
        
    // Create a NumberFormat instance for currency formatting
    NumberFormat numberFormat15 = NumberFormat.getInstance();
    numberFormat15.setMinimumFractionDigits(2);
    numberFormat15.setMaximumFractionDigits(2);
        
    // Print the total amount for each product
    for (Product product : products15) {
      double eachAmount15 = product.getAmount();
      String formattedAmount15 = numberFormat15.format(eachAmount15); // Format the price
      System.out.printf("%s: %s%n", product.getItem(), formattedAmount15); // Print product name and formatted price
    }      
    // Calculate the total price using map and reduce
    double totalAmount15 
      = products15.stream()
        .mapToDouble(Product::getAmount)           // Map to total price for each product
        .sum();                                    // sum the total prices
        
    // Format the output as currency
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
    String formattedAmount15 = currencyFormat.format(totalAmount15);
        
    System.out.println("Total amount of all products is: " + formattedAmount15); 
    // Output: 1,623.00
    // Convert back to double
    try {
      Number parsedNumber15 = currencyFormat.parse(formattedAmount15);
      double doubleValue15 = parsedNumber15.doubleValue();
      System.out.printf("Converted back to double: %.2f%n", doubleValue15); // Converted back to double: 9903000.00
      System.out.println(doubleValue15);                                    // 9903000.0
    } catch (ParseException e) {
        e.printStackTrace();
    }
        
    // Convert back to double
    try {
      Number parsedNumber15 = currencyFormat.parse(formattedAmount15);
      double doubleValue15 = parsedNumber15.doubleValue();
      // Print just the double value formatted to two decimal places
      System.out.printf("%.2f%n", doubleValue15);                           // 9903000.00
      // Output: 1623.00
    } catch (ParseException e) {
        e.printStackTrace();
    }
        
    // 16. Grouping
    // Task: Given a list of employees with their department names, use groupingBy method to group the
    // employees by department.
        
    // Create Worker Class
    Worker worker161 = new Worker("Alice", "HR");
    Worker worker162 = new Worker("Bob", "IT");
    Worker worker163 = new Worker("Charlie", "HR");
    Worker worker164 = new Worker("David", "IT");
        
    List<Worker> workers16 = new LinkedList<>();
    workers16.add(worker161);
    workers16.add(worker162);
    workers16.add(worker163);
    workers16.add(worker164);
        
    // Grouping employees by department
    Map<String, List<String>> groupedByDepartment16 
      = workers16.stream()
        .collect(Collectors.groupingBy(
          Worker::getDepartment,
          Collectors.mapping(Worker::getName, Collectors.toList())
        ));
            
    // Custom output format
    StringBuilder output16 = new StringBuilder("{");
    groupedByDepartment16.forEach((department, names) -> 
      output16.append(department).append(" = ").append(names).append(", ")
    );
        
    // Remove the last comma and space, and close the brace
    if (output16.length() > 1) {
      output16.setLength(output16.length() - 2); // Remove last comma and space
    }
    output16.append("}");
    System.out.println(output16); 
    // Output: {HR=[Alice, Charlie], IT=[Bob, David]}
        
        
    // 17. Parallel Streams
    // Task: Given a list of numbers, use a parallel stream to calculate the sum of all elements.
    List<Integer> numbers17 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
    // Calculate the sum using a parallel stream 
      // (without synchronized thread)
    int sum17 = numbers17.parallelStream()
                .mapToInt(Integer::intValue)
                .sum();
    System.out.println("The sum of 1 to 10 is: " + sum17);                                   // 55
        
    // Calculate the sum using a parallel stream 
    // (with synchronized thread)
    numbers17.parallelStream().forEach(number -> addToTotal(number));
    System.out.println("The sum of 1 to 10 is: " + totalSum);                                // 55
    // Output: 55
    totalSum = 0;
        
        
    // 18. FlatMap
    // Task: Given a list of lists of numbers, flatten them into a single list and filter only the
    // numbers greater than 5.
        
    List<List<Integer>> listOfIntegers18 = Arrays.asList( //
    Arrays.asList(1, 2, 3), //
    Arrays.asList(4, 5, 6), //
    Arrays.asList(7, 8, 9) //
    );
            
    Set<Integer> uniqueIntegerSet18 
      = listOfIntegers18.stream()
        .flatMap(List::stream)              // Flatten the list of lists
        .filter(num -> num > 5)             // Filter numbers greater than 5
        .collect(Collectors.toSet());       // Collect results into a Set
    System.out.println("The list of unique integers: " + uniqueIntegerSet18);
        
    List<Integer> sortedIntegerList18
      = uniqueIntegerSet18.stream()
        .sorted()                           // sort the results
        .collect(Collectors.toList());
    System.out.println("The list of sorted integers: " + sortedIntegerList18);
    // Output: [6, 7, 8, 9]
        
        
    // 19. Distinct and Sorting
    // Task: Given a list of strings with some duplicates, remove the duplicates and return the result
    // in alphabetical order.
        
    List<String> fruits19 = Arrays.asList("apple", "banana", "apple", "orange", "banana", "grape");
    // Remove duplicates and sort the result in alphabetical order
    List<String> fruits19a = new ArrayList<>();
    for (String fruit : fruits19) {
      fruits19a.add(fruit);
    }
    // Remove duplicates and sort the result in alphabetical order
    for (int i = 0; i < fruits19a.size(); i++) {
      for (int j = i + 1; j < fruits19a.size(); j++) {
        if (fruits19a.get(i).equals(fruits19a.get(j))) {
          fruits19a.remove(j);
          j--;
        }
      }
    }
    fruits19a.sort(String::compareTo);                // Sort in alphabetical order
    System.out.println("The fruit names by alphabetical order: " + fruits19a);
        
    // Remove and sort by stream
    List<String> distinctSortedFruits 
      = fruits19a.stream()
        .distinct()                                   // Remove duplicates
        .sorted()                                     // Sort in alphabetical order
        .collect(Collectors.toList());                // Collect results into a List
    System.out.println("The fruit names by alphabetical order: " + distinctSortedFruits);
    // Output: [apple, banana, grape, orange]
            
        
    // 20. Partitioning By
    // Task: Given a list of Childrens with their scores, partition the Childrens into passing and failing
    // groups (pass if score >= 50).
    // Create Student first.
            
    // Create Children Class
    Children children201 = new Children("Alice", 45);
    Children children202 = new Children("Bob", 55);
    Children children203 = new Children("Charlie", 40);
    Children children204 = new Children("David", 70);
        
    List<Children> childrens20 = new LinkedList<>();
    childrens20.add(children201);
    childrens20.add(children202);
    childrens20.add(children203);
    childrens20.add(children204);
            
    // Grouping employees by pass or fail
    Map<Boolean, List<String>> groupedByIsPassed20
      = childrens20.stream()
        .collect(Collectors.groupingBy(
        Children::isPassed,
        Collectors.mapping(Children::getName, Collectors.toList())
        ));
            
    System.out.println(groupedByIsPassed20);                       // {false=[Alice, Charlie], true=[Bob, David]}
            
    String passedNames = String.join(", ", groupedByIsPassed20.get(true));
    String failedNames = String.join(", ", groupedByIsPassed20.get(false));
            
    System.out.println("Passed: " + passedNames);                  // Passed: Bob, David
    System.out.println("Failed: " + failedNames);                  // Failed: Alice, Charlie
            
    // Custom output format
    StringBuilder output20 = new StringBuilder("{");
    groupedByIsPassed20.forEach((names, isPassed) -> 
      output20.append(names).append(" = ").append(isPassed).append(", ")
    );
    // Remove the last comma and space, and close the brace
    if (output20.length() > 1) {
      output20.setLength(output20.length() - 2); // Remove last comma and space
    }
    output20.append("}");
    System.out.println(output20);                                 // {false = [Alice, Charlie], true = [Bob, David]}
        
    // Grouping by pass or fail
    Map<Boolean, List<Children>> groupedByIsPassed20a 
      = childrens20.stream()
        .collect(Collectors.groupingBy(Children::isPassed));
                
    // Printing names with respective scores
    System.out.println("Passed: " 
      + groupedByIsPassed20a.get(true).stream()
      .map(Children::toString)
      .collect(Collectors.joining(", ")));                  
    // Passed: Children (name = Bob, score = 55), Children (name = David, score = 70)
                
    System.out.println("Failed: " 
      + groupedByIsPassed20a.get(false).stream()
      .map(Children::toString)
      .collect(Collectors.joining(", ")));                  
    // Failed: Children (name = Alice, score = 45), Children (name = Charlie, score = 40)
                
    // Custom output format
    StringBuilder output20a = new StringBuilder("{");
    groupedByIsPassed20a.forEach((isPassed, children) 
      -> output20a.append(isPassed).append(" = ").append(children.stream()
                  .map(Children::toString)
                  .collect(Collectors.toList())).append(", "));
    // Remove the last comma and space, and close the brace
    if (output20a.length() > 1) {
      output20a.setLength(output20a.length() - 2); // Remove the last comma and space
    }
    output20a.append("}");
    System.out.println(output20a);   // Output: {false=[Alice (45), Charlie (40)], true=[Bob (55), David (70)]}
            
        
    // 21. Joining Strings
    // Task: Given a list of words, join them into a single string separated by commas.
    List<String> languages = Arrays.asList("Java", "Python", "Rust", "R", "Go");

    // result by using Stringbuilder
    StringBuilder s21 = new StringBuilder();
    System.out.print("The string of a series of words is: [");
    for (int i = 0; i < languages.size(); i++) {
      s21.append(languages.get(i));
      if (i < languages.size() - 1) {
        s21.append(", ");
      }
    }
    System.out.println(s21 + "]");

    // result by using Stream
    System.out.print("The string of a series of words is: [");
    String result21 
    = languages.stream()
      .collect(Collectors.joining(", "));
    System.out.println(result21 + "]");
    // Output: "Java, Python, Rust, R, Go"

        
    // 22. Find First and Any
    // Task: Given a list of integers, find the first number that is divisible by 3.
    List<Integer> ages22 = Arrays.asList(4, 7, 9, 12, 16, 21);
    int intDividedByThree22 = 0;
    for (int age : ages22) {
      if (age % 3 == 0) {
        intDividedByThree22 = age;
        break;
      }
    }
    System.out.println("The first integer divisible by 3 is: " + intDividedByThree22);

    // Find the first number divisible by 3
    Integer intDividedByThree22a 
      = ages22.stream()
        .filter(age -> age % 3 == 0)
        .findFirst()
        .orElse(null); // or 0 if you prefer a default value
    System.out.println("The first integer divisible by 3 is: " + intDividedByThree22a);
    // Output: 9
        
    
    // 23. Limit and Skip
    // Task: Given a list of numbers, skip the first 3 elements and return the next 5 elements.
    List<Integer> elements23 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<Integer> integerList23 = new ArrayList<>();
    for (int i = 0; i < elements23.size(); i++) {
      if (i < 3)                            continue;
      integerList23.add(elements23.get(i));
      if (i >= 7)       break;
    }
    System.out.println(integerList23);

    List<Integer> integerList23a 
      = elements23.stream()
        .skip(3)                                   // Skip the first 3 elements
        .limit(5)                                  // Limit to the next 5 elements
        .collect(Collectors.toList());             // Collect the result into a list
    System.out.println(integerList23a);
    // Output: [4, 5, 6, 7, 8]
            

    // 24. Peek
    // Task: Given a list of integers, double each element and use the peek method to log the
    // intermediate results to the console.
    List<Integer> amounts24 = Arrays.asList(1, 2, 3, 4);
    List<Integer> doubledAmounts 
      = amounts24.stream()
        .map(amount -> amount * 2)              // Double each element
        .peek(System.out::println)              // Log intermediate results
        .collect(Collectors.toList());          // Collect the results into a list

    System.out.println("Final Output: " + doubledAmounts);          // Output: [2, 4, 6, 8]
    // Intermediate output: 2, 4, 6, 8
    // Final Output: [2, 4, 6, 8]

    // 25. Optional and Streams
    // Task: Given a list of strings, use Streams to find the first string longer than 4 characters.
    // Handle the case where no such string exists using Optional.
    List<String> animals25a = Arrays.asList("cat", "tiger", "panda", "dog");
    List<String> animals25b = Arrays.asList("cat", "dog", "bird");

    Optional<String> result25A = findFirstLongerThanFourOptional(animals25a);
    Optional<String> result25B = findFirstLongerThanFourOptional(animals25b);

    System.out.println("Result A: " + result25A);             // Output: Optional[tiger]
    System.out.println("Result B: " + result25B);             // Output: Optional.empty

    String result25a = findFirstLongerThanFour(animals25a);
    System.out.println("Result A: " + result25a);             // Output: tiger

    String result25b = findFirstLongerThanFour(animals25b);
    System.out.println("Result B: " + result25b);             // Output: No string found
        



    // 26. Custom Collector
    // Task: Create a custom collector that collects the elements of a stream and remove all duplicates
    List<Integer> duplicates = Arrays.asList(2, 1, 2, 3, 4, 3, 5, 5, 6);
    List<Integer> uniqueNumbers26 = new ArrayList<>();

    // Loop through each number in the duplicates list
    for (int number : duplicates) {
      // Check if the number is not already in the uniqueNumbers list
      if (!uniqueNumbers26.contains(number)) {
        uniqueNumbers26.add(number); // Add the number if it's unique
      }
    }
    System.out.println(uniqueNumbers26);    // Output: [2, 1, 3, 4, 5, 6]
    Collections.sort(uniqueNumbers26);
    System.out.println(uniqueNumbers26);    // Output: [1, 2, 3, 4, 5, 6]

    // Sort the unique numbers using a simple bubble sort
    for (int i = 0; i < uniqueNumbers26.size() - 1; i++) {
      for (int j = 0; j < uniqueNumbers26.size() - 1 - i; j++) {
        // Swap if the current number is greater than the next number
        if (uniqueNumbers26.get(j) > uniqueNumbers26.get(j + 1)) {
          // Swap
          int temp = uniqueNumbers26.get(j);
          uniqueNumbers26.set(j, uniqueNumbers26.get(j + 1));
          uniqueNumbers26.set(j + 1, temp);
        }
      }
    }
    System.out.println(uniqueNumbers26);

    List<Integer> intSequenced26 
      = duplicates.stream()
        .distinct()                          // Remove duplicates
        .sorted()                            // Sort the numbers (optional)
        .collect(Collectors.toList());       // Collect into a List
    // Print the result
    System.out.println(intSequenced26); 
    // Output: [1, 2, 3, 4, 5, 6] (Set)


    // 27. String Length Calculation
    // Task: Given a list of strings, calculate the total number of characters in all the strings
    // combined.
    List<String> keywords = Arrays.asList("stream", "filter", "map", "sorted", "collect");
    int validCharacterCount = 0;
    for (String keyword : keywords) {
      for (char ch : keyword.toCharArray()) {
        if (Character.isLetterOrDigit(ch)) {
          validCharacterCount++; 
        }
      }
    }
    System.out.println(validCharacterCount);
    // Output: 28


  }
}
