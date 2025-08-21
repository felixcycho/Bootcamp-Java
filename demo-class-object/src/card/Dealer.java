import java.util.Arrays;

public class Dealer {
  // 被動方
  private Deck deck;
  private Player[] players = new Player[4];    // 一開始就鎖死四個 players, 不許後期增減 players 數量.

  // Constructor
  // public Dealer() {
    // this.deck = new Deck();
  // }
  public Dealer(Deck deck, Player player1, Player player2, Player player3, Player player4) {
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
    Player p1 = new Player();
    Player p2 = new Player();
    Player p3 = new Player();
    Player p4 = new Player();
    Deck d1 = new Deck();
    
    Dealer dealer = new Dealer(d1, p1, p2, p3, p4);
    dealer.distribute();
    System.out.println("Cards = " + Arrays.toString(d1.getCards()));
    System.out.println("Player 1 cards = " + Arrays.toString(p1.getCards()));
    System.out.println("Player 2 cards = " + Arrays.toString(p2.getCards()));
    System.out.println("Player 3 cards = " + Arrays.toString(p3.getCards()));
    System.out.println("Player 4 cards = " + Arrays.toString(p4.getCards()));


  }

}
