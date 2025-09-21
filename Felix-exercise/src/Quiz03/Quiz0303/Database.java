class Database {
  private String[] strings;

  Database(String[] strings) {
    this.strings = strings;
  }

  public String[] getStrings() {
    return this.strings;
  }

}

class Quiz {
  public static void main(String[] args) {
    Database b1 = new Database(new String[] {"ABC", "BCD", "XYZ"});
    Database b2 = b1;
    Database b3 = new Database(new String[] {"ABC", "BCD", "XYZ"});
    String s1 = "ABC";
    String s2 = "ABC";

    System.out.println(b1 == b2);
    System.out.println(b2 == b3);
    System.out.println(s1 == s2);
    System.out.println(s1.equals(b1.getStrings()[1]));
    System.out.println(s2.equals(s1));

  }
}
