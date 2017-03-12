package card_game;

import java.util.*;

public class Player{

  String name;
  ArrayList<Card> drawnCards;

  public Player(String name){
    this.name = name;
    this.drawnCards = new ArrayList<Card>();
  }

  public String getName(){
    return name;
  }

  public int getNumberOfDrawnCards(){
    return drawnCards.size();
  }

  public void drawCard(Deck deck){
    Card card = deck.getCard(0);
    drawnCards.add(card);
    deck.removeCard(0);
  }

  public int cardsTotalValue(){
    int total = 0;
    for (Card card : drawnCards){
      total += card.getValue();
    }
    return total;
  }

  public void setAceValueToOne(){
    for (Card card : drawnCards){
      card.setAceValueToOne();
      if (card.getValue() == 1){
        return;
      }
    }
  }

  public ArrayList<Card> getDrawnCards(){
    return drawnCards;
  }



}