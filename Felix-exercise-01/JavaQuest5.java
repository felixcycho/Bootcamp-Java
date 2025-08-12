public class JavaQuest5 {
  /**
   * Expected output:
   * The index of the last character of c is 11
   */
  public static void main(String[] args) {
    String str = "coding bootcamp."; // You should not change this line
    char target = 'c';

    // if found, print "Found."
    // if not found, print "Not Found."
    // code here ...
    int charTarget = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (i == str.lastIndexOf(target)) {
        charTarget = str.lastIndexOf(target);
        System.out.println("Found.");
        System.out.println("The index of the last character of " + target + " is " + charTarget);
      } else {
        System.out.println("Not found.");
      }
    }
  }
}
