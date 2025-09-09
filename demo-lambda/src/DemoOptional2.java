import java.util.Optional;

public class DemoOptional2 {
  // ! Don't
  private Optional<String> name;          // Optional<> cannot be established as an attribute
                                             // Class, 代表數據儲存, database (i.e. MySQL, NoSQL) 不會支援 Optional<>.
                                               // 數據存輸時, 會產生大問題. 所以, Optional<> 不會離開 server 時使用.
                                                 // ! Optional<> 只可用於唯一地方, 就是 method 的 return type. 緊記!!!!
  // ! Do
  private String name2;

  // ! Don't
  public Optional<String> getName() {
    return this.name;
  }

  // ! Do
  public String getName2() {
    return this.name2;
  }

  public DemoOptional2(String name) {
    if (name == null) 
      throw new IllegalArgumentException("Name should not be null.");
    this.name2 = name;
  }

  public static void main(String[] args) {
  //   new DemoOptional2(Optional.of("John"));         // invalid, thus not construct Optional in constructor.






  }


}
