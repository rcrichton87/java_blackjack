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

  public void takeTurn(Player player){
    player.drawCard(deck);
  }

  public Player getWinner(){
    if (player.cardsTotalValue() > 21){
      return dealer;
    }
    else if (dealer.cardsTotalValue() > 21){
      return player;
    }
    else if (player.cardsTotalValue() > dealer.cardsTotalValue()){
      return player;
    }
    else if (dealer.cardsTotalValue() > player.cardsTotalValue()){
      return dealer;
    }
    else {
      return null;
    }
  }

  public boolean totalAbove16(Player player){
    if (player.cardsTotalValue() > 16){
      return true;
    }
    else {
      return false;
    }
  }

}
