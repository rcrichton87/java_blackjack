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

  // public String drawCard(Deck deck){
  //   int randomNum = ThreadLocalRandom.current().nextInt(0, deck.getSize() + 1);
  //   Card card = 
  // }

}