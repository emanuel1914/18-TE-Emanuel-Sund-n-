
package calculator.pkg2;
import java.util.Scanner;
public class Calculator2 {  

  
    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int num1;
    System.out.print("Enter a Number:");
    num1 = keyboard.nextInt();
   
    int num2;
    System.out.print("Enter a another Number:");
    num2 = keyboard.nextInt();
    
    keyboard.nextLine();
    System.out.print("which arithmetic ? :");
    String calculate = keyboard.nextLine();
    
    
   char whatToDo = calculate.charAt(0);
    }
    
}
