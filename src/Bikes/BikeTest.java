package Bikes;

public class BikeTest {
    public static void main(String[] args) {
        Bike bicycle = new Bike(2, "blue", "plastic", false);
        Motorbike raceBike = new Motorbike(3, "orange", "rubber", 7.0);

        System.out.println(bicycle + "\n");
        System.out.println(raceBike);
    }
}

