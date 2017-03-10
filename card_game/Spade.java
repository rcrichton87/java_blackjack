package card_game;

public class Spade implements Card {

  CardType type;
  int value;
  String suit;

  public Spade(CardType type){
    this.type = type;
    this.value = type.getValue();
    this.suit = "Spades";
  }

  public int getValue(){
    return value;
  }

  public String getType(){
    return type.toString().toLowerCase();
  }

  public String getSuit(){
    return suit;
  }

}