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
    public BattleRoyal(int obstacles, int numHouse, int numTree, int numPlayers, Boolean ranked, double time, Map map) {
        super(numPlayers, ranked, time);
        
        this.obstacles = obstacles;
        this.numHouse = numHouse;
        this.numTree = numTree;
    }

    /*
    Accessors
    */
    public int getObstacles() {return this.obstacles;}
    public int getNumHouse() {return this.numHouse;}
    public int getNumTree() {return this.numTree;}

    /*
    Methods
    */
    @Override
    public String toString() {
        String builder = super.toString();

        builder += "there are " + this.obstacles + " obstacles , ";
        builder += "there are " + this.numHouse + " houses , ";
        builder += "there are " + this.numTree + " trees , ";
        
        return builder;
    }
}