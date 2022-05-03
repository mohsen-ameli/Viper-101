public class Main {
    public static void main(String[] args) {
        Map snowy = new Map("snowy", "Sweden", 10, -8);

        GameMode [] games = new GameMode[2];

        games[0] = new Arena(3, 5, 10, false, snowy);
        // Arena rankedArena = new Arena(7, 5, 3, true);

        System.out.println(games[0].toString());
        System.out.println();
        // System.out.println(rankedArena.toString());
    }
}
