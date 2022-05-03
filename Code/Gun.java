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
    private int weaponAmmo;
    private String weaponName;
    private String weaponRecoil;
    private int weaponAccuracy;
   
   /*
    Constructor
    */
  
    public Gun(String weaponName, int weaponAmmo, int weaponDamage, String weaponRecoil, int weaponAccuracy ) {
        this.weaponName = weaponName;
        this.weaponAmmo = weaponAmmo;
        this.weaponDamage = weaponDamage;
        this.weaponRecoil = weaponRecoil;
        this.weaponAccuracy = weaponAccuracy; 
    }
    /*
    Accessors
    */

    public String getWeaponName() {return weaponName;}
    public int getAmmo() {return weaponAmmo;}
    public int getDamage() {return weaponDamage;}
    public String getRecoil() {return weaponRecoil;}
    public int getAccuracy() {return weaponAccuracy;}
    
    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.weaponName + ", ";
        builder += "Weapon ammo : " + this.weaponAmmo + ", ";
        builder += "Weapon damage : " + this.weaponDamage + ", ";
        builder += "Weapon recoil : " + this.weaponRecoil + ", ";
        builder += "accuracy : " + this.weaponAccuracy;

        return builder;
    }
}
