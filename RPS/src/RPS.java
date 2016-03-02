 import java.util.Scanner;
  
  public class RPS {
 	static int MoveNum = 0;
  	static String CPUMove = null;
 	static boolean PlayerWon, CPUWon = false;
 	static boolean Quit = false, Tie = false;
  	static String Playermove;
 	static Scanner scan = new Scanner(System.in);
 	//static Scanner scan;
  
  	public static void main(String[] args) {
 		// TODO Auto-generated method stub
 		Scanner scan = new Scanner(System.in);
 		scan = new Scanner(System.in);
  		//System.out.println("Welcome to the Rock Paper scissors game");
 		System.out.println("Welcome to the Rock Paper Scissors Hammer Oxe game");
// 		System.out.println("Enter Rock ,Paper ,or Scissors");
 		System.out.println("Enter Rock ,Paper ,Scissors, Hammer, or Oxe");
 		Playermove = scan.nextLine();
 
 		if (Playermove.equalsIgnoreCase("Rock")) {
			CPUMove = CPUMove();
 			if (CPUMove.equals("Paper"))
 				CPUWon = true;
 			else
 				PlayerWon = true;
 
 		} else if (Playermove.equalsIgnoreCase("Paper")) {
 			CPUMove = CPUMove();
 			if (CPUMove.equals("Scissors"))
 				CPUWon = true;
 			else
 				PlayerWon = true;
 		} else if (Playermove.equalsIgnoreCase("Scissors")) {
 			CPUMove = CPUMove();
 			if (CPUMove.equals("Rock"))
 				CPUWon = true;
 			else
 				PlayerWon = true;
 		}else if (Playermove.equalsIgnoreCase("Hammer")) {
 			CPUMove = CPUMove();
 			if (CPUMove.equals("Oxe"))
 				CPUWon = true;
 			else
 				PlayerWon = true;
 		}else if (Playermove.equalsIgnoreCase("Oxe")) {
 			CPUMove = CPUMove();
 			if (CPUMove.equals("Paper"))
 				CPUWon = true;
 			else
 				PlayerWon = true;
 
 		Output();
 		
 		//loop for entering valid choices and checking win conditions
 		do{
 			//System.out.println("Enter Rock ,Paper ,or Scissors");
 			System.out.println("Enter Rock ,Paper ,Scissors, Hammer, or Oxe");
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
 			
 			else if (Playermove.equalsIgnoreCase("Hammer")) {
 	 			CPUMove = CPUMove();
 	 			if (CPUMove.equals("Oxe"))
 	 					CPUWon = true;
 	 				else if (CPUMove.equals("Hammer"))
 	 					Tie = true;
 	 				else
 	 					PlayerWon = true;
 	 			}
 			
 			else if (Playermove.equalsIgnoreCase("Oxe")) {
 	 			CPUMove = CPUMove();
 	 			if (CPUMove.equals("Paper"))
 	 					CPUWon = true;
 	 				else if (CPUMove.equals("Oxe"))
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
 		}
 
 	
 	//output statements
  	public static void Output() {
 		if (CPUWon) {
 			System.out.println("CPU WON with a " + CPUMove + " vs the player's " + Playermove);
 		} else {
 			System.out.println("Player WON with a " + Playermove + " vs the CPU's " + CPUMove);
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
  	}
 
 			//random cpu choice
 	 	public static String CPUMove() {
 	 		double choice = Math.random();
 	 		if (choice > .88) {
 	 			return "Rock";
 	 		} else if (choice > .66) {
 	 			return "Paper";
 	 		}  else if (choice > .44) {
 	 			return "Hammer";
 	 		} else if (choice > .22) {
 	 			return "Oxe";
 	 		}
 	 		else {
 	 			return "Scissors";
 	 		}
 	 
 	 	}
 	 }