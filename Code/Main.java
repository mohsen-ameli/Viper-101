/**
* Names: Mohsen, Arshia, Zain 
* Date: May 10, 2022
* Description: The brains of the system. the core functionality where the dead seeds
* grow, gloom, and give the fruits of labor.
*/

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // vars
        int choice;
        int character = 0;
        int gun = 0;
        int mode = 0;
        int randNum = 0; 
        int action;
        int armor;
        int hp = 1;
        int set_choice;
        int randShoot = 0;
        boolean exit = false;

        // scanner
        Scanner in = new Scanner(System.in);

        // random num
        Random rand = new Random();

        // Settings and Shop
        Settings setting = new Settings(2, 5, true, "ENG", true);
        Shop mainShop = new Shop("Edge of heaven", 0, "Forgiven Angel", "Angel");

        // Guns
        Gun [] guns = new Gun[3];
        guns[0] = new Gun("AK47", 7.62, 6.9, "butt ton", 1);
        guns[1] = new Gun("M416", 5.56, 4.20, "lil bit", 5);
        guns[2] = new Gun("Infinity Edge", 15, 25, "holy shed", 95);

        // Character
        Charecters [] chars = new Charecters[4];
        chars[0] = new Charecters (60, "WhiteShadow", "whiteVoid", "Female", 50, "Darkness cannot drive out darkness, only light can do");
        chars[1] = new Charecters (80, "Aiden", "Phonix", "Male", 50, "What matters most is how well you walk through the fire");
        chars[2] = new Charecters (100, "Valvette", "Rage Of Allfather", "Female", 50, "Let your soul stand cool and composed before a million universes");
        chars[3] = new Charecters (50, "Huxley", "Decoy", "Male", 50, "I am your reflection");

        // Maps
        Map snowy = new Map("snowy", "Sweden", 10, -8);
        Map hot = new Map("sunny", "Sahara", .5, 25);

        // GameModes
        GameMode [] games = new GameMode[2];
        games[0] = new Arena(hot, 3, true, 10, 20, 5);
        games[1] = new BattleRoyal(snowy, 7, true, 30, 120, 150, 300);

        // spawning obstacles
        ((BattleRoyal) games[1]).spawnStuff(hot);

        // decreasing health because of temp
        hot.tempHealthDecrease(chars[0]);


        //////////////// CHOOSING STUFF \\\\\\\\\\\\\\\\
        System.out.println("Hey there, please choose an option");
        do {
            try {
                System.out.print("Type (1) to show character, (2) to view settings, (3) to go to shop, and (69) to exit : ");
                choice = in.nextInt();

                System.out.println();

                if (choice == 1) { // playing
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

                } else if (choice == 2) { // settings
                    System.out.println(setting.toString());
                    System.out.print("Please choose (1) to chnage graphics, (2) change audio lvls (3) change VSync \n(4) change auto sprinting (5) change the language (6) change controls : ");

                    set_choice = in.nextInt();
                    System.out.println();

                    if (set_choice == 1) {
                        System.out.print("Please enter a number (1-5) : ");
                        set_choice = in.nextInt();
                        setting.chnageGraphics(set_choice);
                    } else if (set_choice == 2) {
                        System.out.print("Please enter a number (0-10) : ");
                        double set = in.nextDouble();
                        setting.changeAudio(set);
                    } else if (set_choice == 3) {
                        setting.changeVSync();
                    } else if (set_choice == 4) {
                        setting.changeAutoSprint();
                    } else if (set_choice == 5) {
                        System.out.print("Please enter the new language : ");
                        String language = in.next();
                        setting.changeLanguage(language);
                    } else if (set_choice == 6) {
                        System.out.print("Please type the movement: forward, backward, left, right, jump, crouch : ");
                        String control = in.next();
                        System.out.print("Please type the key you would like to bind it with : ");
                        String key = in.next();
                        setting.changeControls(control, key);
                    }


                } else if (choice == 3) { // shop
                    System.out.println(mainShop.toString());
                } else if (choice == 69) { // leaving
                    System.out.println("Bye for now lol");
                    exit = true;
                    hp = 0 ;
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


        //////////////// MAIN GAME LOOP \\\\\\\\\\\\\\\\
        while (hp != 0) {
            randNum = rand.nextInt(50);
            randShoot = rand.nextInt(2);
            armor = chars[character].getArmor();
            hp = chars[character].getHealth();

            System.out.print("Your charcter can (1) move, (2) heal, (3) armour up, and (4) use skill [no dmg guaranteed] : ");
            action = in.nextInt();
            System.out.println();

            if (action == 1) {
                chars[character].move();
            } else if (action == 2) {
                chars[character].heal();
            } else if (action == 3) {
                chars[character].armorUp();
            } else if (action == 4) {
                chars[character].useSkill();
                randShoot = 0;
            }

            if (randShoot == 1) { // if the computer decides to shoot the character
                if (armor > 0) { // if user has armor then ...
                    chars[character].setArmor(armor - randNum);
                    armor = chars[character].getArmor();
                } else { // user has no armor, decreasing health..
                    chars[character].setHealth(hp - randNum);
                    hp = chars[character].getHealth();
                }
                System.out.printf("Ooof you just took %s dmg \n", randNum);
            } else {
                System.out.println("No dmg, lucky this round!");
            }

            System.out.printf("Health : %s/100, Armor : %s/50 \n", chars[character].getHealth(), chars[character].getArmor());
            System.out.println();
        }

        System.out.println("GAME OVER! U LOST!");

        in.close();
    }
}
