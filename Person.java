import java.util.Scanner;

/**
 * A representation of a Human being. Contains FEILDS
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
    public Person() {
        breathe();
        
        System.out.println(add(1,1)); //(1,1)
        System.out.println(fullName("Bobby", "Jones"));
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your first name");
        String firstName = input.nextLine();

        System.out.println("What is your last name");
        String lastName = input.nextLine();
        
        System.out.println(fullName(firstName, lastName));
        
        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        if (a>b)
            System.out.println(a + " is greater than " + b);

        else if (a==b)
            System.out.println(a + " is " + b);

        else 
            System.out.println(a + " is smaller than " + b);

    }

    public static void breathe() {
        System.out.println("I am breathing");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static String fullName(String firstName, String lastName) {
        return "My name is " + firstName + " " + lastName;
    }

}