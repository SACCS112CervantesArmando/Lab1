import java.util.Scanner;

public class Lab2a {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int playerNum;
        int computerNum;
       
    computerNum = 0 + (int)(Math.random()*10);

    System.out.print("Enter your guess between 0 and 10: ");
       playerNum = input.nextInt();
   
    if((playerNum <= 10)&&(playerNum >=0))
    	{
    		if (playerNum == computerNum)
    			System.out.print("You guessed correct!");

    		else if (playerNum < computerNum)
    			System.out.print("You guessed too low");

    		else if(playerNum > computerNum)
    			System.out.print("You guessed too high");
    	}
    
    		else
    			System.out.print("You have entered an invalid number!");


    }


}