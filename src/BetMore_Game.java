import java.util.*;

public class BetMore_Game {
    private static Player winner;
    private static int randomNumber;

    public static Player getWinner() {
        return winner;
    }

    public static void chooseWinner(Player Player_1, Player Player_2) {
        if (Player_1.getCardnumber() < Player_2.getCardnumber()) {
            winner = Player_2;
        } else winner = Player_1;
    }
    public static void pick_card() {
        List<String> numbers = new ArrayList<String>();
        for (int i=1; i<101; i++) {
            numbers.add(Integer.toString(i));
        }
        Collections.shuffle(numbers);
        int x = Integer.parseInt(numbers.get(0));
        randomNumber = x;
    }
    public static int getRandomNumber() {
        return randomNumber;
    }


}
