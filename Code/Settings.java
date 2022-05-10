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
    public void chnageGraphics(int graphics) {
        if (graphics < 1 || graphics > 5) {
            System.out.println("Invalid graphics level.");
        } else {
            this.graphics = graphics;
        }
    }

    public void changeAudio (double audio) {
        if (audio < 0 || audio > 10) {
            System.out.println("Invalid audio level.");
        } else {
            this.audio = audio;
            System.out.printf("Audio has been set to %s \n", audio);
        }
    }

    public void changeVSync () {
        if (this.vSync == true) {
            this.vSync = false;
            System.out.println("vSync is now turned off");
        } else {
            this.vSync = true;
            System.out.println("vSync is now turned on");
        }
    }

    public void changeAutoSprint () {
        if (this.autoSprint == true) {
            this.autoSprint = false;
            System.out.println("Auto sprint is now turned off");
        } else {
            this.autoSprint = true;
            System.out.println("Auto sprint is now turned on");
        }
    }

    public void changeLanguage (String language) {
        this.language = language;
        System.out.printf("The default language is now : %s \n", language);
    }

    public void changeControls(String control, String key) {
        // int control.toUpperCase() =;
        // System.out.println(this.controls[FORWARD]);
        // for (int i = 0; i < this.controls.length; i++) {
        //     if (this.controls[i] == control.toUpperCase()) {
        //         this.controls[FORWARD] = key;
        //     }
        // }
    }

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
