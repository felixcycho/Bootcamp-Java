public class CardDeck {

  // Attributes, 另一名稱叫 "Instance Variable",
  // Object, 另一名稱則叫 "Instance"

  // Static Variable, 比喻為 dictionary
  // static, 意指公開, 一定 follw public.
  // final, 意指將來不會修改.
  // 如果預計將來需要更改, 則一定不可加 final.
  public static final int[] RANKS = 
    new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

  public static final String[] SUITS = 
    new String[] {"DIAMOND", "CLUB", "HEART", "SPADE"};

  private Card[] cards;

  public CardDeck() {
    this.cards = new Card[RANKS.length * SUITS.length];    // 0 - 51
    int idx = 0;
    for (String suit : SUITS) {
      for (int rank : RANKS) {
        this.cards[idx] = new Card(rank, suit);
        idx++;
      }
    }
  }

  public  Card[] getCards() {
    return this.cards;
  }
  
  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {
    new CardDeck();
    // CardShuffleManager sm = new CardShuffleManager(d1.getCards());
    




  }
}
