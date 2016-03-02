import java.util.Scanner;

public class RPS {
	static String CPUMove = null;
	static boolean PlayerWon, CPUWon = false, Quit = false, Tie = false;
	static String Playermove;
	static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		System.out.println("Welcome to the Rock Paper scissors game");
		
		//loop for entering valid choices and checking win conditions
		do{
			System.out.println("Enter Rock ,Paper ,or Scissors");
			Playermove = scan.nextLine();
			
			if (Playermove.equalsIgnoreCase("Rock")) {
				CPUMove = CPUMove();
				if (CPUMove.equals("Paper"))
					CPUWon = true;
				else if (CPUMove.equals("Rock"))
					Tie = true;
				else
					PlayerWon = true;
			}
			else if (Playermove.equalsIgnoreCase("Paper")) {
				CPUMove = CPUMove();
				if (CPUMove.equals("Scissors"))
					CPUWon = true;
				else if (CPUMove.equals("Paper"))
					Tie = true;
				else
					PlayerWon = true;
			}
			else if (Playermove.equalsIgnoreCase("Scissors")) {
				CPUMove = CPUMove();
				if (CPUMove.equals("Rock"))
					CPUWon = true;
				else if (CPUMove.equals("Scissors"))
					Tie = true;
				else
					PlayerWon = true;
			}
			else{
				System.out.println("That is not a valid play.  Please check spelling.");
				continue;
			}
			//Print output to screen and reset win condition booleans
			Output();
			Tie = false;
			CPUWon = false;
			PlayerWon = false;
			
			//ask user if they want to play again
			System.out.println("Do you want to play again? Enter yes or no.");
			Playermove = scan.nextLine();
			if(Playermove.equalsIgnoreCase("no")){
				Quit = true;
			}
		
		}while(Quit == false);

	}
	
	//output statements
	public static void Output() {
		if (CPUWon){
			System.out.println("CPU WON with " + CPUMove + " vs your " + Playermove);
		}
		else if (Tie){
			System.out.println("TIE! Your play: " + Playermove + " CPU play: " + CPUMove);
		}
		else{
			System.out.println("You WON with " + Playermove + " vs the CPU's " + CPUMove);
		}

	}
	
	//random cpu choice
	public static String CPUMove() {
		double choice = Math.random();
		if (choice > .66) {
			return "Rock";
		} else if (choice > .33) {
			return "Paper";
		} else {
			return "Scissors";
		}

	}
}
