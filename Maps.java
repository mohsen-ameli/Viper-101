public class Maps {
    /*
    Attributes
    */
    private String weather;
    private String location;
    private double mapSize;
    private int numPlayers;
    private boolean ranked;

    /*
    Constructor
    */
    public Maps(String weather, String location, double mapSize, int numPlayers, Boolean ranked) {
        this.weather    = weather;
        this.location   = location;
        this.mapSize    = mapSize;
        this.numPlayers = numPlayers;
        this.ranked     = ranked;
    }

    /*
    Accessors
    */
    public String getWeather() {return this.weather;}
    public String getLocation() {return this.location;}
    public double getMapSize() {return this.mapSize;}
    public int getNumPlayers() {return this.numPlayers;}
    public boolean getRanked() {return this.ranked;}

    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weather : " + this.weather + ", ";
        builder += "Location : " + this.location + ", ";
        builder += "Map Size : " + this.mapSize + ", ";
        builder += "Number of Players : " + this.numPlayers + ", ";
        builder += "Ranked : " + this.ranked;

        return builder;
    }
}