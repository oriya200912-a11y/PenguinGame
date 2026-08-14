import java.awt.*;

public class GameBoard {

    private final int ROWS = 8;
    private final int COLS = 10;
    private final int TILE_SIZE = 60;

    private final int BOARD_X = 100;
    private final int BOARD_Y = 40;

    private IceTile[][] tiles;

    public GameBoard() {

        reset();
    }

    // יוצרת מחדש את כל קוביות הקרח
    public void reset() {

        tiles = new IceTile[ROWS][COLS];

        for (int row = 0; row < ROWS; row++) {

            for (int col = 0; col < COLS; col++) {

                tiles[row][col] = new IceTile();
            }
        }
    }

    // מחזירה קוביית קרח לפי שורה ועמודה
    public IceTile getTile(int row, int col) {

        return tiles[row][col];
    }

    // בודקת אם השורה והעמודה נמצאות בתוך הלוח
    public boolean isValidTile(int row, int col) {

        return row >= 0
                && row < ROWS
                && col >= 0
                && col < COLS;
    }

    // בודקת אם משבצת מסוימת כבר הפכה למים
    public boolean isWater(int row, int col) {

        if (!isValidTile(row, col)) {
            return false;
        }

        return tiles[row][col].getState() == IceTile.WATER;
    }

    // מציירת את כל קוביות הקרח
    public void draw(Graphics g) {

        for (int row = 0; row < ROWS; row++) {

            for (int col = 0; col < COLS; col++) {

                int x = col * TILE_SIZE + BOARD_X;
                int y = row * TILE_SIZE + BOARD_Y;

                tiles[row][col].draw(
                        g,
                        x,
                        y,
                        TILE_SIZE
                );
            }
        }
    }

    public int getTileSize() {
        return TILE_SIZE;
    }

    public int getBoardX() {
        return BOARD_X;
    }

    public int getBoardY() {
        return BOARD_Y;
    }

    public int getBoardWidth() {
        return COLS * TILE_SIZE;
    }

    public int getBoardHeight() {
        return ROWS * TILE_SIZE;
    }
}
