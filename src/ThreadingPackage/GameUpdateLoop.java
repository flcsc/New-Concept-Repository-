package ThreadingPackage;
import java.lang.Runnable;
import java.util.ArrayList;

public class GameUpdateLoop implements Runnable {
    static ArrayList<Box> entities;
    Vec2 screenBounds;
    boolean isRunning = true;
    long previousTime;
    float deltaTime;

    public GameUpdateLoop(Vec2 screenBounds) {
        entities = new ArrayList<Box>();
        this.screenBounds = screenBounds;
        // Add boxes to the game
        for (int i = 0; i < 1000; i++) {
            entities.add(new Box(10, 10, 
                                new Vec2((int)(Math.random() * screenBounds.x), (int)(Math.random() * screenBounds.y)),
                                new Vec2((float)Math.random() * 100 - 50.0f, (float)Math.random() * 100 - 50.0f)));
        }
    }
    public void run() {
        while (isRunning) {
            tick();
        }
    };

    public void tick() {
    	deltaTime = (System.nanoTime() - previousTime) / 1000000000.0f;
    	if (deltaTime > 0.15f) deltaTime = 0.15f;
    	previousTime = System.nanoTime();
    	
    	for (Box box : entities) {
    		box.update(deltaTime);
    	}
    	for (int i = 0; i < entities.size(); i++) {
    		for (int j = i + 1; j < entities.size() - 1; j++) {
    			entities.get(i).checkCollisionWith(entities.get(j));
    		}
    	}
    }
}