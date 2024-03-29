package students;
import java.lang.reflect.*;

import Bikes.Bicycle;

class Main{

    /**
     * The main method which is THE METHOD which the program calls when it is run.
     
     * @param args any additional arguments
     */
    public static void main(String[] args)
    {
        Bicycle bike = new Bicycle(2, "Blue");
        System.out.println(bike.toString());                        // This SPECIFIC method also lets you do System.out.println(bike);

        // // Get print existing class information
        // String [] classNames = {"Noahs", "AlexTran", "Emmanueli", "Evan", "Fina's", "Nathan", "Noel", "Rafaels", "Teghan"};
        // Class<?>[] classes = getClasses(classNames);
        // printClassInformation(classes);
    }

    private static void getClasses(String[] classNames)
    {
        classNames = sortAlphabetically(classNames);
        var classes = new Class<?>[classNames.length];

        // Add all existing classes to classes variable from classNames
        for(int i = 0; i < classes.length; i++){

            try{

                classes[i] = Class.forName(classNames[i]);
            }catch(ClassNotFoundException e){

                System.out.println("Cannot find class: " + classNames[i] + ".java");
                classes[i] = null;
            } 
        }
        printClassInformation(classes);

        Noahs.roundScores();
    }

    /**
     * Prints information of Class Objects, specifically the class name and its methods in a numbered list.
     * @param classes the Class array to be displayed
     */
    private static void printClassInformation(Class<?>[] classes){

        Method[] classMethods;

        // Start printing information
        System.out.println("Printing all classes and data...\n");

        for(Class<?> c : classes){
            if(c == null) continue;

            // Get all the methods of the class
            classMethods = c.getDeclaredMethods();

            // Print header
            System.out.println("\nClass: " + c.getName() + ".java"
                                + "\n----Methods----");
            
            // Print all methods
            for(int i = 0; i < classMethods.length; i++)
                System.out.println((i+1) + ". " + classMethods[i]);
        
        }    
    }
    
    /**
     * Takes an array of Strings and sorts them in lexicographical order, from least to greatest (A-Z).
     * 
     * @param array the String array to be sorted
     * @return the sorted String array
     */
    private static String[] sortAlphabetically(String[] array){
        String sorted[] = array.clone();
        int lowestValueIndex;
        String temp;

        for(int i = 0; i < sorted.length; i++){

            lowestValueIndex = i;
            temp = sorted[i];
            for(int j = i; j < sorted.length; j++){

                if(sorted[j].compareTo(sorted[lowestValueIndex]) < 1)
                    lowestValueIndex = j;
            }
            sorted[i] = sorted[lowestValueIndex];
            sorted[lowestValueIndex] = temp;
        }

        return sorted;
    }
}
