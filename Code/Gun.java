/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Zain Siddiqui
 */

public class Gun {
    /*
    Attributes
    */
    private double weaponDamage;
    private double ammo;
    private String weaponName;
    private String recoil;
    private int accuracy;
   
   /*
    Constructor
    */
    public Gun(String weaponName, double ammo, double weaponDamage, String recoil, int accuracy ) {
        this.weaponName = weaponName;
        this.ammo = ammo;
        this.weaponDamage = weaponDamage;
        this.recoil = recoil;
        this.accuracy = accuracy; 
    }

    /*
    Accessors
    */
    public String getWeaponName() {return weaponName;}
    public double getAmmo() {return ammo;}
    public double getDamage() {return weaponDamage;}
    public String getRecoil() {return recoil;}
    public int getAccuracy() {return accuracy;}
    
    /*
    Methods
    */
    public void shoot () {
        System.out.println("DIE!"); 
        System.out.println(this.weaponDamage);
    }

    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.weaponName + ", ";
        builder += "Weapon Ammo : " + this.ammo + ", ";
        builder += "Weapon damage : " + this.weaponDamage + ", ";
        builder += "Weapon Recoil : " + this.recoil + ", ";
        builder += "Weapn Accuracy : " + this.accuracy;

        return builder;
    }
}
