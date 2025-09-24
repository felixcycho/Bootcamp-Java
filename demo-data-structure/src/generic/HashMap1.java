package generic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// HashMap, by compile time, 可任意 define.
// But, by run time, 不能更改 definition.
public class HashMap1<T, U> {
  private List<Entry1<T, U>> entries;

  // Constructor
  public HashMap1() {
    this.entries = new ArrayList<>();
  }

  public U get(T key) {
    for (Entry1<T, U> entry : this.entries) {
      if (entry.getKey().equals(key)) {
        return entry.getValue();
      }
    }
    return null;
  }

  public int size() {
    return this.entries.size();
  }

  public U put(T key, U newValue) {
    // loop entry
    // boolean isFound = false;
    for (Entry1<T, U> entry : this.entries) {
      // if key exists, arraylist.set()
      if (entry.getKey().equals(key)) {
        // isFound = true;
        entry.setValue(newValue);
        return newValue;
      }
    }
    // if key not exist, arraylist.add()
    this.entries.add(new Entry1<>(key, newValue));
    return newValue;
    // if key exists, arraylist.set()
    // if key not exist, arraylist.add()

  }
  
  // T 和 U, 由 user 去 define.
  // 下列 public static class Entry1<T, U>, 可放入 class HashMap, 亦可放出外面.
  public static class Entry1<T, U> {
    private T key;
    private U value;

    public Entry1(T key, U value) {
      this.key = key;
      this.value = value;
    }

    public T getKey() {
      return this.key;
    }

    public U getValue() {
      return this.value;
    }

    public void setValue(U value) {
      this.value = value;
    }

  }

  public static void main(String[] args) {
    HashMap1<String, String> nameMap = new HashMap1<>();
    nameMap.put("John", "Smart");
    nameMap.put("Betty", "Good");
    nameMap.put("Lucas", "Bad");
    System.out.println(nameMap.size());                        // 3
    System.out.println(nameMap.get("Lucas"));                  // Bad

  }
}
