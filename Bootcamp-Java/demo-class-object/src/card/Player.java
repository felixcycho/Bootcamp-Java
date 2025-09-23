package card;

class Player {
  private Card[] cards;

  // Constructor
  public Player() {
    this.cards = new Card[0];
  }

  public Card[] getCards() {
    return this.cards;
  }

  public void receive(Card newCard) {
    Card[] newCards = new Card[this.cards.length + 1];
    for (int i = 0; i < this.cards.length; i++) {
      newCards[i] = this.cards[i];
    }
    newCards[newCards.length - 1] = newCard;
    this.cards = newCards;

  }
  
}
