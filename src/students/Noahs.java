package students;
public class Noahs 
{
    // The method is "static", meaning that it has the same value for all Noahs instances
    public static void sayHiNoah(){

        System.out.println("Hi, Noah!");
    }

    /**
     * Prints an hard-typed array representing students' grades,
     * before and after rounding them up if they are valid.
     */
    public static void roundScores(){

        // Instantiate array of scores
        int[] scores = {76, 78, 32, 54, 54, 93, 95};

        System.out.print("\nThe old scores are: ");
        printIntArray(scores);

        // Iterates through each element
        for(int i = 0; i < scores.length; i++){

            // Check if the remainder of scores[i] / 10 is greater than or equal to 5
            if(scores[i] % 10 >= 5){

                // Adds 10 - (remainder scores[i] / 10)
                scores[i] += (10 - scores[i] % 10);
            }
        }

        System.out.print("\n\nThe new scores are: ");
        printIntArray(scores);
    }

    /**
     * Prints an array of integers
     * 
     * @param array the array of integers to be printed
     */
    public static void printIntArray(int[] array){

        System.out.print("{ ");

        // Print each integer in the array
        for(int number : array)
            System.out.print(number + " ");

        System.out.println("}");
    }
}
