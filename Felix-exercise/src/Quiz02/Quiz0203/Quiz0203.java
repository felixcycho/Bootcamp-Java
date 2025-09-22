class Quiz0203 {
  static int counter = 10;

  public static void main(String[] args) {
    for (byte i = 0; i < 128; i--) {           // byte -128 to 127
      counter++;
    }
    System.out.println(counter);               // infinite loop, never reach
  }
}
