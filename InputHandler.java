import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputHandler extends KeyAdapter {

    // מקשים של שחקן 1
    private boolean wPressed = false;
    private boolean sPressed = false;
    private boolean aPressed = false;
    private boolean dPressed = false;

    // מקשים של שחקן 2
    private boolean upPressed = false;
    private boolean downPressed = false;
    private boolean leftPressed = false;
    private boolean rightPressed = false;

    // מופעל כאשר לוחצים על מקש
    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            aPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            dPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }
    }

    // מופעל כאשר משחררים מקש
    @Override
    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_A) {
            aPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_D) {
            dPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }
    }

    // מחזירות האם כל מקש לחוץ כרגע
    public boolean isWPressed() {
        return wPressed;
    }

    public boolean isSPressed() {
        return sPressed;
    }

    public boolean isAPressed() {
        return aPressed;
    }

    public boolean isDPressed() {
        return dPressed;
    }

    public boolean isUpPressed() {
        return upPressed;
    }

    public boolean isDownPressed() {
        return downPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }

    // מאפסת את כל המקשים בתחילת סיבוב חדש
    public void reset() {

        wPressed = false;
        sPressed = false;
        aPressed = false;
        dPressed = false;

        upPressed = false;
        downPressed = false;
        leftPressed = false;
        rightPressed = false;
    }
}
