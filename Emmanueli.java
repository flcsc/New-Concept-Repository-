import java.util.Scanner;
public class Emmanueli
{
  public static void main(String[]args)
  {
    System.out.println("Hi, Emmanuel");
    int[] numbers = {3, 76, 12, 34, 5456, 32 , 32, 10};
    
    sort(numbers);
    for(int i = 0; i < numbers.length;i++)
    {
        System.out.println(numbers[i]);
    }
    for(int i = 0; i < numbers.length;i++)
    {
        System.out.println( (numbers[i])*2);
    }
  }
  
  public static void sort(int[] array){
      Scanner scanner = new Scanner(System.in);
      System.out.print("how old are you: ");
      int age = Integer.parseInt(scanner.nextLine());
      System.out.println("Your are " + age + " years old" + "\n");
  }
}
