/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Zain Siddiqui
 */

public class Gun {
  private int weaponDamage;
  private int weaponAmmo;
  private String weaponName;
  private String weaponrecoil;
  private int weaponAccuracy;
  

  public Gun(String name, int ammo, int damage, String recoil, int Acuracy ) {
    name = weaponName;
    ammo = weaponAmmo;
    damage = weaponDamage;
    recoil = weaponrecoil;
    Accuracy = weaponAccuracy; 
  }

  public String getWeaponName() {
    return weaponName;
  }

  public int getAmmo() {
    return weaponAmmo;
  }

  public int getDamage() {
    return weaponDamage;
    
  public String getrecoil() {
    return weaponrecoil;
    
   public int getAccuracy() {
    return weaponAccuracy;
  }
}