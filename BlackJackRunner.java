import card_game.*;
import java.util.*;

public class BlackJackRunner{

  public static void main(String[] args) {
    
    System.out.println("Please enter your name:");
    String name = System.console().readLine();

    BlackJack game = new BlackJack(name);
    game.setup();

    boolean gameOver = false;

    Player player = game.getPlayer();
    Player dealer = game.getDealer();

    while (gameOver == false) {

      

      ArrayList<Card> playerDrawnCards = player.getDrawnCards();
      System.out.println(player.getName() + " has:");
      for (Card card : playerDrawnCards) {
        System.out.println("The " + card.getType() + " of " + card.getSuit());
      }
      System.out.println("Total: " + player.cardsTotalValue());
      if (game.totalAbove16(player) == false){
        game.takeTurn(player);
        Card drawnCard = playerDrawnCards.get(player.getNumberOfDrawnCards() - 1);
        System.out.println("Drew " + drawnCard.getType() + " of " + drawnCard.getSuit());
        if (player.cardsTotalValue() > 21){
          player.setAceValueToOne();
        }
        if (player.cardsTotalValue() > 21){
          System.out.println("Bust!");
          gameOver = true;
        }
      }
      else {
        System.out.println("Stick!");
      }
      System.out.println("Total: " + player.cardsTotalValue());

      if(gameOver == true){
        break;
      }

      ArrayList<Card> dealerDrawnCards = dealer.getDrawnCards();
      System.out.println(dealer.getName() + " has:");
      for (Card card : dealerDrawnCards) {
        System.out.println("The " + card.getType() + " of " + card.getSuit());
      }
      System.out.println("Total: " + dealer.cardsTotalValue());
      if (game.totalAbove16(dealer) == false){
        game.takeTurn(dealer);
        Card drawnCard = dealerDrawnCards.get(dealer.getNumberOfDrawnCards() - 1);
        System.out.println("Drew " + drawnCard.getType() + " of " + drawnCard.getSuit());
        if (dealer.cardsTotalValue() > 21){
          dealer.setAceValueToOne();
        }
        if (dealer.cardsTotalValue() > 21){
          System.out.println("Bust!");
          gameOver = true;
        }
      }
      else {
        System.out.println("Stick!");
      }
      System.out.println("Total: " + dealer.cardsTotalValue());

      if (game.totalAbove16(player) == true && game.totalAbove16(dealer) == true){
        gameOver = true;
      }

    }

    if (game.getWinner() == null) {
      System.out.println("Draw!");
    }
    else {
      System.out.println(game.getWinner().getName() + " wins with total " + game.getWinner().cardsTotalValue());
    }

  }
}