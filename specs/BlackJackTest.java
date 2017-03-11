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

  @Test
  public void testPlayerCanTakeTurn(){
    Deck deck = game.getDeck();
    Card card1 = new Spade(CardType.TWO);
    Card card2 = new Heart(CardType.TWO);
    Card card3 = new Club(CardType.TWO);
    Card card4 = new Diamond(CardType.TWO);
    Card card5 = new Spade(CardType.FIVE);
    deck.getCards().clear();
    deck.addCard(card1);
    deck.addCard(card2);
    deck.addCard(card3);
    deck.addCard(card4);  //clear the deck and fill it with 2s
    game.setup();  //each player has 2 2s, for a total of 4
    deck.addCard(card5);
    game.takeTurn(game.getPlayer());  //player draws a 5
    assertEquals(9, game.getPlayer().cardsTotalValue());
  }

  @Test
  public void testHighestTotalWins(){
    Deck deck = game.getDeck();
    Card card1 = new Spade(CardType.TWO);
    Card card2 = new Heart(CardType.TWO);
    Card card3 = new Club(CardType.TWO);
    Card card4 = new Diamond(CardType.TWO);
    Card card5 = new Spade(CardType.FIVE);
    deck.getCards().clear();
    deck.addCard(card1);
    deck.addCard(card2);
    deck.addCard(card3);
    deck.addCard(card4);  
    game.setup();  
    deck.addCard(card5);
    game.takeTurn(game.getPlayer());  
    assertEquals(game.getPlayer(), game.getWinner());
  }


}