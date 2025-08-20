public class String1 {

  private char[] chs;

  public String1(String str) {
    this.chs = new char[str.length()];
    for (int i = 0; i < str.length(); i++) {
      this.chs[i] = str.charAt(i);
    }
  }

  public int length() {
    return this.chs.length;
  }

  public char charAt(int idx) {
    return this.chs[idx];
  }

  public boolean contains(char ch) {
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == ch)
        return true;
    }
    return false;
  }

  public int indexOf(char ch) {
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == ch)
        return i;
    }
    return -1;
  }

  public String replace(char oldChar, char newChar) {
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < this.chs.length; i++) {
      if (this.chs[i] == oldChar) {
        newStr.append(newChar);
      } else {
        newStr.append(this.chs[i]);
      }
    } 
    return newStr.toString();
  } 

  public String toString() {
    StringBuilder newStr = new StringBuilder("");
    for (int i = 0; i < this.chs.length; i++) {
      newStr.append(this.chs[i]);
    }
    return newStr.toString();
  }

  public static void main(String[] args) {
    String1 s = new String1 ("hello");
    String s2 = "hello";
    String s3 = s2.replace('e', 'x');

    System.out.println(s2);            // hello
    System.out.println(s3);            // hxllo

    System.out.println(s.length());            // length() can only be applicable in String class, not other Classes.
    System.out.println(s.charAt(0));           // charAt() can only be applicable in String class. 
    System.out.println(s.contains('e'));       // contains() can only be applicable in String class.
    System.out.println(s.indexOf('e'));        // indexOf() can only be applicable in String class.
    System.out.println(s.replace('e', 'x'));   // replace() can only be applicable in String class.
    System.out.println(s);
    
  }
}
