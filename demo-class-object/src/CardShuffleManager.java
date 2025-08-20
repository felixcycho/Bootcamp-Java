import java.util.Arrays;
import java.util.Random;

public class CardShuffleManager {
  private Card[] cards;

  public CardShuffleManager(Card[] cards) {
    this.cards = cards;
  }

  public Card[] shuffle(int times) {
    // ... this cards
    // random 0 - 51
    // two-tier for-loops
    if (times < 0) {
      return this.cards;
    }
    for (int t = 0; t < times; t++) {    
      Card[] newCards = new Card[this.cards.length];
      int r1 = new Random().nextInt(26);         // 0 - 25
      int r2 = new Random().nextInt(26) + 26;    // (0 - 25) + 26 => 26 - 51
      System.out.println("Position = " + r1);
      System.out.println("Current position = " + Arrays.toString(this.cards));
      // r1 = 17; r2 = 23
      for (int i = r1; i < r2; i++) {
        // this.cards[i] 是 object, 抑或 address, 則視乎是 "=" 的左方抑或右方.
        // 如果 this.cards[i] 放在左方, 則是 address.
        // 如果 this.cards[i] 放在右方, 則是 object.
        System.out.println(i - r1);
        newCards[i - r1] = this.cards[i];
      }
      for (int i = 0; i < r1; i++) {    
        System.out.println(newCards.length - r1 + i);
        newCards[r2 - r1 + i] = this.cards[i];
      }
      for (int i = r2; i < this.cards.length; i++) {
        newCards[i] = this.cards[i];
      }
      // 將 newCards 指向 new address of this.cards
      this.cards = newCards;
    }
    return this.cards;
  }
  
  
  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {

    // 有多少個 objects, depends on how many "news" existing.
    // For the example of CardDeck(), 52 objects exist.
    CardDeck d1 = new CardDeck();
    CardShuffleManager sm = new CardShuffleManager(d1.getCards());
    // 洗牌次數, 可選 30, 40, 甚至 100 也可以
    sm.shuffle(50);
    // System.out.println(Arrays.toString(d1.getCards()));

    // chain methods
    Card[] cardsAfterShuffle = new CardShuffleManager(d1.getCards()).shuffle(2000);

    System.out.println(Arrays.toString(cardsAfterShuffle));
    
  }
}
