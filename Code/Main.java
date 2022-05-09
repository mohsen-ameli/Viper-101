import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

/**
* Names: Mohsen, Arshia, Zain 
* Date: May 3, 2022
* Description: The brains of the system. the core functionality where the dead seeds
* grow, gloom, and give the fruits of labor.
*/

public class Main {
    public static void main(String[] args) {
        // vars
        int choice;
        int character = 0;
        int gun = 0;
        int mode = 0;
        int action;
        int armor;
        int hp;
        boolean exit = false;

        // scanner
        Scanner in = new Scanner(System.in);

        // random num
        Random rand = new Random();
        int randNum = 0; 

        // Settings and Shop
        Settings setting = new Settings(4, 10, true, "ENG", true);
        Shop mainShop = new Shop("Edge of heaven", 0, "Forgiven Angel", "Angel");

        // Guns
        Gun [] guns = new Gun[2];
        guns[0] = new Gun("AK47", 7.62, 6.9, "butt ton", 1);
        guns[1] = new Gun("M416", 5.56, 4.20, "lil bit", 5);

        // Character
        Charecters [] chars = new Charecters[4];
        chars[0] = new Charecters (60, "white Shadow", "whiteVoid", "Female", 50, "Darkness cannot drive out darkness, only light can do");
        chars[1] = new Charecters (80, "aiden", "Phonix", "Male", 50, "What matters most is how well you walk through the fire");
        chars[2] = new Charecters (100, "Valvette", "Rage Of Allfather", "Female", 50, "Let your soul stand cool and composed before a million universes");
        chars[3] = new Charecters (50, "Huxley", "Decoy", "Male", 50, "I'm your reflection");

        // Maps
        Map snowy = new Map("snowy", "Sweden", 10, -8);
        Map cozy = new Map("sunny", "Iran", .5, 25);

        // GameModes
        GameMode [] games = new GameMode[2];
        games[0] = new Arena(cozy, 3, true, 10, 20, 5);
        games[1] = new BattleRoyal(snowy, 7, true, 30, 120, 150, 300);


        //////////////// MAIN GAME LOOP \\\\\\\\\\\\\\\\
        System.out.println("Hey there, please choose an option");
        do {
            try {
                System.out.print("Type 1 to show character, 2 to view settings, 3 to go to shop, and 69 to exit : ");
                choice = in.nextInt();

                System.out.println();

                if (choice == 1) {
                    // choosing a Charater
                    for (int i = 0; i < chars.length; i++) {
                        System.out.println(i+1 + " - " + chars[i].toString());
                    }
                    System.out.print("Please choose a character : ");
                    character = in.nextInt() - 1;

                    System.out.println();

                    // choosing a Gun
                    for (int i = 0; i < guns.length; i++) {
                        System.out.println(i+1 + " - " + guns[i].toString());
                    }
                    System.out.print("Please choose a gun : ");
                    gun = in.nextInt() - 1;

                    System.out.println();

                    // choosing a GameMode
                    for (int i = 0; i < games.length; i++) {
                        System.out.println(i+1 + " - " + games[i].toString());
                    }
                    System.out.print("Please choose a game mode : ");
                    mode = in.nextInt() - 1;

                    exit = true;

                } else if (choice == 2) {
                    System.out.println(setting.toString());
                } else if (choice == 3) {
                    System.out.println(mainShop.toString());
                } else if (choice == 69) {
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

        exit = false;

        do {
            randNum = rand.nextInt(30);
            armor = chars[character].getArmor();
            hp = chars[character].getHealth();

            System.out.print("Your charcter can (1) move, (2) heal, (3) armour up, and (4) use skill : ");
            action = in.nextInt();

            if (action == 1) {
                chars[character].move();
            } else if (action == 2) {
                chars[character].heal();
            } else if (action == 3) {
                chars[character].armoringUp();
            } else if (action == 4) {
                chars[character].useSkill();
            }

            if (rand.nextInt(2) == 1) {
                if (armor > 0) {
                    chars[character].setArmor(armor - randNum);
                    armor = armor - randNum;
                } else {
                    chars[character].setHealth(hp - randNum);
                    hp = hp - randNum;
                }
                System.out.printf("oof you just took %s dmg \n", randNum);
            } else {
                System.out.println("lucky this round!");
            }

            System.out.printf("Health : %s, Armor : %s\n", hp, armor);
            System.out.println();
        } while (hp != 0);

        System.out.println("GAME OVER! U LOST!");

        in.close();
    }
}
