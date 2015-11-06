import java.util.*;

public class GuessingGame {
  public static void main(String[] args) {
   Random r = new Random();
   int max = 10000;
   int min = 0;
   int tries = 1;
   int number = r.nextInt(max - min + 1) + min; //One could do (untested) Min + (int)(Math.random() * ((Max - Min) + 1))

   System.out.println("Guess a number between " + min + " and " + max + "!");   

   while(true) {
    Scanner userguess = new Scanner(System.in);
    int guess = userguess.nextInt();
    
    if(guess == number) {
      if(tries == 1) {
      	System.out.println("You have succeeded in correctly guessing the number " + number + " in " + tries + " try!");
      }
      else {
	System.out.println("You have succeeded in correctly guessing the number " + number + " in " + tries + " tries!");
      }
      number = r.nextInt(max - min + 1) + min;
      tries = 1;
      System.out.println("Press Ctrl+C to quit or type in a new number to play again!");
    } else if(guess < number) {
      tries++;
      System.out.println("Sorry, the number is higher than your guess!");
    } else if(guess > number) {
      tries++;
      System.out.println("Sorry, the number is lower than your guess!");
    }
   }
  }
}
