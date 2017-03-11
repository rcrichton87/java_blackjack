package card_game;

public class BlackJack implements Game {

  Player dealer;
  Player player;
  Deck deck;

  public BlackJack(String name){
    this.dealer = new Player("Dealer");
    this.player = new Player(name);
    deck = new Deck();
    deck.freshDeck();
  }

  public void setup(){
    player.drawCard(deck);
    player.drawCard(deck);
    dealer.drawCard(deck);
    dealer.drawCard(deck);
  }

  public Player getDealer(){
    return dealer;
  }

  public Player getPlayer(){
    return player;
  }

  public Deck getDeck(){
    return deck;
  }

  public void playerTakeTurn(){
    player.drawCard(deck);
  }



 } 