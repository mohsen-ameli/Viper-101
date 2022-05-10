/**
* Name: Mohsen Ameli
* Date: May 9, 2022
* Description: The settings of the whole game including graphics, and audio ...
*/
public class Settings {
    /*
    Attributes
    */
    private int graphics;
    private double audio;
    private boolean vSync;
    private String language;
    private boolean autoSprint;

    // controls
    final int FORWARD = 0;
    final int BACKWARD = 1;
    final int LEFT = 2;
    final int RIGHT = 3;
    final int CROUCH = 4;
    final int JUMP = 5;

    // variable to store all 6 controls
    private String [] controls = new String[6];

    /*
    Constructor
    */
    /**
     * The settings of the file
     * @param graphics -> the graphics of the game
     * @param audio -> the audio level
     * @param vSync -> vsync for better graphics
     * @param language -> language shown in the game
     * @param autoSprint -> automatic spriniting turned on or off
     */
    public Settings(int graphics, double audio, boolean vSync, String language, boolean autoSprint) {
        this.graphics   = graphics;
        this.audio      = audio;
        this.vSync      = vSync;
        this.language   = language;
        this.autoSprint = autoSprint;
        setDefaultMovement();
    }

    /**
     * Filling the default controls variable
     */
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
    /**
     * changing default graphics
     * @param graphics -> new desired graphics
     */
    public void chnageGraphics(int graphics) {
        if (graphics < 1 || graphics > 5) {
            System.out.println("Invalid graphics level.");
        } else {
            this.graphics = graphics;
        }

        // play audio when changing graphics
        new PlayQuote("../Quotes/click.wav");
    }

    /**
     * changing default audio
     * @param audio -> new desired audio
     */
    public void changeAudio (double audio) {
        if (audio < 0 || audio > 10) {
            System.out.println("Invalid audio level.");
        } else {
            this.audio = audio;
            System.out.printf("Audio has been set to %s \n", audio);
        }
    }

    /**
     * changing default vSync to on or off
     */
    public void changeVSync () {
        if (this.vSync == true) {
            this.vSync = false;
            System.out.println("vSync is now turned off");
        } else {
            this.vSync = true;
            System.out.println("vSync is now turned on");
        }
    }

    /**
     * changing default auto sprint to on or off
     */
    public void changeAutoSprint () {
        if (this.autoSprint == true) {
            this.autoSprint = false;
            System.out.println("Auto sprint is now turned off");
        } else {
            this.autoSprint = true;
            System.out.println("Auto sprint is now turned on");
        }
    }

    /**
     * changing the default language
     * @param language -> the desired language to change into
     */
    public void changeLanguage (String language) {
        this.language = language;
        System.out.printf("The default language is now : %s \n", language);
    }

    /**
     * still incomplete sorry :( but should change the control based on the two
     * attributes given
     * @param control -> the control the user wants to change (forward, backward, etc)
     * @param key -> the desired key to bind the control with
     */
    public void changeControls(String control, String key) {
        // int control.toUpperCase() =;
        // System.out.println(this.controls[FORWARD]);
        // for (int i = 0; i < this.controls.length; i++) {
        //     if (this.controls[i] == control.toUpperCase()) {
        //         this.controls[FORWARD] = key;
        //     }
        // }
    }

    /**
     * toString method showing all the game settings
     */
    @Override
    public String toString() {
        String builder = "";

        builder += "Graphics : " + this.graphics + "/5 , ";
        builder += "Audio : " + this.audio + "/10.0 , ";
        builder += "vSync : " + this.vSync + ", ";
        builder += "Language : " + this.language + ", ";
        for (int i = 0; i < controls.length; i++) {
            builder += i + " : " + this.controls[i] + ", ";
        }
        
        builder += "\n";

        return builder;
    }

}
