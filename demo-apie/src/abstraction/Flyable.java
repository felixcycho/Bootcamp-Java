// public class 的 class, 是用於 new.
// But, public interface 是不可 new.

// ! Interface
// 1. Skill 技能
// 2. Contract 合約
// 3. has no attribute.
// 4. has no concrete method (public & abstract methods only)
// 5. Interface is 100% abstraction (before Java 8)
public interface Flyable {
  void fly();               // implicitly public, 所以無須寫 public 這個 word.
}
