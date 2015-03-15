import java.util.Scanner;

public class Lab2c {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
			int computerNum;
			int playerNum;
			String playerAnswer;
			
		computerNum = 0 + (int)(Math.random()*10);
		
		System.out.print("Enter your guess between 0 and 10: ");
		playerNum= input.nextInt();
		
		if((playerNum >=0)&&(playerNum <= 10))
		   {
		
				if(playerNum==computerNum)
					System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed correct!\n");
		
				else if(playerNum<computerNum)
					System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed to low!\n");
			
				else if(playerNum>computerNum)
					System.out.printf("%s%d%s%d%s","The computer guessed ",computerNum," You guessed ",playerNum,", you guessed to high!\n");
		
				System.out.print("Do you want to play again? ");
					playerAnswer = input.next();
			
					if(playerAnswer.equalsIgnoreCase("yes"))
						System.out.print("Please restart program, good luck!");
					else
						System.out.print("Sorry to see you go");
		   }
		    
			else
				System.out.print("You have entered an invalid number");
		}
}
