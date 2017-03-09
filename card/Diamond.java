package card;

public class Diamond implements Card {

  CardType type;
  int value;
  String suit;

  public Diamond(CardType type){
    this.type = type;
    this.value = type.getValue();
    this.suit = "Diamonds";
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