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

  // @Test
  // public void testPlayerCanDrawCardFromDeck(){
  //   player.drawCard(deck);
  //   assertEquals(1, player.getNumberOfDrawnCards());
  //   assertEquals(51, deck.getSize());
  // }



}