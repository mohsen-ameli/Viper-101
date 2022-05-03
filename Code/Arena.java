/**
 * Course: ICS4U1
 * Date: Apr. 25th, 2022
 * @author Arshia Akbaripour
 */

public class Arena {
    /*
    Attributes
    */
    private int round;
    private double time;
    private int numPlayers;
    private boolean ranked;

    /*
    Constructor
    */
    public Arena(int round, double time, int numPlayers, Boolean ranked) {
        this.round   = round;
        this.time    = time;
        this.numPlayers = numPlayers;
        this.ranked     = ranked;
    }

    /*
    Accessors
    */
    public int getRound() {return this.round;}
    public double getTime() {return this.time;}
    public int getNumPlayers() {return this.numPlayers;}
    public boolean getRanked() {return this.ranked;}

    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Time : " + this.time + ", ";
        builder += "Round : " + this.round + ", ";
        builder += "Number of Players : " + this.numPlayers + ", ";
        builder += "Ranked : " + this.ranked;

        return builder;
    }
}
