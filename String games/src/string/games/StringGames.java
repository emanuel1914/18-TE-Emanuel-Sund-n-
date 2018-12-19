
package string.games;
 
import java.util.Scanner; 

public class StringGames {
    String text = new String(); 
        


            public static void main(String[] args) {
    
                
                Scanner keyboard = new Scanner(System.in);
     
     String somethingString;
     String newString; 
     String newerString;
      
      System.out.println("skriv bara något");
      somethingString = keyboard.nextLine();
      
      System.out.println("" + somethingString +"");
       
      
      
      System.out.println("Write in upper case");
      somethingString = keyboard.nextLine();
      newString = somethingString.toUpperCase();
      System.out.println("" + newString +"");
       
       
        
       System.out.println("Write something in lower case");
    newerString = keyboard.nextLine(); 
       newerString = newerString.toLowerCase();
        System.out.println("" + newerString + "");
      
      
        System.out.println("The lengt of your string is" + newerString.length() + " ");    
        for(int i = 0; i < newerString.length(); i++) {
            System.out.println(newerString.charAt(i));
        }    
   }
    
}
