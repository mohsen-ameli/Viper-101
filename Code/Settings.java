public class Settings {
    /*
    Attributes
    */
    private int graphics;
    private double audio;
    private double vSync;
    private String language;
    private boolean autoSprint;

    final int FORWARD = 0;
    final int BACKWARD = 1;
    final int LEFT = 2;
    final int RIGHT = 3;

    /*
    Constructor
    */
    public Settings(int graphics, double audio, double vSync, String language) {
        this.graphics = graphics;
        this.audio = audio;
        this.vSync = vSync;
        this.language = language;
    }

    /*
    Accessors
    */
    public int getGraphics() {return this.graphics;}
    public double getAudio() {return this.audio;}
    public double getVSync() {return this.vSync;}
    public String getLanguage() {return this.language;}

    /*
    Methods
    */
    public void chnageSettings(int graphics, double audio, double vSync, String language) {
        if (graphics < 0) {
            this.graphics = graphics;
        }
        this.audio = audio;
        this.vSync = vSync;
        this.language = language;    
    }

    public void changeControls()

    public String toString() {
        String builder = "";

        builder += "Graphics : " + this.graphics + ", ";
        builder += "Audio : " + this.audio + ", ";
        builder += "vSync : " + this.vSync + ", ";
        builder += "Language : " + this.language;

        return builder;
    }

}
