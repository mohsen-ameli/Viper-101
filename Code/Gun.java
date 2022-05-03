/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Zain Siddiqui
 */

public class Gun {
   /*
    Attributes
    */
    private int weaponDamage;
    private int Ammo;
    private String weaponName;
    private String Recoil;
    private int Accuracy;
   
   /*
    Constructor
    */
  
    public Gun(String weaponName, int Ammo, int weaponDamage, String Recoil, int Accuracy ) {
        this.weaponName = weaponName;
        this.Ammo = Ammo;
        this.weaponDamage = weaponDamage;
        this.Recoil = Recoil;
        this.Accuracy = Accuracy; 
    }
    /*
    Accessors
    */

    public String getWeaponName() {return weaponName;}
    public int getAmmo() {return Ammo;}
    public int getDamage() {return weaponDamage;}
    public String getRecoil() {return Recoil;}
    public int getAccuracy() {return Accuracy;}
    
    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.weaponName + ", ";
        builder += "Weapon ammo : " + this.Ammo + ", ";
        builder += "Weapon damage : " + this.weaponDamage + ", ";
        builder += "Weapon recoil : " + this.Recoil + ", ";
        builder += "accuracy : " + this.Accuracy;

        return builder;
    }
}
