
package calculator.pkg2018;
 
import java.util.Scanner;

public class Calculator2018 {

    
    public static void main(String[] args) {
   System.out.println("Hell to this calculator!");
    System.out.print("Write in a number: ");
    
    Scanner keyboard = new Scanner (System.in);
    double number1 = keyboard.nextDouble();
     
    System.out.print("Write in another number: ");
     double number2 = keyboard.nextDouble();
    
     System.out.print("Which operation? ");
     keyboard.nextLine();
      String operation = keyboard.nextLine();
      char calc = operation.charAt(0);
      double result = 0;
       //kolla vilket räknesätt jag har skrivit
      switch( calc){
          case '+':
              result = number1 + number2;
          break;
          case '-':
              result = number1 - number2;
              break;
          case '*':
          result = number1 * number2;
          break; 
                  case '/':
       result = number1 / number2;
         break;     
                  
      }
      
     
    
         System.out.println( "The answer is " + result + " ");
    
    }
    
}
