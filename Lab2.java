import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
			int computerNum;
			int playerNum;
			
		computerNum = 0 + (int)(Math.random()*10);
	
		System.out.print("Enter your guess between 0 and 10: ");
		playerNum= input.nextInt();
		
		
		
				if(playerNum==computerNum){
					System.out.print("You guessed correct!");
				}
					
				else if(playerNum<computerNum){
					System.out.print("you guessed to low!");
				}
			
				else
					System.out.print("You guessed to high!");
		
		}
}