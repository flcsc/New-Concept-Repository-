package ThreadingPackage;

import java.lang.Thread;
import javax.swing.JFrame;

public class Threading {
    public static void main(String[] args) {
        // Variables
        final boolean useThreading = false;
        final int width = 800;
        final int height = 600;
        JFrame frame = new JFrame("Threading");
        RenderPanel renderPanel = new RenderPanel(width, height);
        GameUpdateLoop gameLoop = new GameUpdateLoop(new Vec2(width, height));
        // Set up the frame
        frame.setContentPane(renderPanel);
        frame.setBounds(0, 0, width, height);
        frame.setVisible(true);
        // Begin game loop
        Thread gameThread = new Thread(gameLoop);
        // Begin loop
        if (useThreading) {
            gameThread.start();
            while (gameThread.isAlive() || frame.isActive()) {
                renderPanel.repaint();
            }
            if (gameThread.isAlive()) gameLoop.isRunning = false;
            gameThread.interrupt();
        } else {
            while (frame.isShowing()) {
                renderPanel.repaint();
                gameLoop.tick();
            }
        }
        System.out.println("Closing game");
        System.exit(0);
    }
}