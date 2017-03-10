import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Deck deck;
  Spade card1;
  Heart card2;
  Club card3;
  Diamond card4;

  @Before
  public void before(){
    deck = new Deck();
    card1 = new Spade(CardType.TWO);
    card2 = new Heart(CardType.ACE);
    card3 = new Club(CardType.KING);
    card4 = new Diamond(CardType.QUEEN);
  }

  @Test 
  public void testDeckStartsEmpty(){
    assertEquals(0, deck.getSize());
  }

  @Test
  public void testAddCardToDeck(){
    deck.addCard(card1);
    assertEquals(1, deck.getSize());
  }

  @Test
  public void testMultipleSuitsInDeck(){
    deck.addCard(card1);
    deck.addCard(card2);
    assertEquals(2, deck.getSize());
  }

  @Test
  public void testCreateFullDeck(){
    deck.freshDeck();
    assertEquals(52, deck.getSize());
  }

  @Test 
  public void testGetCard(){
    deck.addCard(card1);
    deck.addCard(card2);
    assertEquals(card1, deck.getCard(0));
  }
  

}