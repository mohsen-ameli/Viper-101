public class Map {
    /*
    Attributes
    */
    private String weather;
    private String location;
    private double size;

    /*
    Constructor
    */
    public Map(String weather, String location, double size) {
        this.weather    = weather;
        this.location   = location;
        this.size       = size;
    }

    /*
    Accessors
    */
    public String getWeather() {return this.weather;}
    public String getLocation() {return this.location;}
    public double getSize() {return this.size;}

    /*
    Methods
    */
    public String toString() {
        String builder = "";

        builder += "Weather : " + this.weather + ", ";
        builder += "Location : " + this.location + ", ";
        builder += "Size : " + this.size + ", ";

        return builder;
    }
}