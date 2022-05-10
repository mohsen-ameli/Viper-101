/**
* Name: Mohsen Ameli
* Date: May 2, 2022
* Description: The map of the game mode, either battle royal
* or arena.
*/

public class Map {
    /*
    Attributes
    */
    private String weather;
    private String location;
    private double size;
    private int temp;

    /*
    Constructor
    */
    public Map(String weather, String location, double size, int temp) {
        this.weather    = weather;
        this.location   = location;
        this.size       = size;
        this.temp       = temp;
    }

    /*
    Accessors
    */
    public String getWeather() {return this.weather;}
    public String getLocation() {return this.location;}
    public double getSize() {return this.size;}
    public int getTemp() {return this.temp;}

    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weather : " + this.weather + ", ";
        builder += "Location : " + this.location + ", ";
        builder += "Size : " + this.size + ", ";
        builder += "Temp : " + this.temp + ", ";

        return builder;
    }
}