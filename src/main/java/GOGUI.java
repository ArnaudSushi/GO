import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GOGUI {
    private JFrame window;
    private JPanel historyPanel;
    private JPanel gamePanel;
    private BoardPanel boardPanel;
    private JPanel chatPanel;

    GOGUI() {

        window = new JFrame("GO");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        historyPanel = new JPanel();
        historyPanel.setMinimumSize(new Dimension(window.getWidth(), 200));
        window.add(BorderLayout.NORTH, historyPanel);

        gamePanel = new JPanel();
        boardPanel = new BoardPanel();
        gamePanel.add(BorderLayout.WEST, boardPanel);

        chatPanel = new JPanel();
        gamePanel.add(BorderLayout.EAST, chatPanel);
        window.add(BorderLayout.SOUTH, gamePanel);

        window.setSize(1000, 1000);
        window.setLocationRelativeTo(null); //To center the window
        window.setVisible(true);
    }
}
