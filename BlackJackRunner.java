import card_game.*;
import java.util.*;

public class BlackJackRunner{

  public static void main(String[] args) {
    
    System.out.println("Please enter your name:");
    String name = System.console().readLine();

    BlackJack game = new BlackJack(name);
    game.setup();

    boolean gameOver = false;

    boolean playerFinished = false;
    boolean dealerFinished = false;

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
          System.out.println("Bust! Total: " + player.cardsTotalValue());
          gameOver = true;
        }
      }
      else {
        System.out.println("Stick! Total: " + player.cardsTotalValue());
        playerFinished = true;
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
          System.out.println("Bust! Total: " + dealer.cardsTotalValue());
          gameOver = true;
        }
      }
      else {
        System.out.println("Stick! Total: " + dealer.cardsTotalValue());
        dealerFinished = true;
      }

      if (playerFinished == true && dealerFinished == true){
        gameOver = true;
      }

    }

    Player winner = null;
    if (player.cardsTotalValue() > 21) {
      winner = game.getDealer();
    }
    else if (dealer.cardsTotalValue() > 21) {
      winner = game.getPlayer();
    }
    else if (game.getWinner() != null) {
      winner = game.getWinner();
    }

    if (winner == null) {
      System.out.println("Draw!");
    }
    else {
      System.out.println(winner.getName() + " wins with total " + winner.cardsTotalValue());
    }

  }
}