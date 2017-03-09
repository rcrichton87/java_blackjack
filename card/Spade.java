package card;

public class Spade implements Card {

  CardType type;
  int value;

  public Spade(CardType type){
    this.type = type;
    this.value = type.getValue();
  }

  public int getValue(){
    return value;
  }

}