package Entity;
public class Entity {
    public int health;
    private float mass;
    private String name;

    public Entity() {
        health = 100;
        mass = 5.0f;
        name = "Entity";
    }
    public Entity(int health, float mass, String name) {
        this.health = health;
        this.mass = mass;
        this.name = name;
    }

    public String toString() {
        return "\nName: " + name + "\nHealth: " 
                + health + " HP" + "\nMass: " 
                + mass + " kg";
    }
}