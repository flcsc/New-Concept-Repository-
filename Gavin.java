public class Gavin {
    
    private int age;
    private int heightInCm;

    public Gavin(int age, int heightInCm) {

        this.age = age;
        this.heightInCm = heightInCm;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeightInCm(int heightInCm) {
        this.heightInCm = heightInCm;
    }

    public int getHeightInCm() {
        return heightInCm;
    }

    public void watchMovie() {

       System.out.println("I am watching a movie"); 

    }

    public void watchMovie(String movie) {

        System.out.println("I am watching " + movie);

    }

    public String toString() {

        return "Gavin's age: " + age + "\nGavin's height: " + heightInCm + "cm";

    }



}
