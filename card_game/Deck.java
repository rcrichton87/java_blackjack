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
    Heart heart;  //these were Cards, rather than the individual suits, passed all tests but didn't work in the runner
    Diamond diamond; //Exception in thread "main" java.lang.NoClassDefFoundError: card_game/CardType (wrong name: card/CardType) - problem with the Deck's freshDeck() method
    Spade spade; //Is this beacuse there's no setup method in Card, since it's an interface?
    Club club;
    for (CardType cardType : CardType.values()){
      heart = new Heart(cardType);
      diamond = new Diamond(cardType);
      spade = new Spade(cardType);
      club = new Club(cardType);
      cards.add(heart);
      cards.add(diamond);
      cards.add(spade);
      cards.add(club);
      Collections.shuffle(cards);
    }
  }

  public Card getCard(int index){
    return cards.get(index);
  }

  public void removeCard(int index){
    cards.remove(index);
  }

  public ArrayList<Card> getCards(){
    return cards;
  }

}