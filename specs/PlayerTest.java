import static org.junit.Assert.*;
import org.junit.*;
import card_game.*;

public class PlayerTest{

  Player player;

  @Before
  public void before(){
    player = new Player("Ross");
  }

  @Test
  public void testPlayerHasName(){
    assertEquals("Ross", player.getName());
  }

}