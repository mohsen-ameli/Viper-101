/**
* Name: Mohsen Ameli
* Date: May 1, 2022
* Description: This is a subclass for GameMode where users can 
* interact with stuff.
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
    public BattleRoyal(Map map, int numPlayers, boolean ranked, double time, int obstacles, int numHouse, int numTree) {
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

    public void setObstacles(int numObs) {this.obstacles = numObs;}

    /*
    Methods
    */

    /**
     * spawns stuff like obstacles
     * @param map -> the specified map to spawn things in
     */
    public void spawnStuff(Map map) {
        if (map.getLocation() == "Sahara") {
            // if the map is in Sahara, then there are no obstacles, since there's just sand
            this.setObstacles(0);
        } else if (map.getWeather() == "snowy") {
            // if the weather is snowy then spawn lots of trees and houses
            this.numHouse = 120;
            this.numTree = 130;
        }
    }

    @Override
    public String toString() {
        String builder = super.toString();

        builder += "There are " + this.obstacles + " obstacles , ";
        builder += "There are " + this.numHouse + " houses , ";
        builder += "There are " + this.numTree + " trees , ";
        
        return builder;
    }
}