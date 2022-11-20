import java.util.Scanner;
public class Player {
    private String name;
    private int cardnumber;
    public static Player Computer = new Player("Computer");
    public Player(String name) {
        this.name = name;
    }

    public void Play() {
        BetMore_Game.pick_card();;
        this.cardnumber =  BetMore_Game.getRandomNumber();
    }
    public void Play(Player player2) {
        BetMore_Game.pick_card();;
        this.cardnumber =  BetMore_Game.getRandomNumber();
        Scanner scanner = new Scanner(System.in);
        boolean over = false;
        int i = 0;
        while(!over ) {
            i++;
            BetMore_Game.pick_card();
            this.cardnumber = BetMore_Game.getRandomNumber();
            System.out.println("Current: "+ cardnumber + " Would you like to play again? y/n");
            if(!scanner.next().equals("y") | i==5) {
                over = true;
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getCardnumber() {
        return cardnumber;
    }

}
