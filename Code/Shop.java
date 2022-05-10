/**
 * Course: ICS4U1
 * Date: May. 10th, 2022
 * @author Zain Siddiqui
 */

public class Shop {
   /*
    Attributes
    */
    private String characterSkins;
    private int currency;
    private String gunSkins;
    private String charms;
   
    /*
    Constructor
    */
    /**
     * Plays the specified file taken by the attributes
     * @param filePath -> the file path to the file that will be played
     * @param characterSkins -> The user is able to buy and select which character skin they want.
     * @param currency -> this a currency used in the game that allows the user to buy the items in the shop.
     * @param gunSkins -> Thee user can buy and use which gun skin they want. 
     * @param charms -> orniments in a gun 
     */
    public Shop (String characterSkins, int currency, String gunSkins, String charms) {
        this.characterSkins = characterSkins;
        this.currency = currency;
        this.gunSkins = gunSkins;
        this.charms = charms; 
    }

    /*
    Accessors
    */
    public String getCharacterSkins() {return characterSkins;}
    public int getcurrency() {return currency;}
    public String getGunSkins() {return gunSkins;}
    public String getCharms() {return charms;}
    
    /*
    Methods
    */
    /**
     * if the currency is less then 0 then the user cannot buy anything
     * Print whatever value of currency the user has and if it is higher than o then the user can buy thyings.
     * @param curr -> amount of currency to buy
     */
    public void buyCurr(int curr) { 
        if (curr < 0) { 
            System.out.println("You cannot buy zero currency!");
            System.out.println("Current balance : " + this.currency);
        } else {
            this.currency = curr;
            System.out.println("Congrats, you now have : " + this.currency + " on your ballance!");
        }
    }
    /**
     * if the cost is greater than the currency you have then sorry you cannot buy anything
     * otherwise if you do have enough currency it will be subtracted from the cost and print 
     * which skin you have bought and the amount of currency you have left.
     * @param skin -> the skin the user wants to buy
     * @param cost -> the cost of the skin
     */ 
    public void buyCharSkin(String skin, int cost) {
        if (this.currency == 0 || cost > this.currency) { 
            System.out.println("You do not have any money! go buy some NOW!");
        } else {
            this.characterSkins = skin;
            this.currency = this.currency - cost;
            System.out.println("You have succefully bought " + skin + " for your character!");
            System.out.println("Current balance : " + this.currency);
        }
    }

    /**
     * if the cost is greater than the currency you have then sorry you cannot buy anything
     * otherwise if you do have enough currency it will be subtracted from the cost and print 
     * which gun you have bought and the amount of currency you have left.
     * @param gun -> the gun that the skin will be bought for
     * @param cost -> the cost of the gun skin
     */
    public void buyGunSkin(int cost, Gun gun) { 
        // if the gun ammo type is 7.62 then it will have double the price
        if (gun.getAmmo() == 7.62) {
            cost = cost * 2;
        }
        if (this.currency == 0 || cost > this.currency) { 
            System.out.println("You do not have any money! go buy some NOW!");
        } else {
            this.gunSkins = gun.getWeaponName();
            this.currency = this.currency - cost;
            System.out.println("You have succefully bought " + gun + " for your gun!");
            System.out.println("Current balance : " + this.currency);
        }
    }
    
    @Override
    public String toString() {
        String builder = "";

        builder += "characterskins : " + this.characterSkins + ", ";
        builder += "currency : " + this.currency + ", ";
        builder += "gunskins : " + this.gunSkins + ", ";
        builder += "charms : " + this.charms;

        return builder;
    }
}