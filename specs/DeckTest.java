import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class DeckTest{

  Deck deck;

  @Before
  public void before(){
    deck = new Deck();
  }

  @Test 
  public void testDeckStartsEmpty(){
    assertEquals(0, deck.getSize());
  }

  

}