/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Zain Siddiqui
 */

public class Shop {
   /*
    Attributes
    */
    private String characterSkins;
    private int currency;
    private String gunSkins;
    private String bundle;
    private String charms;
   
    /*
    Constructor
    */
  
    public void Shop (String characterSkins, int currency, String gunSkins, String bundle, String charms) {
        this.characterSkins = characterSkins;
        this.currency = currency;
        this.gunSkins = gunSkins;
        this.bundle = bundle;
        this.charms = charms; 
    }
    /*
    Accessors
    */

    public String getCharacterSkins() {return characterSkins;}
    public int getcurrency() {return currency;}
    public String getGunSkins() {return gunSkins;}
    public String getBundle() {return bundle;}
    public String getCharms() {return charms;}
    
    /*
    Methods
    */
    
    public void buyCurr () { 
        if (this.currency < 0 && this.currency + 1000) { 
            this.currency = this.currency + 1000;
            System.out.println("You cannot buy any thing sorry");
            System.out.printf("You can buy anything in the store", this.currency);
        }
    }
    public void buySkin () { 
        if (this.characterSkins < 0 && this.characterSkins + 75) { 
            this.characterSkins = this.characterSkins + 75;
            System.out.println("This skin is free");
            System.out.printf("You can buy any single skin you want", this.characterSkins);

    }
    public void buyBoundle () { 
        if (this.bundle < 0 && this.bundle + 150) { 
            this.bundle = this.bundle + 150;
            System.out.println("This boundle is free");
            System.out.printf("You can buy any single boundle", this.characterSkins);
    

    }
    public void buygunskins () { 
        if (this.gunSkins < 0 && this.gunSkins + 45 ) { 
            this.gunSkins = this.gunSkins + 45;
            System.out.println("This gun skin is free");
            System.out.printf("Yu can buy any single gun skin", this.gunSkins); 
    
    
    public String toString() {
        String builder = "";

        builder += "characterskins : " + this.characterSkins + ", ";
        builder += "currency : " + this.currency + ", ";
        builder += "gunskins : " + this.gunSkins + ", ";
        builder += "bundlee : " + this.bundle + ", ";
        builder += "charms : " + this.charms;

        return builder;
    }
}