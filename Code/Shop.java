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
  
    public void Gun(String characterSkins, int currency, String gunSkins, String bundle, String charms) {
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
    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.characterSkins + ", ";
        builder += "Weapon ammo : " + this.currency + ", ";
        builder += "Weapon damage : " + this.gunSkins + ", ";
        builder += "Weapon recoil : " + this.bundle + ", ";
        builder += "accuracy : " + this.charms;

        return builder;
    }
}