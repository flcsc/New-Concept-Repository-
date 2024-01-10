package Bikes;
/**
 * The Bicycle class represents a Bicycle as it is in real-life.
 */
public class Bicycle 
{
    int numWheels;
    String color;

    /**
     * Constructor of the Bicycle class
     * 
     * @param numWheels the number of wheels on the Bicycle
     * @param color the color of the Bicycle
     */
    public Bicycle(int numWheels, String color)
    {
        System.out.println("Creating a new bike...\n");
        // Assigns the given values
        this.numWheels = numWheels;
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "--- Bicycle Info ---" + "\n# Wheels: " + numWheels + "\nColor: " + color;
    }
}
