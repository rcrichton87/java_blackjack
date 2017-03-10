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
}