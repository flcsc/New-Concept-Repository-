package students;
import java.util.Scanner;
import java.util.Arrays;
public class methodPractice {
    public static void main(String[] args) {
        //Makes a scanner
        Scanner input=new Scanner(System.in);
        //Welcomes user to the program
        welcome();
        //Ask user for grade
        System.out.print("Hello! Please enter your current Grade: ");
        int grade=input.nextInt();
        //Checks if user is in grade 12
        if(grade==12){
            //Outputs this
            System.out.println("You will graduate by the end of this school year");
        //Runs if user isn't in Grade 12
        }else if(grade<12&&grade>0){
            int yearsTilGraduate=12-grade;
            //Checks if user is in Grade 11
            if(yearsTilGraduate==1){
                //Outputs this
                System.out.println("You will graduate in the next school year");
            //Checks if user is in Grades 1-10
            }else{
                //Outputs this
                System.out.println("You will graduate in "+yearsTilGraduate+" years");
            }
        //Runs if user entered a number greater than 12 or less than 1
        }else{
            System.out.println("Not a valid grade :(");
        }
        //Has the user make an array
        System.out.println();
        makeIntArray();
        //Sorts an array given in the assignment
        System.out.println();
        sortThisArray();
        //Thanks the user and says goodbye
        System.out.println();
        goodbye();
        //Closes the scanner
        input.close();
    }

    //Welcomes user to the program
    public static void welcome(){
        System.out.println("Welcome to the program");
    }

    //Makes an array
    public static void makeIntArray(){
        //Makes a scanner
        Scanner input=new Scanner(System.in);
        //Asks user for array length
        System.out.print("Enter the length of the array: ");
        String arrayLen=input.nextLine();
        int len=Integer.parseInt(arrayLen);
        int[] array=new int[len];
        int add;
        //Makes array using user input
        for(int i=0; i<len; i++){
            System.out.print("Enter the number you want to add to the array: ");
            add=input.nextInt();
            array[i]=add;
            System.out.println(add+" has been added to the array");
        }
        //Prints out array
        System.out.println();
        System.out.println("Your array has been made");
        System.out.print("Your array is [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Sorts array from least to greatest
        Arrays.sort(array);
        System.out.println();
        System.out.print("After sorting from least to greatest, your array is [");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]);
            if(i!=array.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Sorts array from greatest to least
        System.out.println();
        System.out.print("From greatest to least, your array is [");
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //Closes scanner
        input.close();
    }

    //Sorts the array given in the assignment:  {3, 76, 12, 34, 5456, 32 , 32, 10}
    public static void sortThisArray(){
        //Loads the array
        int[] thisArray={3, 76, 12, 34, 5456, 32 , 32, 10};
        //Tells the user that the program has to sort this array: {3, 76, 12, 34, 5456, 32 , 32, 10}
        System.out.print("I realised you gave this array: [");
        for(int i=0; i<thisArray.length; i++){
            System.out.print(thisArray[i]);
            if(i!=thisArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
        System.out.println("Time to sort this");
        System.out.println();        
        //Sorts the array from least to greatest
        Arrays.sort(thisArray);
        System.out.print("After sorting from least to greatest, the array is [");
        for(int i=0; i<thisArray.length; i++){
            System.out.print(thisArray[i]);
            if(i!=thisArray.length-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
        //Sorts the array from greatest to least
        System.out.print("From greatest to least, your array is [");
        for(int i=thisArray.length-1; i>=0; i--){
            System.out.print(thisArray[i]);
            if(i!=0){
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println();
        //Tells user that the array has been sorted and the assignment is over
        System.out.println("I sorted the array and finished the assignment.");
        //Tells user to spare them from their wrath
        System.out.println("I've done everything you asked! Please don't harm me or my family!");
    }

    //Thanks user for using the program and says goodbye
    public static void goodbye(){
        System.out.println("Thank you for using the program. Goodbye");
    }

    
}
