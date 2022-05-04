/**
 * Course: ICS4U1
 * Date: Apr. 25th, 2022
 * @author Arshia Akbaripour
 */

public class Arena extends GameMode {
    /*
    Attributes
    */
    private int round;
    private int boxes;

    /*
    Constructor
    */
    public Arena(Map map, int numPlayers, Boolean ranked, double time, int round, int boxes) {
        super(map, numPlayers, ranked, time);

        this.round   = round;
        this.boxes   = boxes;
    }

    /*
    Accessors
    */
    public int getRound() {return this.round;}
    public int getBoxes() {return this.boxes;}

    /*
    Methods
    */

    public String toString() {
        String builder = super.toString();

        builder += "Round : " + this.round + ", ";
        builder += "Boxes : " + this.boxes + ", ";

        return builder;
    }
}
