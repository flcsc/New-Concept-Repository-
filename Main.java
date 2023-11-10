import java.lang.reflect.*;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        // Variables
        String [] classNames = {"Noahs", "AlexTran", "Emmanueli", "Evan", "Fina's", "Nathan", "Noel", "Rafaels", "Teghan"};
        Method[] classMethods;
        ArrayList<Method> allMethods = new ArrayList<>();

        System.out.println("Printing all classes and data...\n");

        for(String name : classNames){

            try{

                // Get all the methods of the class
                classMethods = Class.forName(name).getDeclaredMethods();

                // Add each method of the class to allMethods
                for(Method method : classMethods)
                    allMethods.add(method);

                // Print header
                System.out.println("\nClass: " + name + ".java"
                                    + "\n----Methods----");
                
                // Print all methods
                for(int i = 0; i < classMethods.length; i++)
                    System.out.println((i+1) + ". " + classMethods[i]);

            }catch(ClassNotFoundException e){ 
                System.out.println("\nCannot find class: " + name + ".java");
            }

        }

        System.out.println("\nEnd of Methods!");
    }
}
