public class Card {
  // attributes, i.e. rank, suit.
  private int rank;    // rank 代表 'A', '2', '3', '4', ...., 'J', 'Q', 'K'
  private String suit;    // suit 代表 "DIAMOND", "SPADE", "HEART", "CLUB"

  // empty constructor
  // public Card() {
  // }
  // Constructor is meaningless, in this case of game.

  // GAME, should be NO setter.
  // Otherwise, 出老千.
  // setter 未必所有 cases 都需要寫.
  // 如果 developer 認為, 日後不會進行大更改, 則未必需要寫 setter.
  
  // All arguments constructor
  public Card(int rank, String suit) {
    this.rank = rank;
    this.suit = suit;
  }

  // getter
  // In most cases, 會有 getter.
  public int getRank() {
    return this.rank;
  }

  public String getSuit() {
    return this.suit;
  }

  public String toString() {
    return "Card(" //
    + "rank = " + this.rank //
    + ", suit = " + this.suit //
    + ")";
  }

  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {
    // new Card();

    new Card(1, "SPADE");

  }
}
