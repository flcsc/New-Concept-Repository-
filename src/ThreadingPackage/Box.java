package ThreadingPackage;
import java.awt.Color;

public class Box {
	int width, height;
	Vec2 position;
	Vec2 velocity;

	Color uncollided = new Color(0, 255, 0);
	Color collided = new Color(255, 0, 0);
	Color color;

	public Box(int width, int height, Vec2 position, Vec2 velocity) {
		color = uncollided;
		this.width = width;
		this.height = height;
		this.position = position;
		this.velocity = velocity;
	}

	public void update(float deltaTime) {
		color = uncollided;
		position.x += velocity.x * deltaTime;
		position.y += velocity.y * deltaTime;
	}

	public boolean checkCollisionWith(Box other) {
		return (!(position.x + width  < other.position.x
				|| position.x > other.position.x + other.width
				|| position.y > other.position.y + other.height
				|| position.y + height < other.position.y));
	}
	
	public void handleCollisionWith(Box other) {
		color = collided;
		Vec2 collisionAmount = new Vec2(0.0f, 0.0f);

		if (position.x + width / 2 > other.position.x + other.width / 2) {
			collisionAmount.x = (other.position.x + other.width) - position.x;
		} else {
			collisionAmount.x = other.position.x - (position.x + width);
		}
		collisionAmount.x /= width;

		if (position.y + height / 2 > other.position.y + other.height / 2) {
			collisionAmount.y = (other.position.y + other.height) - position.y;
		} else {
			collisionAmount.y = other.position.y - (position.y + height);
		}
		collisionAmount.y /= height;

		if(Math.abs(collisionAmount.x) > Math.abs(collisionAmount.y)) {
			position.y += collisionAmount.y * height;
			velocity.y *= -1;
		} else {
			position.x += collisionAmount.x * width;
			velocity.x *= -1;
		}
	}
}
