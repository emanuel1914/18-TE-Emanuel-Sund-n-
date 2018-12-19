/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stean.sax.påse;

import java.util.Scanner;

public class SteanSaxPåse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard  = new Scanner(System.in); 
       String guess = new String(); 
      
       
 
       
        String Sten = new String();
       String Sax = new String();
       String Papper = new String();
       
       
       
       int Computer = (int) (Math.random()* 3) +1;
      
     

// skriven ut ett intro.
        System.out.println(" Välkomen till Sten Sax Papper, välj en ");
     
        

// Låt spelaren välja sten sax eller påse.
      guess = keyboard.next(guess);
        
        
        
        // dator väljer en av dom random.
        
        
        
        
        // kolla om spelaren vann.
        
        if (guess.equals("Sten")&&Computer.equals("Sax")
         || guess.equals("Sax")&&Computer.equals("Papper")
         || guess.equals("Papper")&&Computer.equals("Sten"))
          { System.out.println("Du har vunnit");}
        else if (guess.equals("Papper")&&Computer.equals("Sax")
         || guess.equals("Sten")&&Computer.equals("Papper")
         || guess.equals("Sax")&&Computer.equals("Sten")) {
            System.out.print("Du har förlorat");
        }else{
            System.out.print("Det blev lika");
        }
        
        
        // öka en poäng om han gör det.
        
        
        
        //fråga om han vill spela igen (gör en do loop).
        
        
        
        //avsluta programet
        
            }
    
    }



