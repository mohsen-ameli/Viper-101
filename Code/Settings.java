public class Settings {
    /*
    Attributes
    */
    private int graphics;
    private double audio;
    private boolean vSync;
    private String language;
    private boolean autoSprint;

    final int FORWARD = 0;
    final int BACKWARD = 1;
    final int LEFT = 2;
    final int RIGHT = 3;
    final int CROUCH = 4;
    final int JUMP = 5;

    private String [] controls = new String[6];

    /*
    Constructor
    */
    public Settings(int graphics, double audio, boolean vSync, String language, boolean autoSprint) {
        this.graphics   = graphics;
        this.audio      = audio;
        this.vSync      = vSync;
        this.language   = language;
        this.autoSprint = autoSprint;
        setDefaultMovement();
    }

    private void setDefaultMovement() {
        controls[FORWARD] = "W";
        controls[BACKWARD] = "S";
        controls[LEFT] = "A";
        controls[RIGHT] = "S";
        controls[CROUCH] = "Shift";
        controls[JUMP] = "Space";
    }

    /*
    Accessors
    */
    public int getGraphics() {return this.graphics;}
    public double getAudio() {return this.audio;}
    public boolean getVSync() {return this.vSync;}
    public String getLanguage() {return this.language;}
    public boolean getAutoSprint() {return this.autoSprint;}

    /*
    Methods
    */
    public void chnageSettings(int graphics, double audio, boolean vSync, String language) {
        if (graphics < 0) {
            this.graphics = graphics;
        }
        this.audio = audio;
        this.vSync = vSync;
        this.language = language;    
    }

    public void changeControls(String control, String key) {
        for (int i = 0; i < this.controls.length; i++) {
            if (this.controls[i] == control.toUpperCase()) {
                this.controls[i] = key;
            }
        }
    }

    public String toString() {
        String builder = "";

        builder += "Graphics : " + this.graphics + ", ";
        builder += "Audio : " + this.audio + ", ";
        builder += "vSync : " + this.vSync + ", ";
        builder += "Language : " + this.language;

        return builder;
    }

}
