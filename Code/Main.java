public class Main {
    public static void main(String[] args) {

        Charecters whiteShadow = new Charecters (100, "white Shadow", "whiteVoid", "Female", 25, "Darkness cannot drive out darkness, only light can do");
        Charecters aiden = new Charecters (80, "aiden", "Phonix", "Male", 50, "What matters most is how well you walk through the fire");
        Charecters valvette = new Charecters (100, "Valvette", "Rage Of Allfather", "Female", 50, "Let your soul stand cool and composed before a million universes");
        Charecters huxley = new Charecters (50, "Huxley", "Decoy", "Male", 50, "I'm your reflection");

        BattleRoyal rankedBR = new BattleRoyal("Snowy", "Sweden", 10, 69, true);
        Arena rankedArena = new Arena(7, 5, 3, true);
        Map snowy = new Map("snowy", "Sweden", 10);

        GameMode [] games = new GameMode[2];

        games[0] = new Arena(3, 5, 10, false, snowy);
        // Arena rankedArena = new Arena(7, 5, 3, true);

        System.out.println(games[0].toString());
        System.out.println();
        // System.out.println(rankedArena.toString());
    }
}
