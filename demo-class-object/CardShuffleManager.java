public class CardShuffleManager {
  private Card[] cards;

  public CardShuffleManager(Card[] cards) {
    this.cards = cards;
  }

  public void shuffle(int times) {
    // ... this cards
    // random 0 - 51
    // two-tier for-loops

  }
  
  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {

    // 有多少個 objects, depends on how many "news" existing.
    // For the example of CardDeck(), 52 objects exist.
    CardDeck d1 = new CardDeck();
    CardShuffleManager sm = new CardShuffleManager(d1.getCards());
    // 洗牌次數, 可選 30, 40, 甚至 100 也可以
    sm.shuffle(30);

    d1.getCards();

  }
}
