package library;
public class Library {
  // books
  private Books[] books;
  // Librarian (per library)
  // in java, in this case, only 可 via Liabrary 去 find books.
  // in java, if i need to find library via books, 
  // 則須 establish Class "books", and define private Library[] library;
  
  // Bookshelf (per library)

  // Constructor --> the process of creating object
  public Library() {
    this.books = new Books[0];
  }
  
  public void add(Books books) {

  }

  private void remove(int index) {

  }

  public static void main(String[] args) {
    // new Library, LibraryBooks, LibraryBooks[], Librarian, Bookshelf
    // get and print
  }

}
