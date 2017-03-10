package card_game;

import java.util.*;

public class Deck{

  ArrayList<Card> cards;

  public Deck(){
    cards = new ArrayList<Card>();
  }

  public int getSize(){
    return cards.size();
  }

  public void addCard(Card card){
    cards.add(card);
  }

}