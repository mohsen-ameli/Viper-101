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
    /**
     * Plays the specified file taken by the attributes
     * @param filePath -> the file path to the file that will be played
     * @param weaponDamage -> The damage the weapon does
     * @param ammo -> The ammo in the weapon 
     * @param weaponName -> The name of the weapon
     * @param recoil -> the recoil in the gun
     * @param accuracy -> accuracy in the gun  
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
    // This gives the gun the ability to be able to shoot and if it hits print DIE and the amount of damage the weapon did.
    public void shoot () {
        System.out.println("DIE!"); 
        System.out.println(this.weaponDamage);

        // play audio when changing graphics
        new PlayQuote("../Quotes/shoot.wav");
    }

    public String toString() {
        String builder = "";

        builder += "Weapon name : " + this.weaponName + ", ";
        builder += "Weapon Ammo : " + this.ammo + ", ";
        builder += "Weapon damage : " + this.weaponDamage + ", ";
        builder += "Weapon Recoil : " + this.recoil + ", ";
        builder += "Weapon Accuracy : " + this.accuracy;

        return builder;
    }
}
