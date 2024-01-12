package ThreadingPackage;

import java.lang.Thread;
import javax.swing.JFrame;

public class Threading {
    public static void main(String[] args) {
        // Variables
        final boolean useThreading = true;
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
        	// Starts a separate thread for game updates
            gameThread.start();
            // Reiterates as long as the JFrame is open
            while (frame.isActive()) {
                renderPanel.repaint();
            }
            // Sets the loop condition of the gameLoop's run() method to false. Ends the thread
            gameLoop.isRunning = false;
        } else {
            while (frame.isActive()) {
                renderPanel.repaint();
                gameLoop.tick();
            }
        }
        System.out.println("Closing game");
        System.exit(0);
    }
}