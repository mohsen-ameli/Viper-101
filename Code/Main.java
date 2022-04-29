public class Main {
    public static void main(String[] args) {
        BattleRoyal rankedBR = new BattleRoyal("Snowy", "Sweden", 10, 69, true);
        Arena rankedArena = new Arena(7, 5, 3, true);

        System.out.println(rankedBR.toString());
        System.out.println();
        System.out.println(rankedArena.toString());
    }
}
