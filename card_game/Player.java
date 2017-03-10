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

  public String drawCard(Deck deck){
    Random rand = new Random(); 
    int randomNumber = rand.nextInt(deck.getSize() + 1); 
    Card card = deck.getCard(randomNumber);
    drawnCards.add(card);
    deck.removeCard(randomNumber);
    return name + "drew a " + card.getType() + " of " + card.getSuit();
  }

}