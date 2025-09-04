import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Scanner;

public class DataStructureExercise2 {

  public static class Student {
    private int id;
    private String name;
    private String subject;
    
    // Constructor
    public Student (int id, String name) {
      this.id = id;
      this.name = name;
    }

    public Student (String name, String subject) {
      this.name = name;
      this.subject = subject;
    }

    // getters
    public int getId() {
      return this.id;
    }

    public String getName() {
      return this.name;
    }

    public String getSubject() {
      return this.subject;
    }

    // setters
    public void setName(String name) {
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
    
  }

  // Answer for Question 1:
  private static boolean isInteger (String str) {
    return str != null && str.matches("-?\\d+");
  }

  // Answer for Question 1:
  private static Integer convertToInt(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("Input cannot be null or empty.");
    }
    int num = 0;
    boolean isNegative = str.startsWith("-");

    int startIndex = isNegative ? 1 : 0;

    for (int i = startIndex; i < str.length(); i++) {
      char chr = str.charAt(i);
      if (!Character.isDigit(chr)) {
        throw new IllegalArgumentException("Input string is not a valid integer.");
      }
      num = num * 10 + (chr - '0');
    }
    return isNegative ? -num : num;
  }

  // Answer for Question 3:
  public static boolean isPalindrome (String str) {
    Deque<Character> characters3 = new ArrayDeque<Character>();

    for (char chr : str.toCharArray()) {
      characters3.addLast(chr);
    }
        
    while (characters3.size() > 1) {
      if (characters3.removeFirst() != characters3.removeLast()) {
        return false;
      }
    } 
    return true;
  }

  // Answer for Question 3:
  // public static boolean isPalindrome (String str) {
  //   int length = str.length();
  
  //   for (int i = 0; i < str.length() / 2; i++) {
  //     if (str.charAt(i) != str.charAt(length - 1 + i)) {
  //       return false;
  //     }
  //   }
  //   return true;  
  // }

  // Answer for Question 5

  // Answer for Question 8
  public static List<String> getStudentsTakingMath(Map<String, List<String>> map) {
    List<String> studentsTakingMath = new ArrayList<>();
    for (String student : map.keySet()) {
      if (map.get(student).contains("Math")) {
        studentsTakingMath.add(student);
      }
    }
    return studentsTakingMath;
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Exercise 1: Queue Basic Operations
    // 1a. Create a Queue of integers using LinkedList.
    // 1b. Add the numbers: 5, 10, 15, 20, 25.
    List<Integer> integers1 = new LinkedList<Integer>();
    boolean isEndedUp1 = false;
    while (!isEndedUp1) {
      System.out.println("Please input A if addition, B for removal, C for end: ");
      String inputString1 = scanner.nextLine();
      if (inputString1.equalsIgnoreCase("C")) {
        isEndedUp1 = true;
        System.out.println("The input is ended.");
        System.out.println(integers1);
        break;
      } 
      else if (inputString1.equalsIgnoreCase("A")) {
        System.out.println("Please input an integer: ");
        String inputInteger1 = scanner.nextLine();
        Integer inputInteger = convertToInt(inputInteger1);
        integers1.add(inputInteger);
        System.out.println(integers1);
        continue;
      } 
      else if (inputString1.equalsIgnoreCase("B")) {
        System.out.println
          ("Please input an index of integers removed: 0 to " + (integers1.size() - 1));
        Integer inputInteger1 = scanner.nextInt();
        if (inputInteger1 != null && inputInteger1 < integers1.size() ) {
          System.out.println("Removed: " 
            + integers1.remove(inputInteger1)); // Remove the first element
          System.out.println(integers1);
        } else if (inputInteger1 == null) {
          System.out.println("Queue is empty.");
        } else {
          System.out.println("Invalid input. " +
            "Please enter an integer from 0 to " + (integers1.size() - 1));
        }
        continue;
      } 
      else {
        System.out.println("Invalid input. Please enter an integer.");
        continue;
      }
    }

    // 1c. Print the head of the queue without removing it.
    System.out.println("Please input an integer to check index: ");
    int inputInteger1 = scanner.nextInt();
    System.out.println(integers1.get(inputInteger1));

    // 1d. Remove two elements from the queue.
    // System.out.println(integers1.remove(0));
    // System.out.println(integers1.remove(0));

    // 1e. Print the remaining queue and its size.
    System.out.println(integers1);
    System.out.println(integers1.size());

    // Exercise 2: Queue Simulation
    // 2a. Create a Queue of Strings representing customers in a bank line.
    Queue<String> bankCustomers2 = new LinkedList<String>();
    boolean isEndedUp2 = false;
    // Add the following customers: "Alice", "Bob", "Charlie", "David".
    while (!isEndedUp2) {
      System.out.println("Please input customer name: (if finished press a or A)");
      String inputCustomer2 = scanner.nextLine().trim();
      //  if (inputCustomer2 == "a" || inputCustomer2 == "A") {     // 繼續 indefinite loop
      //  if (inputCustomer2.equals("A") || inputCustomer2.equals("a")) {          // success
        if (inputCustomer2.equalsIgnoreCase("a")) {
          isEndedUp2 = true;
          System.out.println("Input is ended.");
        } else {
            bankCustomers2.add(inputCustomer2);
        }
    } 
    System.out.println(bankCustomers2);

    // 2b. Serve (remove) the first two customers.
    // System.out.println(bankCustomers2.remove(0));     // false
    // System.out.println(bankCustomers2.remove(0));     // false
    bankCustomers2.remove();
    bankCustomers2.remove();

    // 2c. Print the remaining customers in the queue.
    System.out.println(bankCustomers2);

    // 2d. Add two new customers: "Eva", "Frank".
    isEndedUp2 = false;
    while (!isEndedUp2) {
      System.out.println("Please input customer name: (if finished press a or A)");
      String inputCustomer2 = scanner.nextLine().trim();
      //  if (inputCustomer2 == "a" || inputCustomer2 == "A") {     // 繼續 indefinite loop
      //  if (inputCustomer2.equals("A") || inputCustomer2.equals("a")) {          // success
        if (inputCustomer2.equalsIgnoreCase("a")) {
          isEndedUp2 = true;
          System.out.println("Input is ended.");
        } else {
            bankCustomers2.add(inputCustomer2);
        }
    } 
    System.out.println(bankCustomers2);

    // 2e. Write a method that processes the queue until it is empty, printing each served customer.
    while (bankCustomers2.size() != 0) {
      System.out.println(bankCustomers2.remove());
    }

    // Exercise 3: Palindrome Checker
    // 3a. Write a method `isPalindrome(String word)` using a Deque<Character>.    
    // It should return true if the word is a palindrome, false otherwise.
    // Example: "level" -> true, "hello" -> false.
    System.out.println("Please input a word");
    String input3 = scanner.nextLine();
    boolean isPalindromeResult = isPalindrome(input3);
    if (isPalindromeResult) {
      System.out.println("The word " + input3 + " is palindrome.");
    }
    else {
      System.out.println("The word " + input3 + " is not palindrome.");
    }

    // Exercise 4: Browser History Simulation
    // 4a. Use a Deque<String> to simulate browser history navigation.
    Deque<String> browserHistory4 = new ArrayDeque<String>();
    // Add pages: "google.com", "facebook.com", "youtube.com", "github.com".
    browserHistory4.add("google.com");
    browserHistory4.add("facebook.com");
    browserHistory4.add("youtube.com");
    browserHistory4.add("github.com");
    
    System.out.println(browserHistory4);
    // 4b. Simulate "back" and "forward" navigation using deque operations.
    // 4c. Print the current page after each operation.
    String currentPage4 = null;
    
    // simulate navigation
    boolean exitNavigation4 = false;        // flag to control loop exit
    while (!exitNavigation4) {
      System.out.println("Current page: " + (currentPage4 != null ? currentPage4 : "None"));
      System.out.println("Choose an operation: 1) Back, 2) Forward, 3) Visit new page, 4) Exit.");
      int choice4 = scanner.nextInt();
      scanner.nextLine();

      switch (choice4) {
        case 1:               // backward
          if (currentPage4 != null) {
              browserHistory4.addFirst(currentPage4);       // save current page
          }
          if (!browserHistory4.isEmpty()) {
            currentPage4 = browserHistory4.pollLast();      // go back to the last page
          } else {
            System.out.println("No history to go back to.");
          }
          break;

        case 2:                 // forward
        // In real browser, you would have a seperate stack for forward navigation.
          System.out.println("Forward navigation is not implemented in this simulation.");
          continue;               // skip printing the current page

        case 3:                 // visit a new webpage
          System.out.println("Please enter url address of the new webpage: ");
          String newWebPage4 = scanner.nextLine();
          if (currentPage4 != null) {
            browserHistory4.addFirst(currentPage4);      // save current webpage to history record
          }
          currentPage4 = newWebPage4;                    // visit new webpage
          break;
        
        // case 4:                  // stop current process
        //   System.out.println("Exit.");
        //   return;           // to exit the navigation loop cleanly
          // System.exit(0)             // to stop the whole programme, not suggested
        
        case 4:                  // stop current process
          System.out.println("Exit.");
          exitNavigation4 = true;
          break;           // to exit the navigation loop cleanly
          // System.exit(0)             // to stop the whole programme, not suggested
        
        default:
          System.out.println("Invalid choice. Please try again.");
          continue;
      }

      System.out.println("Current page after operation: " + currentPage4);
    }


    // Exercise 5: Word Frequency Counter
    // 5a. Create a method `countWordFrequency(String text)` that uses a HashMap<String, Integer>.
    // Example input: "apple banana apple orange banana apple"
    System.out.println("Please input a string with spaces: ");
    String string5 = scanner.nextLine();
    // 5b. The method should split the text by spaces and count occurrences of each word.
    String[] words5 = string5.trim().split("\\s+");
    HashMap<String, Integer> wordCountMap5 = new HashMap<String, Integer>();
    for (String word : words5) {
      wordCountMap5.put(word, wordCountMap5.getOrDefault(word, 0) + 1);
    }
    // Output: {apple=3, banana=2, orange=1}
    // 5c. Print the word with the highest frequency.
    System.out.println(wordCountMap5);

    // Exercise 6: Student Directory with HashMap
    // 6a. Create a HashMap<Integer, Student> where key = student ID, value = Student object.
    Map<Integer, Student> studentMap6 = new HashMap<Integer, Student>();
    // Add the following students:
    // ID: 1, Name: Alice
    // ID: 2, Name: Bob
    // ID: 3, Name: Charlie
    // ID: 4, Name: David
    studentMap6.put(1, new Student(1, "Alice"));
    studentMap6.put(2, new Student(2, "Bob"));
    studentMap6.put(3, new Student(3, "Charlie"));
    studentMap6.put(4, new Student(4, "David"));
    // 6b. Write a method to search for a student by ID.
    // 6c. Write a method to remove a student by ID.
    // 6d. Print all student names in alphabetical order.

    // Exercise 7: Inverse Mapping
    // 7a. Create a HashMap<String, String> mapping countries to capitals:
    // {"USA" -> "Washington", "France" -> "Paris", "Japan" -> "Tokyo", "India" -> "Delhi"}
    Map<String, String> countryToCapital = new HashMap<>();
    countryToCapital.put("USA", "Washington");
    countryToCapital.put("France", "Paris");
    countryToCapital.put("Japan", "Tokyo");
    countryToCapital.put("India", "Delhi");

    // 7b. Create an inverse mapping (capital -> country) using another HashMap.
    Map<String, String> capitalToCountry = new HashMap<>();
    for (Map.Entry<String, String> entry : countryToCapital.entrySet()) {
      capitalToCountry.put(entry.getValue(), entry.getKey());
    }
    // 7c. Print the inversed map.
    System.out.println("Inversed Map (Capital -> Country): " + capitalToCountry);
    
    // Exercise 8: HashMap with Multiple Values
    // 8a. Create a HashMap<String, ArrayList<String>> to store subjects taken by each student.
    
    Map<String, List<String>> studentMap8 = new HashMap<String, List<String>>();
    // 8b. Add:
    //      "Alice" -> ["Math", "Science"]
    //      "Bob" -> ["History"]
    //      "Charlie" -> ["Math", "English"]
    studentMap8.put("Alice", new ArrayList<>());
    studentMap8.get("Alice").add("Math");
    studentMap8.get("Alice").add("Science");

    studentMap8.put("Bob", new ArrayList<>());
    studentMap8.get("Bob").add("History");

    studentMap8.put("Charlie", new ArrayList<>());
    studentMap8.get("Charlie").add("Math");
    studentMap8.get("Charlie").add("English");
    // 8c. Add "English" to Bob’s subjects.
    studentMap8.get("Bob").add("English");
    // 8d. Print each student with their subjects.
    System.out.println("Students and their subjects:");
      for (String student : studentMap8.keySet()) {
        System.out.println(student + " -> " + studentMap8.get(student));
      }
    // 8e. Write a method to return all students taking "Math".
    List<String> mathStudents = getStudentsTakingMath(studentMap8);
    System.out.println("Students taking Math: " + mathStudents);

  }
}
