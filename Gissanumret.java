import java.util.Scanner;


public class Gissanumret {


	static  int getRandom() {
		return 1 + (int)(100 * Math.random());
	}
	public static  void guessingNumberGame() {
        
		Scanner sc = new Scanner(System.in);
       
       
        int number = getRandom();
        int tries = 0;
        
              
        while(true) {
          System.out.println("Enter your guess (1-100):");
          
          int Guess = sc.nextInt();
          tries++;
          
          if (Guess == number) {
            System.out.println("Correct! You Win!");
            System.out.println("It took you " + tries + " tries");
            System.out.println("---------------------------");
            tries=0;
            number = getRandom();          
            
          }
          else if(number > Guess) {
            System.out.println("Nope! The number is higher. Guess again.");
          }
          else {
            System.out.println("Nope! The number is lower. Guess again.");
          }
          
        } 
	}
 

    public static void main(String arg[])
    {
 
          guessingNumberGame();
        
    }
}


