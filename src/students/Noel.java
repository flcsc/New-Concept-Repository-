package students;
import java.util.Scanner;  

public class Noel
{
    private String name;
    private int age;
    private String game; 
    private int hrs;
    
    public Noel(){
        this.name="Noel";
        this.age=16;
        this.game="Sonic Frontiers";
        this.hrs=100;
    }

    public Noel(String name, int age, String game, int hrs){
        this.name=name;
        this.age=age;
        this.game=game;
        this.hrs=hrs;
    }

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getGame(){
        return game;
    }

    public void setGame(String game){
        this.game=game;
    }

    public int getHours(){
        return hrs;
    }

    public void setHours(int hrs){
        this.hrs=hrs;
    }

    public String toString(){
        return name+" is "+age+" and has played "+game+" for "+hrs+" hours. ";
    }

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
