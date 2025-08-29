public class EmailDatabase extends Database {
  @Override
  public String read() {
    return super.size() > 0 ? super.getStrings().get(super.size() - 1) : null;
  }

  @Override
  public void write(String data) {
    super.write(data);
  }
}
