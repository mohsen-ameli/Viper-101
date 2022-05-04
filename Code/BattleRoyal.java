/**
* Name: Mohsen Ameli
* Date: May 1, 2022
* Description: The subclass of Battle Royal where users can make
* a fantastic and realasitc 2D non-existent map.
*/

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
    public BattleRoyal(Map map, int numPlayers, Boolean ranked, double time, int obstacles, int numHouse, int numTree) {
        super(map, numPlayers, ranked, time);
        
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

        builder += "There are " + this.obstacles + " obstacles , ";
        builder += "There are " + this.numHouse + " houses , ";
        builder += "There are " + this.numTree + " trees , ";
        
        return builder;
    }
}