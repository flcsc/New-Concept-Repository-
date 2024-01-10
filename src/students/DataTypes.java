package students;
public class DataTypes {
    
    public static void main(String[] args) {

        System.out.println("Hello World");
        
        // modulus: a % b 
        int[] scores = {90, 88, 93, 79};
        // Index        0   1    2   3

        // Round each number up 
        for(int i = 0; i < scores.length; i++) {

            int onesDigit = scores[i] % 10;

            /* Notice how the line below is very readable.
             * Consider a line like:
             * 
             * if (x >= 5)
             * 
             * Someone might have trouble reading this code,
             * because 'x' doesn't necessarily mean anything
             * in the English language. 
             * 
             * Using smart names for
             * variables and methods helps make what is called
             * "Self-explaining code", which is code that, as
             * it is called, explains itself.
             * 
             * This is super useful not only when you are
             * working in teams but also when you take a 
             * break from the code, and have to reread it 
             * to understand.
             */
            if (onesDigit >= 5) 
                scores[i] += (10 - onesDigit);

            System.out.println(scores[i]);

        }

        // REMEMBER:  0  1   2   3   4
        int[] ages = {3, 12, 19, 4, 10};

        // Access the THIRD ELEMENT
        ages[2] = 7;

        /* When there is only one line after
         * a condition, while, for, or any line
         * of the like "...(){}", you can ommit
         * the curly brackets.
         * 
         * The code below is the same as:
         * 
         * for (int i = 0; i <= 4; i++){
         * 
         *  System.out.println("x");
         * }
         */
        for (int i = 0; i <= 4; i++) 
            System.out.print("x");

    }

}
