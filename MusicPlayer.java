import javax.sound.sampled.*;
import java.io.File;

public class MusicPlayer {

    private Clip clip;

    public void play(String filePath) {
        try {
            File file = new File(filePath);

            AudioInputStream audioStream =
                    AudioSystem.getAudioInputStream(file);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            // ניגון חוזר ברצף
            clip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() {
        if (clip != null) {
            clip.stop();
            clip.close();
        }
    }
}
