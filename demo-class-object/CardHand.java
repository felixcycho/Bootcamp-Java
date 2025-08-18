public class CardHand {
  private Card[] cards;

  private CardHand() {
    this.cards = new Card[0];
  }

  public CardHand(Card c1, Card c2, Card c3, Card c4, Card c5) {
    this.cards = new Card[] {c1, c2, c3, c4, c5};
  }

  public void add(Card card) {

  }

  public boolean isFullHouse() {
    if (this.cards.length != 5) return false;
    int count[] = new int[13];
    for (int i = 0; i < cards.length; i++) {
      count[cards[i].getRank() - 1]++;
    }
    int countZero = 0;
    int countThree = 0;
    int countTwo = 0;
    for (int i = 0; i < count.length; i++) {
      if(count[i] == 0) 
        countZero++;
      if(count[i] == 2) 
        countTwo++;
      if(count[i] == 3) 
        countThree++;
    }
    return countZero == 11 && countThree == 1 && countTwo == 1;
  }

  // main method; 其實, 如果多個 java sheets 共同運行, 則只可有其中一個 java sheet 有 main method.
  // 其他 java sheets 則不得有 main method.
  public static void main(String[] args) {
    // Card[] = {}

  }
}
