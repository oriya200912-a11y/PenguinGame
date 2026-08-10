import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {

    private JButton startButton;

    public Menu(JFrame window) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("PENGUIN GAME");
        title.setFont(new Font("Arial", Font.BOLD, 32));
        title.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel instructions = new JLabel(
                "<html><div style='text-align: center;'>"
                        + "Stay on the ice and be the last penguin alive!<br><br>"
                        + "Player 1: W A S D<br>"
                        + "Player 2: Arrow Keys"
                        + "</div></html>",
                SwingConstants.CENTER
        );

        instructions.setFont(new Font("Arial", Font.PLAIN, 18));
        instructions.setAlignmentX(Component.CENTER_ALIGNMENT);

        // קודם יוצרים את הכפתור
        startButton = new JButton("START GAME");
        startButton.setFont(new Font("Arial", Font.BOLD, 20));
        startButton.setAlignmentX(Component.CENTER_ALIGNMENT);

        // ורק אחר כך מוסיפים לו פעולה
        startButton.addActionListener(e -> {

            GamePanel gamePanel = new GamePanel(window);

            window.setContentPane(gamePanel);

            window.revalidate();
            window.repaint();
            gamePanel.requestFocusInWindow();
        });

        add(Box.createVerticalGlue());
        add(title);
        add(Box.createRigidArea(new Dimension(0, 30)));
        add(instructions);
        add(Box.createRigidArea(new Dimension(0, 30)));
        add(startButton);
        add(Box.createVerticalGlue());
    }
}
