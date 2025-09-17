package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
  // Different from List (i.e. ArrayList, LinkedList), Queue and Deque (i.e. ArrayDeque),
  // Set (i.e. HashSet) is NOT concerned about Sequence / Order.
  
  static Scanner keyboard = new Scanner(System.in);

  public static void main(String[] args) {
    System.out.println("Please input a word: ");
    String str = keyboard.nextLine();

    boolean haveD = false;
    int count = 0;

    // apple
    // understand

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd') {
        haveD = true;
        break;
      }
    }
    if(haveD) {
      System.out.println("d is found.");
    } else {
      System.out.println("d is not found.");
    }

    if(!haveD) {
      System.out.println("d is not found.");
    } else {
      System.out.println("d is found.");
    }

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd') {
        haveD = true;
        count++;
      }
    }
    System.out.println("There are " + count + " d.");

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'd') {
        continue;
      }
      System.out.print(str.charAt(i));
    }
    System.out.println();

    // 入密碼較常用 do-while, do-while 先 do 後才決定是否需要 while.
    // 當入密碼失敗, java 才決定需要 while, 要求 user 重新輸入密碼.


    ArrayList<String> bookList = new ArrayList<>();

    bookList.add("AAA");
    bookList.add("BBB");
    bookList.add("CCC");
    bookList.add("DDD");
    bookList.add("AAA");
    bookList.add("AAA");

    System.out.println(bookList);
    System.out.println(bookList.size());
    // System.out.println(books.length());      invalid

    for (String i : bookList) {
      System.out.println(i);
    }

    HashSet<String> bookSet = new HashSet<>();
    for (String i : bookList) {
      bookSet.add(i);
    }
    System.out.println(bookSet);
    System.out.println(bookSet.size());

    HashSet<String> bookSet2 = new HashSet<>();

    for (int i = 0; i < bookList.size(); i++) {
      for (int j = 0; j < bookList.size(); j++) {
        if (i == j) {
          continue;
        } 
        if (bookList.get(i).equals(bookList.get(j))) {        
          // 因為 List (i.e. ArrayList, LinkedList) 與 Set (i.e. HashSet) 不得用 List[i], Set[i] 格式
          // 所以, 需要 List.get(i) 以 access to address 去提取 object.
          bookSet2.add(bookList.get(i));
        }
      }
    }
    System.out.println(bookSet2);

    LinkedList<String> bookLinkedList = new LinkedList<>();

    for (String x : bookList) {
      bookLinkedList.add(x);
    }
    System.out.println(bookLinkedList);


  }
}
