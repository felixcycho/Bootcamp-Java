class Secret {
  int level = 1;
}

class Password extends Secret {
  int level = 2;

  public static void main(String[] args) {
    int age = Password.level;                  
     
    System.out.println(this.level);            // java.lang.Error: Unresolved compilation problems: 
      // Cannot make a static reference to the non-static field Password.level
  }
}


