
package stringwars;

import java.util.Scanner;

/**
 *
 * @author emanuel.sunden
 */
public class Stringwars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
     
     String somethingString;

       String newString; 
        
      System.out.println("skriv bara något");
      somethingString = keyboard.nextLine();
      System.out.println("" + somethingString +"");
       
      
      
      System.out.println("Write in upper case");
      newString = somethingString.toUpperCase();
      System.out.println("" + newString +"");
       
       
        
       System.out.println("Write something in lower case"); 
       newString = somethingString.toLowerCase();
        System.out.println("" + newString + "");
      
      
        System.out.println("The lengt of your string is " +  somethingString.length() + " ");    
        for(int i = 0; i < somethingString.length(); i++) {
            System.out.println(somethingString.charAt(i));
    }
        for  (int p = somethingString.length()-1; p >= 0; p--) {
           System.out.println(somethingString.charAt(p));
     }
      
    
}
}
