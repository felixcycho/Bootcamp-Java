public class ReadItCarefully {
  
  static final String string = "IamFinalString";
  private static char c = 'C';

  static {
    char[] chars = string.toCharArray();
    c = chars[2];
  }

  public static void main(String[] args) {
    ReadItCarefully readItCarefully =  new ReadItCarefully();
    System.out.println(readItCarefully.c);                        // m
  }

}
