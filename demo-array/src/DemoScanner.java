import java.util.Scanner;

public class DemoScanner {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    // System.out.println("Please input a number: ");
    // int number = scanner.nextInt();    // 此句代表開 scanner.
    // System.out.println("The input is " + number);

    // Scanner scanner2 = new Scanner(System.in);    Not valid, a scanner cannot be opened twice.
    
    // Game
    // Bomb = random (1 - 100)
    // User: 50 --> 1 - 49
    // if user selected the number = bomb, exit loop
    int intBomb = (int)(Math.random() * 99) + 1;
    int intInput = -1;
    int intFloor = 1;
    int intCeiling = 100;
    while (intInput != intBomb) {
      System.out.println("Please select a number between " + intFloor + " and " + intCeiling + ":");
      // collect user input
      intInput = scanner.nextInt();
      // validate user input, if it is out of range, ask the question again. (continue)
      if (intInput < intFloor || intInput > intCeiling) {
        continue;
      }
      // revise the range of numbers for next round
      if (intInput > intBomb) {
        intCeiling = intInput - 1;
      } else if (intInput < intBomb) {
        intFloor = intInput + 1;
      }
    }
    System.out.println("BOMB!!!! " + intBomb);



    scanner.close();    // scanner.close() 一定放最後, 因為未用完

  }
}