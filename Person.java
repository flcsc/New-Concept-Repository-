import java.util.Scanner;

/**
 * A representation of a Human being. Contains FIELDS
 * and METHODS which mimic aspects and actions of a
 * real person. This includes:
 * 
 * <ul>
 *      <li>breathing (breathe())</li>
 *      <li>adding numbers (add(a, b))</li>
 *      <li>returning a full name (fullName(firstName, lastName))</li>
 * </ul>
 */
class Person {
    
    private String firstName, lastName;
    private int age;

    /**
     * One implementation of the Person class' <strong>CONSTRUCTOR</strong>.
     *      <br><br>
     * <strong>CONSTRUCTORS</strong> are the methods used to create 
     * an <strong>INSTANCE/OBJECT</strong> of a class. A 
     * <strong>CLASS</strong> is a blueprint of any thing, and an
     * INSTANCE/OBJECT is an actual creation of a class.
     *      <br><br>
     * <strong>For example:</strong> you can have blueprint for a Bicycle, which
     * shows how many wheels there are, the engineering for the 
     * gears and brakes, as well as many other thing. It is, however,
     * JUST A BLUEPRINT, and is a real-world equivalent of a CLASS.
     *      <br><br>
     * When you actually use the blueprint to CREATE an INSTANCE of
     * the bicycle, you will have a REAL, WORKING BICYCLE, using the
     * resources you have. This REAL BICYCLE is a real-world example
     * of an INSTANCE/OBJECT of a CLASS.
     */
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    //setters
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * This method will do two things 
     * <ol>
     *  <li>Increment the person's age by 1</li>
     *  <li>Print a message congratulating the person with their new age</li>
     * </ol>
     */
    public void celebrateBirthday() {
        System.out.println("Happy Birthday! You are " + (++this.age) + " year(s) old!");
    }

    public String toString() {
        return "Full Name: " + getFirstName() + " " + getLastName() + "\n Age: " + getAge() + " years old";
    }

}