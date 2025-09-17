public enum Currency {
  HKD ("Hong Kong Dollar", 1),
  USD ("US Dollar", 2),
  CNY ("Chinese Yuan", 3),
  AUD ("Australian Dollar", 4),
  ;

  private String description;
  private int value;

  private Currency(String description, int value) {
    this.description = description;
    this.value = value;
  }

  public int getValue() {
    return this.value;
  }

  public String getDescription() {
    return this.description;
  }






  
}
