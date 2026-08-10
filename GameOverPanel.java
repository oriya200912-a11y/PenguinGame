import javax.swing.*;
import java.awt.*;

public class GameOverPanel extends JPanel {

    public GameOverPanel(JFrame window, String winnerText) {

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JLabel title = new JLabel("GAME OVER");

        title.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        36
                )
        );

        title.setAlignmentX(Component.CENTER_ALIGNMENT);


        JLabel winnerLabel = new JLabel(winnerText);

        winnerLabel.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        26
                )
        );

        winnerLabel.setAlignmentX(Component.CENTER_ALIGNMENT);


        JButton menuButton =
                new JButton("BACK TO MENU");

        menuButton.setFont(
                new Font(
                        "Arial",
                        Font.BOLD,
                        20
                )
        );

        menuButton.setAlignmentX(
                Component.CENTER_ALIGNMENT
        );


        menuButton.addActionListener(e -> {

            Menu menu = new Menu(window);

            window.setContentPane(menu);

            window.revalidate();

            window.repaint();
        });


        add(Box.createVerticalGlue());

        add(title);

        add(
                Box.createRigidArea(
                        new Dimension(0, 30)
                )
        );

        add(winnerLabel);

        add(
                Box.createRigidArea(
                        new Dimension(0, 40)
                )
        );

        add(menuButton);

        add(Box.createVerticalGlue());
    }
}
