public class Charecters {
     /*
    Attributes
    */
    private double health;
    private String name;
    private String skill;
    private String sex;
    private double armor;

    /*
    Constructor
    */
    public Charecters(double health, String name, String skill, String sex, double armor) {

        this.health = health;
        this.name   = name;
        this.skill  = skill;
        this.sex    = sex;
        this.armor  = armor;
    }

    /*
    Accessors
    */
    public double getHealth() {return this.health;}
    public String getName() {return this.name;}
    public String getSkill() {return this.skill;}
    public String getSex() {return this.sex;}
    public double getArmor() {return this.armor;}

    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Health : " + this.health + ", ";
        builder += "Name : " + this.name + ", ";
        builder += "Skill : " + this.skill + ", ";
        builder += "Sex : " + this.sex;
        builder += "Armor : " + this.armor;

        return builder;
    }
    
}