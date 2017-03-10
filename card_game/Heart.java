package card_game;

public class Heart implements Card {

  CardType type;
  int value;
  String suit;

  public Heart(CardType type){
    this.type = type;
    this.value = type.getValue();
    this.suit = "Hearts";
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