import java.lang.reflect.*;
import java.util.ArrayList;

class Main{

    public static void main(String[] args){

        String [] classNames = {"Noahs", "AlexTran", "Emmanueli", "Evan", "EvanRaju", "Fina's", "Nathan", "Noel", "Rafaels", "Teghan"};
        Method[] classMethods;
        ArrayList<Method> allMethods = new ArrayList<>();

        for(String name : classNames){

            try{

                classMethods = Class.forName(name).getDeclaredMethods();
                for(Method method : classMethods)
                    allMethods.add(method);
            }catch(ClassNotFoundException e){
                
                e.printStackTrace();
            }

        }

        for(Method method : allMethods){

            try{
                method.invoke(method.getClass());
            }catch(Exception e){
                e.printStackTrace();
            }
            System.out.println();
        }

        System.out.println("Hello World!");
    }
}
