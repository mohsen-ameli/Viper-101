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

    /*
    Methods
    */
    public void heal () { 
        if (this.health < 100 && this.health + 20 <= 100) { 
            this.health = this.health + 20;
            System.out.println("Wait a second! im healing");
            System.out.printf("your health is restored to %f", this.health);
        }
    } 
    
    public void armoringUp () { 
        if (this.armor < 50 && this.armor + 125 <= 50) { 
            this.armor = this.armor + 25;
            System.out.println("im shot! cover me im armoring up");
            System.out.printf("your armor is restored to %f", this.armor);
        }
    } 

    public void useSkill () { 
        System.out.printf("your Charecters used %f", this.skill);
        System.out.println(this.quote);

    } 
    
    public void shoot () {

        System.out.println("DIE!"); 
        System.out.println(getDamage());
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