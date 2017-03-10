import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;


public class BlackJackTest{

  BlackJack game;

  @Before
  public void before(){
    game = new BlackJack("Ross");
  }

  @Test
  public void testGameHasDealer(){
    Player dealer = game.getDealer();
    assertEquals("Dealer", dealer.getName());
  }

  @Test
  public void testGameHasPlayer(){
    Player player = game.getPlayer();
    assertEquals("Ross", player.getName());
  }

  @Test
  public void testGameHas52CardDeck(){
    Deck deck = game.getDeck();
    assertEquals(52, deck.getSize());
  }

  @Test
  public void testDealerHas2CardsAfterSetup(){
    game.setup();
    Player dealer = game.getDealer();
    assertEquals(2, dealer.getNumberOfDrawnCards());
  }

  @Test
  public void testPlayerHas2CardsAfterSetup(){
    game.setup();
    Player player = game.getPlayer();
    assertEquals(2, player.getNumberOfDrawnCards());
  }

}