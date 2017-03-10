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

}