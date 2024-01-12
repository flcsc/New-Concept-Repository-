package ThreadingPackage;
import java.lang.Runnable;
import java.util.ArrayList;

public class GameUpdateLoop implements Runnable {
    static ArrayList<Box> entities;
    Vec2 screenBounds;
    boolean isRunning = true;
    long previousTime;
    float deltaTime;
    Box topWall, bottomWall, leftWall, rightWall;
    Box walls[];

    public GameUpdateLoop(Vec2 screenBounds) {
        entities = new ArrayList<Box>();
        this.screenBounds = screenBounds;
        // Create Box for each side of the screen
        topWall = new Box((int)screenBounds.x, 100, new Vec2(0.0f, (float)screenBounds.y), new Vec2(0.0f, 0.0f));
        bottomWall = new Box((int)screenBounds.x, 100, new Vec2(0.0f, -100.0f), new Vec2(0.0f, 0.0f));
        leftWall = new Box(100, (int)screenBounds.y, new Vec2(-100.0f, 0.0f), new Vec2(0.0f, 0.0f));
        rightWall = new Box(100, (int)screenBounds.y, new Vec2((float)screenBounds.x, 0.0f), new Vec2(0.0f, 0.0f));
        walls = new Box[]{topWall, bottomWall, leftWall, rightWall};
        // Add boxes to the game
        for (int i = 0; i < 2000; i++) {
            entities.add(new Box(4, 4, 
                         new Vec2((int)(Math.random() * screenBounds.x), (int)(Math.random() * screenBounds.y)),
                         new Vec2((float)Math.random() * 100.0f - 50.0f, (float)Math.random() * 100.0f - 50.0f)));
        }
    }
    
    public void run() {
        while (isRunning) tick();
    };

    public void tick() {
    	deltaTime = (System.currentTimeMillis() - previousTime) / 1000.0f;
    	if (deltaTime > 0.15f) deltaTime = 0.15f;
    	previousTime = System.currentTimeMillis();
    	// Update each Box
    	for (Box box : entities) {
    		box.update(deltaTime);
    	}
    	// Check collisions for all Boxes
    	for (int i = 0; i < entities.size(); i++) {
    		// Wall collisions
    		for (Box wall : walls) {
    			if(entities.get(i).checkCollisionWith(wall))
        			entities.get(i).handleCollisionWith(wall);
    		}
    		// Box-to-Box collisions
    		for (int j = i + 1; j < entities.size(); j++) {
    			if (entities.get(i).checkCollisionWith(entities.get(j))) {
    				entities.get(i).handleCollisionWith(entities.get(j));
    				entities.get(j).handleCollisionWith(entities.get(i));
    			}
    		}
    	}
    }
}