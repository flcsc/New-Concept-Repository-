import java.lang.reflect.*;

class Main{

    public static void main(String[] args){

        // Variables
        String [] classNames = {"Noahs", "AlexTran", "Emmanueli", "Evan", "Fina's", "Nathan", "Noel", "Rafaels", "Teghan"};
        Class<?>[] classes = new Class<?>[classNames.length];

        for(int i = 0; i < classes.length; i++){

            try{
                classes[i] = Class.forName(classNames[i]);
            }catch(ClassNotFoundException e){
                System.out.println("Cannot find class: " + classNames[i] + ".java");
                classes[i] = null;
            }
            
        }

        printClassInformation(classes);
    }

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
}
