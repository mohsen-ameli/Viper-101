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

    /*
    Constructor
    */
    public Arena(int numPlayers, int round, double time, Boolean ranked, Map map) {
        super(numPlayers, ranked, time);

        this.round   = round;
    }

    /*
    Accessors
    */
    public int getRound() {return this.round;}

    /*
    Methods
    */
    @Override
    public String toString() {
        String builder = super.toString();

        builder += "Round : " + this.round + ", ";

        return builder;
    }
}
