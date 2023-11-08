import java.util.Scanner;  

public class Noel
{
    // The method is "static", meaning that it has the same value for all Noel instances
    public static void sayHiToMe()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Hi, Noel");
        System.out.println("Hi there, what's your name?");
        String name=input.nextLine();
        System.out.println("Hi there "+name);
        input.close(); // MAKE SURE TO CLOSE THE SCANNER
    }
}
