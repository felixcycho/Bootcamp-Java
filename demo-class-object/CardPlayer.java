public class CardPlayer {
  private Card[] cards;

  // Constructor
  public CardPlayer() {
    this.cards = new Card[0];
  }

  public Card[] getCards() {
    return this.cards;
  }

  public void receive(Card card) {
    Card[] newCards = new Card[this.cards.length + 1];
    for (int i = 0; i < this.cards.length; i++) {
      newCards[i] = this.cards[i];
    }
    newCards[newCards.length - 1] = newCard;
    this.cards = newCards;

  }
  
}
