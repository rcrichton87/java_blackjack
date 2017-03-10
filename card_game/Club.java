package card_game;

public class Club implements Card {

  CardType type;
  int value;
  String suit;

  public Club(CardType type){
    this.type = type;
    this.value = type.getValue();
    this.suit = "Clubs";
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