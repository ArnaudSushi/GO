import javax.swing.*;
import java.awt.*;

public class BoardPanel extends JPanel {

    public BoardPanel() {
        super();
        this.setMinimumSize(new Dimension(200, 200));
    }

    @Override
    public void paint(Graphics g) {
        g.drawRect(10, 10, 100, 100);
    }
}
