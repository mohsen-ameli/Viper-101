/*
* Date : May 9th, 2022
* Description : Plays a quote audio file
* Author : The internet, edited by Mohsen
* Sources : 
*  - https://www.geeksforgeeks.org/play-audio-file-using-java/
*  - https://stackoverflow.com/questions/3009908/how-do-i-get-a-sound-files-total-time-in-java
*/

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import java.util.concurrent.TimeUnit;

public class PlayQuote {
    // to store current position
    Long currentFrame;
    Clip clip;
      
    // current status of clip
    String status;
      
    AudioInputStream audioInputStream;
  
    // constructor to initialize streams and clip
    /**
     * Plays the specified file taken by the attributes
     * @param filePath -> the file path to the file that will be played
     */
    public PlayQuote(String filePath) {
        try {
            // creating a new file
            File f = new File(filePath);

            // create AudioInputStream object
            audioInputStream = AudioSystem.getAudioInputStream(f.getAbsoluteFile());
            
            // create clip reference
            clip = AudioSystem.getClip();
            
            // open audioInputStream to the clip
            clip.open(audioInputStream);
            
            // starting the audio
            clip.start();

            // getting the seconds of the audio file
            AudioFormat format = audioInputStream.getFormat();
            long frames = audioInputStream.getFrameLength();
            double durationInSeconds = (frames+0.0) / format.getFrameRate();  

            // sleeping during the play
            TimeUnit.SECONDS.sleep((int) durationInSeconds);
        } catch (Exception ex) {
            System.out.println("Error with playing sound.");
        }
    }
}