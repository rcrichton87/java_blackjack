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
    Random rand = new Random(); 
    int randomNumber = rand.nextInt(deck.getSize());
    Card card = deck.getCard(randomNumber);
    drawnCards.add(card);
    deck.removeCard(randomNumber);
  }

  public int cardsTotalValue(){
    int total = 0;
    for (Card card : drawnCards){
      total += card.getValue();
    }
    return total;
  }



}