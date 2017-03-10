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

  public void freshDeck(){
    Card heart;
    Card diamond;
    Card spade;
    Card club;
    for (CardType cardType : CardType.values()){
      heart = new Heart(cardType);
      diamond = new Diamond(cardType);
      spade = new Spade(cardType);
      club = new Club(cardType);
      cards.add(heart);
      cards.add(diamond);
      cards.add(spade);
      cards.add(club);
    }
  }

}