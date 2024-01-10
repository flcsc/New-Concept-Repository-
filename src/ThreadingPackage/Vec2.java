package ThreadingPackage;

public class Vec2 {
    float x, y;

    public Vec2(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Vec2 plus(Vec2 other) {
        return new Vec2(this.x + other.x, this.y + other.y);
    }

    public Vec2 minus(Vec2 other) {
        return new Vec2(this.x - other.x, this.y - other.y);
    }

    public Vec2 multiply(float factor) {
        return new Vec2(this.x * factor, this.y * factor);
    }
    
    public Vec2 divide(float factor) {
    	return new Vec2(this.x / factor, this.y / factor);
    }
}
