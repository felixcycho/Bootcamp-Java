import java.time.LocalDate;
import java.util.Optional;

public class DemoOptional {
  public static final String[] names = new String[] {"John", "Lucas", "Jennie"};
  public static final Book[] books = new Book[] {
    new Book(LocalDate.of(2020, 10, 20), "ABC"),
    new Book(LocalDate.of(2021, 1, 1), "DEF"),
    new Book(LocalDate.of(1999, 12, 31), "IJK")
  };
  // 2020-10-20, "ABC"
  // 2021-01-01, "DEF"
  // 1999-12-31, "IJK"

  public static class Book {
    private LocalDate dateOfPublish;
    private String name;

    public Book(LocalDate dateOfPublish, String name) {
      this.dateOfPublish = dateOfPublish;
      this.name = name;
    }

    public LocalDate getDateOfPublish() {
      return this.dateOfPublish;
    }

    public String getName() {
      return this.name;
    }

    @Override
    public String toString() {
      return "Book ("
      + "publish date = " + this.dateOfPublish
      + ", name = " + this.name
      + ")";
    }

  }

  public static String concat(String s1, String s2) {
    if (s1 == null || s2 == null) {
      throw new IllegalArgumentException("s1 and s2 should not be null.");
    }
    return s1.concat(s2);
  }

  // searching
  public static boolean findName(String targetName) {
    if (targetName == null)
      return false;
    for (String name : names) {
      if (targetName.equals(name))
        return true;
    }
    return false;
  }

  // searching Book name (contains characters...)
  public static Book findByBookName(String name) {
    if (name == null)
      throw new IllegalArgumentException("Wrong book name.");           // 意指 JVM 不能繼續 handle processing.
    for (Book book : books) {
      if (name.equals(book.getName()))
        return book;
    }
    // return null;                     // null 代表意外, 然而找不到書並不是意外, 所以不能用 null 代表 not found
    return null;                        // ! Not found. But we don't treat it as System Error.
  }

  // searching Book name (Not found -> null)
  public static Optional<Book> findByBookName2(String name) {
    if (name == null)
      throw new IllegalArgumentException("Wrong book name.");          // 意指 JVM 不能繼續 handle processing.
    for (Book book : books) {
      if (name.equals(book.getName()))
        return Optional.of(book);             // Optional Object, 用於裝空氣的盒
    }
    // return null;                    // null 代表意外, 然而找不到書並不是意外, 所以不能用 null 代表 not found
    return Optional.empty();           // Optional.empty() 是 Optional Object, 代表用盒裝住空氣, 
                                         // 不是 null, 是 developer 為保護 caller 而設的安全制.
  }

  // Optional<List<Book>>
  // Find all books with publish date after 2020.
  // List<Book> --> ArrayList with size 0
  // Optional<List<Book>> --> Optional object with null value
  public static Optional<Book> findBookByDateOfPublish(LocalDate dateOfPublish) {
    if (dateOfPublish == null) 
      throw new IllegalArgumentException("Wrong target date.");
    for (Book book : books) {
      if (dateOfPublish.isBefore(book.getDateOfPublish())
         || dateOfPublish.equals(book.getDateOfPublish())) {
        return Optional.of(book);                                 // Optional Object
      }
    }
    return Optional.empty();                                      // Optional Object
  }


  public static void main(String[] args) {
    // Optional<T>  (意指 box <>, 裝住 T value)
    // caller 去 call concat method.
    // System.out.println(concat(null, "world."));         // nullworld. (by default)   (JVM 默認 null 是 String.)
    // System.out.println(concat(null, "world."));         // 因 developer 設立 static method, 自動彈出 Exception, JVM 不處理 call method.
    
    // ! Return type --> Optional --> Searching
    System.out.println(findByBookName2("IJK"));            // Optional[Book (publish date = 1999-12-31, name = IJK)]
    System.out.println(findByBookName2("OPQ"));            // Optional.empty

    Optional<Book> targetBook = findByBookName2("OPQ");
    if (targetBook.isPresent()) {
      System.out.println("Book = " + targetBook.get());
    } else {                                               // empty
      System.out.println("Book is not found.");
    }

    // ! isPresent() is more useful than ifPresent()
      // but should be cooperated with get()
    Optional<Book> targetBook2 = findBookByDateOfPublish(LocalDate.of(2020, 1, 1));
    if (targetBook2.isPresent()) {
      System.out.println("Book = " + targetBook2.get());
    } else {
      System.out.println("Book is not found.");
    }

    // ! Declare Optional (of, empty, ofNullable)
    Book b1 = null;
    // Optional.of(b1);            // ! Error!!! of() cannot serve for null value
    Optional.ofNullable(b1);       // OK. ofNullable() allows null or non-null value
    Optional<Book> b2 = Optional.empty();

    // ! isPresent() --> boolean
      // if true --> get();
      // if false --> another flow
    // ! ifPresent() --> handle true flow only.
      // ! isPresent() or ifPresent 只是觀察盒內情況, 並非拆盒.
    findByBookName2("ABC").ifPresent(e -> {
      System.out.println(e.getDateOfPublish());
      System.out.println(e.getName());
    });
    findByBookName2("XYZ").ifPresent(e -> {
      System.out.println(e.getDateOfPublish());
      System.out.println(e.getName());
    });

    // ! get the value from Optional Object:
    // 1. get() (after isPresent())
    // 2. orElse()
    // The following orElse() and orElseThrow() 表示想拆盒.
    Book targetBook3 = findByBookName2("MNO").orElse(null);
    System.out.println(targetBook3);
    Book targetBook4 = findByBookName2("MNO").orElse(new Book(LocalDate.of(1970, 1, 1), "DEFAULT"));
    System.out.println(targetBook4);
    Book targetBook5 = findByBookName2("MNO").orElseThrow(() -> new RuntimeException("Book not found."));
    System.out.println(targetBook5);

  }

}
