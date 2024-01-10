package Bikes;

/**
 * The Motorbike class represent motorvehicles.
 * <br><br>
 * This class extends the Bike class and thus 
 * inherits its fields and methods
 */
public class Motorbike extends Bike {
    double gasCapacity = 5.0;
    boolean radioIsPlaying = false;

    public Motorbike(int tires, String color, String seatMaterial, double gasCapacity) {
        // Call the super-class' constructor
        super(tires, color, seatMaterial, true);
        this.gasCapacity = gasCapacity;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nGas Capacity: " + gasCapacity;
    }

    /**
     * Sets radioIsPlaying to true
     */
    public void activateRadio() {
        radioIsPlaying = true;
    }

    /**
     * Sets radioIsPlaying to false
     */
    public void deactivateRadio() {
        radioIsPlaying = false;
    }
}