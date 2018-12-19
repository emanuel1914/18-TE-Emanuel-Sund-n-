/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.konsonanter;


import java.util.Scanner;

/**
 *
 * @author emanuel.sunden
 */
public class StringKonsonanter {

      
     
       
     
    public static void main(String[] args) {
        
    Scanner keyboard = new Scanner(System.in);
     
     String StringReplace = new String();
      
     System.out.println("skriv något");
     
     StringReplace = keyboard.nextLine();
      

      String vowels = "aAeEiIoOuUyYåÅäÄöÖ";
      
      // Skriv ue enbart vokalern '
      String consonants = "bBcCdGfFgGhHJjKkLlMmPpQqRrSsTtVvWwXxZz";
      
  for (int position = 0; position < StringReplace.length(); position ++) {
    if (vowels.indexOf(StringReplace.charAt(position)) > -1 ) {
        System.out.print(StringReplace.charAt(position));
    } 
    }
      System.out.println();
        
   
       for (int position = 0; position < StringReplace.length(); position ++) {
     if (consonants.indexOf(StringReplace.charAt(position)) > -1) {
        System.out.print(StringReplace.charAt(position));
    
       }
    
       }
       System.out.println();
    }
}