/**
* Names: Mohsen, Arshia, Zain 
* Date: May 3, 2022
* Description: The brains of the system. the core functionality where the dead seeds
* grow, gloom, and give the fruits of labor.
*/

public class Main {
    public static void main(String[] args) {

        Charecters whiteShadow = new Charecters (100, "white Shadow", "whiteVoid", "Female", 25, "Darkness cannot drive out darkness, only light can do");
        Charecters aiden = new Charecters (80, "aiden", "Phonix", "Male", 50, "What matters most is how well you walk through the fire");
        Charecters valvette = new Charecters (100, "Valvette", "Rage Of Allfather", "Female", 50, "Let your soul stand cool and composed before a million universes");
        Charecters huxley = new Charecters (50, "Huxley", "Decoy", "Male", 50, "I'm your reflection");

        Map snowy = new Map("snowy", "Sweden", 10, -8);
        Map cozy = new Map("sunny", "Iran", .5, 25);

        GameMode [] games = new GameMode[2];

        games[0] = new Arena(cozy, 3, true, 10, 20, 5);
        games[1] = new BattleRoyal(snowy, 7, true, 30, 120, 150, 300);

        System.out.println(games[0].toString());
        System.out.println();
        System.out.println(games[1].toString());
    }
}
