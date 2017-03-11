package card_game;

public class BlackJackRunner{

  public static void main(String[] args) {
    
    System.out.println("Please enter your name:");
    String name = System.console().readLine();

    BlackJack game = new BlackJack(name);
    game.setup();

    boolean gameOver = false;
    Player player = game.getPlayer();

    while (gameOver = false) {
      
      System.out.println(player.getName() + " has");

    }

  }

}