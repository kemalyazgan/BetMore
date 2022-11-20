import java.util.*;
public class Game_Chair {
    private Player Player1 = Player.Computer, Player2, Winner;

    public void Start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        Player2.setName(scanner.next());
        Player1.Play();
        Player2.Play(Player2);
        FindWinner(Player1, Player2);
    }
    public void FindWinner(Player p1, Player p2) {
        BetMore_Game.chooseWinner(p1, p2);
        Winner = BetMore_Game.getWinner();
        System.out.println("The Winner is: " + Winner.getName() + " Congrats!");
        System.out.println("Computer has card: " + Player1.getCardnumber() );

    }
    public Player getPlayer1() {
        return Player1;
    }

    public void setPlayer1(Player player1) {
        Player1 = player1;
    }

    public Player getPlayer2() {
        return Player2;
    }

    public void setPlayer2(Player player2) {
        Player2 = player2;
    }



}
