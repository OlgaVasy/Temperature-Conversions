// Ex.6.22: Temperature Conversions
// Converts and displays temperature
import java.util.Scanner;

public class TempConversion {

   private static double x = 5.0, y = 9.0;

   public static void main(String[] args){

      Scanner input = new Scanner(System.in);

      System.out.println("Welcome to the Temperature Converter!");
      System.out.println("Please enter '1' to convert Celsius to Fahrenheit or '2' to convert Fahrenheit to Celsius: ");
      int choice = input.nextInt();
      while(choice!=1 && choice!=2){
         System.out.println("Please enter '1' to convert Celsius to Fahrenheit or '2' to convert Fahrenheit to Celsius: ");
         choice = input.nextInt();
      }
      System.out.println("Please enter temperature: ");
      int temperature = input.nextInt();

      switch(choice){
         case 1:
            System.out.printf("%d Celsius is %d Fahrenheit\n", temperature, fahrenheit (temperature));
            break;
         case 2:
            System.out.printf("%d Fahrenheit is %d Celsius\n", temperature, celsius (temperature));
            break;
         default:
            break;
      }
   }
   public static int celsius(int fahrenheitTemp){
      return ((int)(x / y * (fahrenheitTemp - 32)));
   }
   public static int fahrenheit(int celsiusTemp){
      return ((int)(y / x * celsiusTemp + 32));
   }
}
