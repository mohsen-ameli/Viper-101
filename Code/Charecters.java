/**
 * Course: ICS4U1
 * Date: Apr. 28th, 2022
 * @author Arshia Akbaripour
 */

public class Charecters {
     /*
    Attributes
    */
    private int health;
    private String name;
    private String skill;
    private String sex;
    private int armor;
    private String quote;

    /*
    Constructor
    */
    public Charecters(int health, String name, String skill, String sex, int armor, String quote) {

        this.health = health;
        this.name   = name;
        this.skill  = skill;
        this.sex    = sex;
        this.armor  = armor;
        this.quote  = quote;
    }

    /*
    Accessors
    */
    public int getHealth() {return this.health;}
    public String getName() {return this.name;}
    public String getSkill() {return this.skill;}
    public String getSex() {return this.sex;}
    public int getArmor() {return this.armor;}
    public String getQuote() {return this.quote;}

    public void setArmor(int armor) {
        if (armor < 0 || armor == 0) {
            this.armor = 0;
        } else {
            this.armor = armor;
        }
    }
    public void setHealth(int health) {
        if (health < 0 || health == 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    /*
    Methods
    */
    public void heal () { 
        if (this.health < 100 && this.health + 20 <= 100) { 
            this.health = this.health + 20;
            System.out.println("Wait a second! im healing");
            System.out.printf("your health is restored to %d \n", this.health);
        } else {
            System.out.println("Health is full!");
        }
    } 
    
    public void armoringUp () { 
        if (this.armor < 50 && this.armor + 25 <= 50) { 
            this.armor = this.armor + 25;
            System.out.println("im shot! cover me im armoring up");
            System.out.printf("your armor is restored to %d \n", this.armor);
        } else {
            System.out.println("Armour already full!");
        }
    } 

    public void useSkill () { 
        System.out.printf("your Charecters used %s \n", this.skill);
        System.out.println(this.quote);
    }

    public void move () {


    }

    public String toString() {
        String builder = "";

        builder += "Health : " + this.health + ", ";
        builder += "Name : " + this.name + ", ";
        builder += "Skill : " + this.skill + ", ";
        builder += "Sex : " + this.sex;
        builder += "Armor : " + this.armor;
        builder += "Quote : " + this.quote;

        return builder;
    }
    
}