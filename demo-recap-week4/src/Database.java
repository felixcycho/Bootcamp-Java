import java.util.ArrayList;
import java.util.List;

public abstract class Database implements Writable, Readable {
  private List<String> strings;

  public Database() {
    this.strings = new ArrayList<>();
  }

  @Override
  public void write(String data) {
    this.strings.add(data);
  }

  public List<String> getStrings() {
    return this.strings;
  }

  public int size() {
    return this.strings.size();
  }

  // abstract String read();
  // abstract void write(String string);
}
