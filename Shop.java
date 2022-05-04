/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Zain Siddiqui
 */

public class Shop {
   /*
    Attributes
    */
    private String CharacterSkins;
    private int currency;
    private String GunSkins;
    private String Bundle;
    private String Charms;
   
   /*
    Constructor
    */
  
    public Gun(String CharacterSkins, int currency, String GunSkins, String Bundle, String Charms ) {
        this.CharacterSkins = CharacterSkins;
        this.currency = currency;
        this.GunSkins = GunSkins;
        this.Bundle = Bundle;
        this.Charms = Charms; 
    }
    /*
    Accessors
    */

    public String getCharacterSkins() {return CharacterSkins;}
    public int getcurrency() {return currency;}
    public int getGunSkins() {return GunSkins;}
    public String getBundle() {return Bundle;}
    public int getCharms() {return Charms;}
    
    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.CharacterSkins + ", ";
        builder += "Weapon ammo : " + this.currency + ", ";
        builder += "Weapon damage : " + this.GunSkins + ", ";
        builder += "Weapon recoil : " + this.Bundle + ", ";
        builder += "accuracy : " + this.Charms;

        return builder;
    }
}