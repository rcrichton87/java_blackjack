package cardGroup;

import java.util.*;
import card.*;

public class Deck implements CardGroup{

  ArrayList<Card> cards;

  public Deck(){
    cards = new ArrayList<Card>();
  }

  public int getSize(){
    return cards.size();
  }

}