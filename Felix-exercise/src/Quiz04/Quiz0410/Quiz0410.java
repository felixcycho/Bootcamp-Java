package Quiz0410;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Quiz0410 {
  
  static final List<Character> characters;
  static final List<Character> characters1 = new ArrayList<>();    // initialized here
  // static final List<Character> characters2;
    // The blank final field characters1 may not have been initialized.
  private static final char[] chars = {'J', 'A', 'C', 'K', 'Y'};
  int a = 0;

  static {
    characters = new ArrayList<>();
  }
  // execute only when New Object of current class is created

  {
    characters.add('V');
  }

  // void {
    // Syntax error, insert "Identifier (" to complete MethodHeaderNameJava(1610612976)
    // Syntax error, insert ")" to complete MethodDeclaration
  //  characters1 = new ArrayList<>();
  // }

  void addToCharacters1() {
  //  characters1 = new ArrayList<>();
    // The final field Quiz0410.characters1 cannot be assigned.
      // The final keyword means that once the reference to the object is assigned, 
        // you cannot reassign the reference from that object to another object.
  for (char c : chars) {
      characters1.add(c);
    }
  }


  public static void main(String[] args) {
    for (char c : chars) {
      characters.add(c);
    }
    System.out.println(characters);                      // [J, A, C, K, Y]
    System.out.println(characters.size());               // 5

    for (char c : chars) {
      characters1.add(c);
    }
    System.out.println(characters1);                      // [J, A, C, K, Y]
    System.out.println(characters1.size());               // 5

    Quiz0410 quiz0410 = new Quiz0410();
    quiz0410.addToCharacters1();
    System.out.println(characters1);                      // [J, A, C, K, Y, J, A, C, K, Y]
    System.out.println(characters1.size());               // 10
    // In Java, when you declare a field as static final, 
      // it does not mean that the object it references cannot be modified. 
        // Instead, 'final' means that the reference to the object cannot be changed 
          // to point to a different object after it has been initialized.
            // The ArrayList class is mutable, meaning you can modify its contents 
              // (add, remove, or change elements) 
                // even if the reference to the list is final.
                  // A reference points to an object in memory.
                    // Reassigning means changing what a reference points to.
    // Mutable Objects: 
      // Objects like ArrayList can have their contents changed 
        // (i.e. elements can be added, removed, etc.) 
          // without changing the reference itself.
    // Immutable Objects: 
      // Objects like String cannot be changed after they are created. 
        // Any operation that seems to modify them actually creates a new object.
    // Static (instance) variables: 
      // When you declare a variable as static, 
        // it means that the variable belongs to the class itself 
          // rather than to any particular instance of that class. 
            // All instances share the same static variable.
              // Static members are shared across all instances.
                // In contrast, instance members are unique to each instance.
    // Void: 
      // The term void in Java is used in method declarations 
        // to indicate that the method does not return a value. 
          // It is not an object and cannot be reassigned or modified.
    // Non-static (Instance) variables: 
      // A variable declared without static 
        // is unique to each instance of the class.
          // You can create non-static (instance) variables without mentioning static, 
            // and each instance of the class will have its own copy of that variable. 
              // You can modify these instance variables freely, 
                // similar to how you modify static variables 
                  // (as long as they are not declared final).
  }
}
