import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;


public class CardTest{

  Spade card1;
  Heart card2;
  Club card3;
  Diamond card4;

  @Before
  public void before(){
    card1 = new Spade(CardType.TWO);
    card2 = new Heart(CardType.ACE);
    card3 = new Club(CardType.KING);
    card4 = new Diamond(CardType.QUEEN);
  }

  @Test
  public void testCardHasValue(){
    assertEquals(2, card1.getValue());
  }

  @Test
  public void testCardHasType(){
    assertEquals("two", card1.getType());
  }

  @Test
  public void testCardHasSuit(){
    assertEquals("Spades", card1.getSuit());
  }

  @Test
  public void testAceHasValue(){
    assertEquals(11, card2.getValue());
  }

  @Test
  public void testKingHasType(){
    assertEquals("king", card3.getType());
  }

  @Test
  public void testQueenHasSuit(){
    assertEquals("Diamonds", card4.getSuit());
  }

  @Test
  public void testSetAceToOne(){
    card2.setAceValueToOne();
    assertEquals(1, card2.getValue());
  }


}