public class BattleRoyal extends GameMode {
    /*
    Attributes
    */
    private int obstacles;
    private int numHouse;
    private int numTree;

    /*
    Constructor
    */
    public BattleRoyal(int numPlayers, Boolean ranked, double time, Map map) {
        super(numPlayers, ranked, time);
        
    }

    /*
    Accessors
    */
    // public String getLocation() {return this.location;}

    /*
    Methods
    */
    // @Override
    // public String toString() {
    //     String builder = super.toString();
    //     builder += "Weather : " + this.weather + ", ";
    //     return builder;
    // }
}