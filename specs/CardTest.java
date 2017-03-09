import static org.junit.Assert.*;
import org.junit.*;
import card.*;


public class CardTest{

  Spade card1;

  @Before
  public void before(){
    card1 = new Spade(CardType.TWO);
  }

  @Test
  public void testCardHasNumber(){
    assertEquals(2, card1.getValue());
  }


}