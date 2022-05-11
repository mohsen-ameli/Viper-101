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

    public void setForward(String key) {controls[FORWARD] = key;}
    public void setBackward(String key) {controls[BACKWARD] = key;}
    public void setLeft(String key) {controls[LEFT] = key;}
    public void setRight(String key) {controls[RIGHT] = key;}
    public void setCrouch(String key) {controls[CROUCH] = key;}
    public void setJump(String key) {controls[JUMP] = key;}

    /*
    Methods
    */
    /**
     * changing default graphics
     * @param graphics -> new desired graphics
     */
    public void chnageGraphics(int graphics) {
        if (graphics < 1 || graphics > 5) { // if user entered invalid graphics level
            System.out.println("Invalid graphics level.");
        } else { // good job user
            this.graphics = graphics;
            // play audio when changing graphics
            new PlayQuote("../Quotes/click.wav");
        }
    }

    /**
     * changing default audio
     * @param audio -> new desired audio
     */
    public void changeAudio (double audio) {
        if (audio < 0 || audio > 10) { // if user entered invalid audio level
            System.out.println("Invalid audio level.");
        } else { // good job user
            this.audio = audio;
            System.out.printf("Audio has been set to %s \n", audio);

            // play audio when changing graphics
            new PlayQuote("../Quotes/click.wav");
        }
    }

    /**
     * changing default vSync to on or off
     */
    public void changeVSync () {
        if (this.vSync == true) { // vSync set to false if already true
            this.vSync = false;
            System.out.println("vSync is now turned off");
        } else { // opposite of that
            this.vSync = true;
            System.out.println("vSync is now turned on");
        }
    }

    /**
     * changing default auto sprint to on or off
     */
    public void changeAutoSprint () {
        if (this.autoSprint == true) { // auto sprint set to false if already true
            this.autoSprint = false;
            System.out.println("Auto sprint is now turned off");
        } else { // opposite of that
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

        // success msg
        System.out.printf("The default language is now : %s \n", language);
    }

    /**
     * still incomplete sorry :( but should change the control based on the two
     * attributes given
     * @param control -> the control the user wants to change (forward, backward, etc)
     * @param key -> the desired key to bind the control with
     */
    public void changeControls(String control, String key) {
        control = control.toLowerCase(); // just making sure everything matches
        key = key.toUpperCase(); // making sure keys are saved in upper case

        // which key does the user wanna change
        // using appropriate setter
        if (control.equals("forward")) {
            this.setForward(key);
        } else if (control.equals("backward")) {
            this.setBackward(key);
        } else if (control.equals("left")) {
            this.setLeft(key);
        } else if (control.equals("right")) {
            this.setRight(key);
        } else if (control.equals("crouch")) {
            this.setCrouch(key);
        } else if (control.equals("jump")) {
            this.setJump(key);
        }

        // success msg
        System.out.printf("You have bound %s with %s successfully! \n", key, control);
    }

    /**
     * toString method showing all the game settings
     */
    @Override
    public String toString() {
        String builder = "";

        builder += "Graphics : " + this.graphics + "/5 , ";
        builder += "Audio : " + this.audio + "/10.0 , ";
        builder += "vSync : " + (this.vSync? "ON":"OFF") + ", "; // inline if-else to say on or off
        builder += "Auto Sprint : " + (this.autoSprint? "ON":"OFF") + ", "; 
        builder += "Language : " + this.language;

        builder += "\n";

        builder += "Forward : " + this.controls[FORWARD] + ", ";
        builder += "Backward : " + this.controls[BACKWARD] + ", ";
        builder += "Left : " + this.controls[LEFT] + ", ";
        builder += "Right : " + this.controls[RIGHT] + ", ";
        builder += "Crouch : " + this.controls[CROUCH] + ", ";
        builder += "Jump : " + this.controls[JUMP];
        
        builder += "\n";

        return builder;
    }

}
