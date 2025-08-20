import java.util.Arrays;

public class CardDealer {
  // 被動方
  private CardDeck deck;
  private CardPlayer[] players = new CardPlayer[4];    // 一開始就鎖死四個 players, 不許後期增減 players 數量.

  // Constructor
  // public CardDealer() {
    // this.deck = new CardDeck();
  // }
  public CardDealer(CardDeck deck, CardPlayer player1, CardPlayer player2, CardPlayer player3, CardPlayer player4) {
    this.deck = deck;
    this.players[0] = player1;
    this.players[1] = player2;
    this.players[2] = player3;
    this.players[3] = player4;
  }
  
  // 主動方 dealer
  public void distribute() {
    int numOfCards = deck.getCards().length;
    for (int i = 0; i < numOfCards; i++) {
      // 1. 4 players
      this.players[i % 4].receive(deck.getCards()[0]);
      // 2. remove the card address in deck card array
      deck.removeCard(0);
    }
  }

  public static void main(String[] args) {
    CardPlayer p1 = new CardPlayer();
    CardPlayer p2 = new CardPlayer();
    CardPlayer p3 = new CardPlayer();
    CardPlayer p4 = new CardPlayer();
    CardDeck d1 = new CardDeck();
    
    CardDealer dealer = new CardDealer(d1, p1, p2, p3, p4);
    dealer.distribute();
    System.out.println("Cards = " + Arrays.toString(d1.getCards()));
    System.out.println("Player 1 cards = " + Arrays.toString(p1.getCards()));
    System.out.println("Player 2 cards = " + Arrays.toString(p2.getCards()));
    System.out.println("Player 3 cards = " + Arrays.toString(p3.getCards()));
    System.out.println("Player 4 cards = " + Arrays.toString(p4.getCards()));


  }

}
