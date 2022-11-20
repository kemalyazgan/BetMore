public class Main {
    public static void main(String[] args) {
        Player p2 = new Player("kemal");
        Game_Chair game1 = new Game_Chair();
        game1.setPlayer2(p2);
        game1.Start();

    }
}