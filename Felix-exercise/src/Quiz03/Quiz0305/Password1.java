class Secret1 {
    int level = 1; // Instance variable
}

class Password1 extends Secret1 {
    int level = 2; // Instance variable

    public static void main(String[] args) {
        Password1 password = new Password1(); // Create an instance of Password1
        Secret1 secret = new Secret1();       // Create an instance of Secret1

        System.out.println("Password level: " + password.level);                 // 2
        System.out.println("Secret level: " + ((Password1) password).level);     // 2
        System.out.println("Secret level: " + ((Secret1) password).level);       // 1
        try {
          System.out.println("Password level: " + ((Password1) secret).level);   // Compile error
        } catch (ClassCastException e) {
          System.out.println("class Secret1 cannot be cast to class Password1 "
          + "(Secret1 and Password1 are in unnamed module of loader 'app')");
        }

    }
}