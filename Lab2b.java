import java.util.Scanner;

public class Lab2b {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int playerNum;
        int computerNum;
       
    computerNum = 0 + (int)(Math.random()*10);


    System.out.print("Enter your guess between 0 and 10: ");
       playerNum = input.nextInt();

    if ((playerNum < 0)||(playerNum > 10))
      {    
    System.out.print("You have made an invalid guess!");
       }
    
    else 
    {

         if (playerNum == computerNum)
           System.out.print("You guessed correct!");

         else if (playerNum < computerNum)
           System.out.print("You guessed too low");

         else if(playerNum > computerNum)
           System.out.print("You guessed too high");
 
        }


    }


}