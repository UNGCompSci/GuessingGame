public class GuessingGame {
  public static void main(String[] args) {
   int number = 1;
   
   while(true) {
    Scanner userguess = new Scanner(System.in);
    int max = 10000;
    int min = 0;
    int guess = random.nextInt(max - min + 1) + min; //One could do (untested) Min + (int)(Math.random() * ((Max - Min) + 1))
    int tries = 1;
    
    if(guess == number) {
      System.out.println("You have succeeded in correctly guessing the number " + number + " in " + tries + " tries!");
      guess = random.nextInt(max - min + 1) + min;
      tries = 1;
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
