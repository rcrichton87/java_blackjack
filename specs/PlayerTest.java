import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

  Player player;
  Deck deck;

  @Before
  public void before(){
    player = new Player("Ross");
    deck = new Deck();
    deck.freshDeck();
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Ross", player.getName());
  }

  @Test
  public void testDrawnCardsStartsEmpty(){
    assertEquals(0, player.getNumberOfDrawnCards());
  }

  @Test
  public void testPlayerCanDrawCardFromDeck(){
    player.drawCard(deck);
    assertEquals(1, player.getNumberOfDrawnCards());
    assertEquals(51, deck.getSize());
  }

  @Test
  public void testPlayerCanDrawFromSingleCardDeck(){
    deck = new Deck();
    Card card1 = new Spade(CardType.TWO);
    deck.addCard(card1);
    player.drawCard(deck);
    assertEquals(0, deck.getSize());
  }

  @Test
  public void testPlayerCanDrawAllCards(){
    int count = 0;
    while (count < 52 ) {
      player.drawCard(deck);
      count++;
    }
    assertEquals(52, player.getNumberOfDrawnCards());
  }

  @Test
  public void testPlayerCanTotalDrawnCardValues(){
    deck = new Deck();
    Card card1 = new Spade(CardType.TWO);
    Card card2 = new Heart(CardType.ACE);
    deck.addCard(card1);
    deck.addCard(card2);
    player.drawCard(deck);
    player.drawCard(deck);
    assertEquals(13, player.cardsTotalValue());
  }

  @Test
  public void playerCanSetAcesValueToOne(){
    deck = new Deck();
    Card card1 = new Spade(CardType.TWO);
    Card card2 = new Heart(CardType.ACE);
    deck.addCard(card1);
    deck.addCard(card2);
    player.drawCard(deck);
    player.drawCard(deck);
    player.setAceValueToOne();
    assertEquals(3, player.cardsTotalValue());
  }

  @Test
  public void playerOnlyChangesOneAce(){
    deck = new Deck();
    Card card1 = new Spade(CardType.TWO);
    Card card2 = new Heart(CardType.ACE);
    Card card3 = new Spade(CardType.ACE);
    deck.addCard(card1);
    deck.addCard(card2);
    deck.addCard(card3);
    player.drawCard(deck);
    player.drawCard(deck);
    player.drawCard(deck);
    player.setAceValueToOne();
    assertEquals(14, player.cardsTotalValue());
  }



}