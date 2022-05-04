import java.util.InputMismatchException;
import java.util.Scanner;

/**
* Names: Mohsen, Arshia, Zain 
* Date: May 3, 2022
* Description: The brains of the system. the core functionality where the dead seeds
* grow, gloom, and give the fruits of labor.
*/

public class Main {
    public static void main(String[] args) {
        int choice;
        boolean exit = false;
        Scanner in = new Scanner(System.in);

        Settings setting = new Settings(4, 10, true, "ENG", true);

        Shop mainShop = new Shop("Edge of heaven", 0, "Forgiven Angel", "Angel");

        Gun [] guns = new Gun[2];

        guns[0] = new Gun("AK47", 7.62, 6.9, "butt ton", 1);
        guns[1] = new Gun("M416", 5.56, 4.20, "lil bit", 5);

        Charecters [] chars = new Charecters[4];

        chars[0] = new Charecters (100, "white Shadow", "whiteVoid", "Female", 25, "Darkness cannot drive out darkness, only light can do");
        chars[1] = new Charecters (80, "aiden", "Phonix", "Male", 50, "What matters most is how well you walk through the fire");
        chars[2] = new Charecters (100, "Valvette", "Rage Of Allfather", "Female", 50, "Let your soul stand cool and composed before a million universes");
        chars[3] = new Charecters (50, "Huxley", "Decoy", "Male", 50, "I'm your reflection");

        Map snowy = new Map("snowy", "Sweden", 10, -8);
        Map cozy = new Map("sunny", "Iran", .5, 25);

        GameMode [] games = new GameMode[2];

        games[0] = new Arena(cozy, 3, true, 10, 20, 5);
        games[1] = new BattleRoyal(snowy, 7, true, 30, 120, 150, 300);


        //////////////// MAIN GAME LOOP \\\\\\\\\\\\\\\\
        System.out.println("Hey there, please choose an option");
        do {
            try {
                System.out.print("Type 1 to show character, 2 to show all maps and game modes available, 3 to view settings, 4 to go to shop, 5 to shows guns, and 69 to exit : ");
                System.out.println();

                choice = in.nextInt();
                if (choice == 1) {
                    for (int i = 0; i < chars.length; i++) {
                        System.out.println(chars[i].toString());
                    }
                } else if (choice == 2) {
                    for (int i = 0; i < games.length; i++) {
                        System.out.println(games[i].toString());
                    }
                } else if (choice == 3) {
                    System.out.println(setting.toString());
                } else if (choice == 4) {
                    System.out.println(mainShop.toString());
                } else if (choice == 5) {
                    for (int i = 0; i < games.length; i++) {
                        System.out.println(guns[i].toString());
                    }
                } 
                else if (choice == 69) {
                    System.out.println("Bye for now lol");
                    exit = true;
                } else {
                    System.out.println("Pleas enter a correct number");
                }

                System.out.println();
                in.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("woops try again ...");
                System.out.println();
                in.nextLine();
            }   
        } while(!exit);

        in.close();
    }
}
