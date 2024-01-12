package ThreadingPackage;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class RenderPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	long previousTime;
    float frameTime;

    public RenderPanel(int width, int height) {
        setBounds(0, 0, width, height);
    }

    public void paint(Graphics g) {
        super.paint(g);
        // Update time variables
        frameTime = (System.currentTimeMillis() - previousTime);
        previousTime = System.currentTimeMillis();
        for (Box box : GameUpdateLoop.entities) {
        	g.setColor(box.color);
            g.fillRect((int)box.position.x, (int)box.position.y, box.width, box.height);
        }
        g.setColor(Color.red);
        g.drawString(frameTime + " ms", 4, 12);
    }
}
