package Bikes;
/**
 * The Bike class represents anything the resembles
 * a real-life bike.
 * 
 * @author Noah Perez
 */
public class Bike {
    int tires = 2;
    String color = "red";
    String seatMaterial = "leather";
    boolean hasLights = true;

    public Bike(int tires, String color, String seatMaterial, boolean hasLights) {
        this.tires = tires;
        this.color = color;
        this.seatMaterial = seatMaterial;
        this.hasLights = hasLights;
    }

    /**
     * Changes the color of the bike
     * @param newColor the new color of the bike
     */
    public void paint(String newColor) {
        color = newColor;
    }

    /**
     * "Performs" a tail-whip as one would on a BMX.
     * <br><br>
     * Due to the fact that this method is "protected",
     * subclasses of the Bike class CANNOT use this method.
     * The method tailWhip() only belongs to the Bike class.
     */
    protected void tailWhip() {
        System.out.println("\n*Performs tailwhip*");
    }

    @Override
    public String toString() {
        return "# Tires: " + tires
                + "\nColor: " + color
                + "\nSeat Material: " + seatMaterial
                + "\nHas Lights: " + (hasLights ? "True" : "False");
    }
}
