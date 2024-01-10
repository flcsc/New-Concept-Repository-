package ThreadingPackage;

public class Box {
    int width, height;
    Vec2 position;
    Vec2 velocity;

    public Box(int width, int height, Vec2 position, Vec2 velocity) {
        this.width = width;
        this.height = height;
        this.position = position;
        this.velocity = velocity;
    }

    public void update(float deltaTime) {
        position = position.plus(velocity.multiply(deltaTime));
    }
    
    public void checkCollisionWith(Box other) {
    	Vec2 collisionAmount = new Vec2(0.0f, 0.0f);
    	if (!(this.position.x + width  < other.position.x ||  this.position.x > other.position.x + other.width)) {
    		if (this.position.x + width / 2 > other.position.x + other.width / 2) {
    			collisionAmount.x = other.position.x + other.width - this.position.x;
    		} else {
    			collisionAmount.x =  other.position.x - this.position.x + width;
    		}
    		collisionAmount.x /= width;
    		
    		if (this.position.y + height / 2 > other.position.y + other.height / 2) {
    			collisionAmount.y = other.position.y + other.height - this.position.y;
    		} else {
    			collisionAmount.y = other.position.y - this.position.y + height;
    		}
    		collisionAmount.y /= height;
    		
    		if(Math.abs(collisionAmount.x) > Math.abs(collisionAmount.y)) {
        		position.y += collisionAmount.y * height / 2;
        		velocity.y *= -1;
        	} else {
        		position.x += collisionAmount.x * width / 2;
        		velocity.x *= -1;
        	}
    	}
    	
    	if(Math.abs(collisionAmount.x) > Math.abs(collisionAmount.y)) {
    		position.y += collisionAmount.y * height / 2;
    		velocity.y *= -1;
    	} else {
    		position.x += collisionAmount.x * width / 2;
    		velocity.x *= -1;
    	}
    	
    }
}
