package util;
import javax.sound.sampled.*;
import java.io.File;
public class Sound {
	public Clip clip = null;
    public void play(String sound)
    {
    	try {
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(new File(sound)));
            clip.start();
        }
        catch (Exception exc) {
            exc.printStackTrace(System.out);
        }
    }
}
