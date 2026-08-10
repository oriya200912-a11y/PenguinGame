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
    
        // קרח רגיל
        if (state == ICE) {
    
            g.setColor(new Color(190, 235, 250));
            g.fillRect(x, y, size, size);
    
            // מסגרת עדינה
            g.setColor(new Color(120, 190, 220));
            g.drawRect(x, y, size, size);
        }
    
        // קרח סדוק
        else if (state == CRACKED) {
    
            g.setColor(new Color(140, 210, 235));
            g.fillRect(x, y, size, size);
    
            g.setColor(new Color(70, 140, 180));
            g.drawRect(x, y, size, size);
    
            // סדקים
            g.drawLine(
                    x + size / 2,
                    y,
                    x + size / 2 - 8,
                    y + size / 3
            );
    
            g.drawLine(
                    x + size / 2 - 8,
                    y + size / 3,
                    x + size / 2 + 5,
                    y + size / 2
            );
    
            g.drawLine(
                    x + size / 2 + 5,
                    y + size / 2,
                    x + size / 2 - 10,
                    y + size
            );
    
            g.drawLine(
                    x + size / 2 - 8,
                    y + size / 3,
                    x + 5,
                    y + size / 2
            );
    
            g.drawLine(
                    x + size / 2 + 5,
                    y + size / 2,
                    x + size - 5,
                    y + size / 3
            );
        }
    
        // מים
        else if (state == WATER) {
    
            g.setColor(new Color(35, 135, 200));
            g.fillRect(x, y, size, size);
    
            g.setColor(new Color(20, 95, 160));
            g.drawRect(x, y, size, size);
    
            // קווים קטנים שנותנים תחושה של מים
            g.drawArc(
                    x + 8,
                    y + 15,
                    20,
                    8,
                    0,
                    180
            );
    
            g.drawArc(
                    x + 30,
                    y + 35,
                    20,
                    8,
                    0,
                    180
            );
        }
    }
}
