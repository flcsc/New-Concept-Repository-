public class NPC extends Entity{
    private String dialogue;
    float spawnX, spawnY;

    public NPC(int health, float mass, String name, String dialogue, float spawnX, float spawnY) {
        super(health, mass, name);
        this.dialogue = dialogue;
        this.spawnX = spawnX;
        this.spawnY = spawnY;
    }

    public String toString() {
        return super.toString()
        + "\nSays: " + dialogue
        + "\nSpawns at: (" + spawnX + ", " + spawnY + ")";
    }
}
