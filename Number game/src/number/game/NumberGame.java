
package number.game;

import java.util.Scanner;


public class NumberGame {

  
    public static void main(String[] args) {
    int guess = 0;
     String playAgain = new String();
   Scanner keyboard = new Scanner(System.in);
       int numberOfGames = 0;
       int highscore = 0;
              
   System.out.println("Welcome to the guessing game, \"Guess a number?\"");
        do{
         System.out.print("Write in the highest number to guess: ");
         int maxGuess = keyboard.nextInt();
         int answer = (int)(Math.random()* maxGuess) +1;
          int countGuesses = 0;
         
       
            do {
                // Writte some text
                System.out.print("Guess:");
                //Guess a number
                guess = keyboard.nextInt();
                countGuesses++; 
                // Cheak if the number is right
                 
                        if ( guess< answer){ 
                    System.out.println("The answer is higher");
                }
                if ( guess > answer){ 
                    System.out.println("the answer is lower");
                            }
                if (guess != answer) {
                    System.out.println("Wrong number guess again!");
                    }
                   } while (answer != guess);
                System.out.println("You are right!!!"); 
           


               if (countGuesses<2) {
                    System.out.println("It took you a guess good job.");
              }else{
                    System.out.println("It took you " + countGuesses + " guesses.");

                }
               if(answer!=guess){

                   } else{
                       numberOfGames++;
                       
               }     
             System.out.println (" You have played " + numberOfGames +  " games");
             //koden för antal gånger man har spelat.
            
             if(highscore < 1){
                 highscore=countGuesses;
              } 
             
             if (highscore > countGuesses){
                 highscore = countGuesses;
             }
                     
             System.out.println("Your highscore is " + highscore + " ");
                
                System.out.println("Would you like to try again, yes or no?");
                keyboard.nextLine();
                playAgain = keyboard.nextLine();
                 
          }while(playAgain.equals("yes"));{
          System.out.println("Good bye mate!");
      }

          }
        }
