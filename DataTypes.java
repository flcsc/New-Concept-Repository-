public class DataTypes {
    
    public static void main(String[] args) {

        System.out.println("Hello World");

        int a = 1;
        boolean b = true;
        float aaa = 3.24f;


        // modulus: a % b 
        int[] scores = {90, 88, 93, 79};
        // Index        0   1    2   3

        for(int i = 0; i < scores.length; i++) {

            int lastDigit = scores[i] % 10;

            if (lastDigit >= 5) {

                scores[i] += (10 - lastDigit);
                
            }

            System.out.println(scores[i]);

        }

        

        


        int[] ages = {3, 12, 19, 4, 10};
        ages[2] = 7;

        for (int i = 0; i <= 4; i++) {
            System.out.print("x");
        }




        








    }

}
