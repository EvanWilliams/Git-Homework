import java.util.Scanner;

public class RPS {
	static int MoveNum = 0;
	static String CPUMove = null;
	static boolean PlayerWon, CPUWon = false;
	static String Playermove;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to the Rock Paper scissors game");
		System.out.println("Enter Rock ,Paper ,or Scissors");
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
		}

		Output();

	}

	public static void Output() {
		if (CPUWon) {
			System.out.println("CPU WON with a " + CPUMove + " vs the player's " + Playermove);
		} else {
			System.out.println("Player WON with a " + Playermove + " vs the CPU's " + CPUMove);
		}

	}

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
