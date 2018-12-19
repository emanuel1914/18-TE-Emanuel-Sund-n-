/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sten.sax.påse.pkg2;

import java.util.Scanner;

/**
 *
 * @author emanuel.sunden
 */
public class StenSaxPåse2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int guess = 0;
        Scanner keyboard = new Scanner(System.in);
       
       
        int Vinster = 0;
        int Förlöster = 0;
        int Lika = 0;
        int Spel = 0;
        int VinsterIrad =0;
        int NyVinsterIrad = 0;
        int FörlösterIrad = 0;
        int NyFörlösterIrad = 0;
        int LikaIrad = 0;
        int NylikaIrad = 0;
        String playAgain;
        String Guess;
        
               

        do {

// skriven ut ett intro.
            System.out.println(" Välkomen till Sten Sax Pappper, välj en ");
           
            Spel++;
            
            
            
            Guess = keyboard.nextLine();
     
            

            switch (Guess) {
                case "Sten":
                    guess = 1;
                    break;
                    
                case "sten":
                    guess = 1; 
                    break; 
                    
                case "Sax": 
                    guess = 2; 
                    break;
                    
                case "sax":
                    guess = 2;
                    break;
                    
                case "Papper":
                    guess = 3;
                    break; 
                    
                case "papper":
                    guess = 3; 
                    break; 
                    
            }  

// Låt spelaren välja sten sax eller påse.
           

            // dator väljer en av dom random.
            int Computer = 2;
             switch (Computer) {
                case 1:
                    System.out.println("Datorn väljde Sten");
                    break;

                case 2:
                    System.out.println("Datorn väljde Sax");
                    break;
                case 3:
                    System.out.println("Datorn väljde Papper");
            }
             
            // kolla om spelaren vann.
            if (guess == 1 && Computer == 2
                    || guess == 2 && Computer == 3
                    || guess == 3 && Computer == 1) {
                System.out.println("Du har vunnit");
                 Vinster++;
                 VinsterIrad++;

                 FörlösterIrad = 0;
                  LikaIrad = 0;
                  
                  
            } else if (guess == 2 && Computer == 1
                    || guess == 1 && Computer == 3
                    || guess == 3 && Computer == 2) {

                System.out.println("Du har förlorat");
                Förlöster ++;
                FörlösterIrad ++;
               VinsterIrad = 0;
                LikaIrad = 0;
                
                
                
            } else  { 
              System.out.println("Det blev lika");
              Lika++;
              LikaIrad++;
              VinsterIrad = 0;
              FörlösterIrad = 0;
            }
            // vissa va Datorn väljde 

           
             
            // öka en poäng om han gör det.
            
            
            if  (NyVinsterIrad < VinsterIrad)  {
                NyVinsterIrad = VinsterIrad;
            }
            
            if (NyFörlösterIrad < FörlösterIrad) {
                NyFörlösterIrad = FörlösterIrad;
            } 
                    
           if (NylikaIrad < LikaIrad) {
               NylikaIrad = LikaIrad;
           }         
            
            
            
            
            if  (Vinster == 1 ) {System.out.println("Du har vunnit en gång mot datorn");
            }else {System.out.println("Du har vunit " + Vinster + " gånger");
                        }
            
             System.out.println("Din högsta vinster i rad är "+ NyVinsterIrad +" gånger");
             
                     
             System.out.println("Din nuvarande vinster i rad är "+ VinsterIrad +" gånger");
            
            
            
             
             
             
             if (Förlöster == 1 ) {
                System.out.println("Du har förlorat mot datorn en gång");
            }else{
            System.out.println("Du har förlorat " + Förlöster + " gånger");
        }
            System.out.println("Din nuvarande Förlöster i rad är "+ FörlösterIrad +" gånger");
             
            System.out.println("Din högsta Förlöster i rad är "+ NyFörlösterIrad +" gånger");
            
            
            
            
            
            if (Lika == 1){System.out.println(" Det har fått lika mellan dig och datorn en gång"); }
            else {
            System.out.println("Du har fått lika " + Lika + " gånger");
            }
           
            System.out.println("Din nuvarande lika i rad är "+ LikaIrad +" gånger");
             
            System.out.println("Din högsta lika i rad är "+ NylikaIrad +" gånger");
             
            
            
            
            
            
            if (Spel == 1) { System.out.println("Det här är först gången du har spelat spelet");
                
            }else{
            System.out.println("Du har spelat " + Spel + " gånger");
            }

          
            
            
            
            
            if (guess == 1 && Computer == 2
                    || guess == 2 && Computer == 3
                    || guess == 3 && Computer == 1) {
                System.out.println(" Du har besegra datorn vill du göra det igen? y eller n ");
            } else if (guess == 2 && Computer == 1
                    || guess == 1 && Computer == 3
                    || guess == 3 && Computer == 2) {
                System.out.println(" Datron har besegra dig vill du se till att det inte händer igen genom att spela en gång till? y eller n ");
            } else {
                System.out.println(" Det har blivit likat mellan dig och datorn, vill du försöka vinna dena gång? y eller n");

            }
      
// kolla hur många gånger Datorn och spelaren väljer Sten Sax och Papper

            //fråga om han vill spela igen (gör en do loop).
            playAgain = keyboard.nextLine();

            //avsluta programet
        } while (playAgain.equals("y"));
        {
            System.out.println("Ses sennare");
        }

    }

}
