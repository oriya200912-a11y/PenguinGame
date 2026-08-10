import java.awt.*;

public class IceTile {

    public static final int ICE = 0;
    public static final int CRACKED = 1;
    public static final int WATER = 2;

    private int state;

    public IceTile() {
        state = ICE;
    }

    public void breakIce() {

        if (state == ICE) {
            state = CRACKED;
        }
        else if (state == CRACKED) {
            state = WATER;
        }
    }

    public int getState() {
        return state;
    }

    public void draw(Graphics g, int x, int y, int size) {

        if (state == ICE) {
            g.setColor(Color.WHITE);
        }
        else if (state == CRACKED) {
            g.setColor(Color.LIGHT_GRAY);
        }
        else {
            g.setColor(Color.BLUE);
        }

        g.fillRect(x, y, size, size);

        g.setColor(Color.BLUE);
        g.drawRect(x, y, size, size);
    }
}
