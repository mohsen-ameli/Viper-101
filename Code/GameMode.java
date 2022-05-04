/**
* Name: Mohsen Ameli
* Date: May 1, 2022
* Description: The Game Mode with different multiple players, time
* ranked, and unranked matches.
*/

public class GameMode {
    /*
    Attributes
    */
    private int numPlayers;
    private boolean ranked;
    private double time;

    /*
    Constructor
    */
    public GameMode(int numPlayers, Boolean ranked, double time) {
        this.numPlayers = numPlayers;
        this.ranked     = ranked;
        this.time       = time;
    }

    /*
    Accessors
    */
    public int getNumPlayers() {return this.numPlayers;}
    public boolean getRanked() {return this.ranked;}
    public double getTime() {return this.time;}

    /*
    Methods
    */
    public void rank () { // If player want to play ranked match or casual (turning ranked mode on and off)
        if (this.ranked) {
            this.ranked = false;
        }
    }  

    @Override
    public String toString() {
        String builder = "";

        builder += "Number of Players : " + this.numPlayers + ", ";
        builder += "Ranked : " + this.ranked + ", ";
        builder += "Time : " + this.time + ", ";

        return builder;
    }
}