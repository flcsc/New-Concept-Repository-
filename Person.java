import java.util.Scanner;

class Person {
    
    public static void main(String[] args) {
        System.out.println("Hello World");
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

        if (a>b) {
            System.out.println(a + " is greater than " + b);
        }else if (a==b) {
            System.out.println(a + " is " + b);
        }else {
            System.out.println(a + " is smaller than " + b);
        }
        



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