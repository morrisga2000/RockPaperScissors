package com.tiy.ssa.doyouwanttoplayagame;

import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

	public static void main(String[] args) {
		int num = 0;

		Scanner sc = new Scanner(System.in);
		String throwSelction = null;
		String keepPlayingSelection = null;
		String userInput = null;
		boolean userFailed = false;
		int opponentChoice = 0;
		String verifyuserInput = null;

		System.out.println("What is your name?  Enter it here then press <Enter>");
		userInput = sc.nextLine();

		PrimaryUser theUser = new PrimaryUser();
		OpponentOne opponentOne = new OpponentOne();
		OpponentTwo opponentTwo = new OpponentTwo();
		OpponentThree opponentThree = new OpponentThree();
		OpponentAlwaysSame oldFaithful = new OpponentAlwaysSame();
		theUser.setName(userInput);
		theUser.setWantsToKeepPlaying(true);

		while (theUser.isWantsToKeepPlaying()) {
			int input = 0;

			do {
				System.out.println("Please select your opponent.");
				System.out.println("(1) for Bob, (2) for John, (3) for Sarah, (4)  for OldFaithful");
				verifyuserInput = sc.nextLine();

				userFailed = numberIsValid(verifyuserInput);
				opponentChoice = Integer.parseInt(verifyuserInput);
				
			} while (userFailed || opponentChoice > 4);

			if (opponentChoice == 1)
				num = opponentOne.getNum();
			else if (opponentChoice == 2)
				num = opponentTwo.getNum();
			else if (opponentChoice == 3)
				num = opponentThree.getNum();
			else if (opponentChoice == 4)
				num = oldFaithful.getNum();

			System.out.println("Please select Rock, Paper, or Scissors. Enter (R)ock, (P)aper, or (S)cissors.");
			throwSelction = sc.nextLine();

			do {
				if (throwSelction.equals("R") || throwSelction.toLowerCase().startsWith("r")) {
					input = 1;
					theUser.setInput(input);
				} else if (throwSelction.equals("P") || throwSelction.toLowerCase().startsWith("p")) {
					input = 2;
					theUser.setInput(input);
				} else if (throwSelction.equals("S") || throwSelction.toLowerCase().startsWith("s")) {
					input = 3;
					theUser.setInput(input);
				}
				if (input < 1) {
					System.out.println();
					System.out.println("ERROR: Please choose Rock, Paper or Scissors");
					System.out.println("Pick R, P, or S for:");
					System.out.println("ROCK (R), PAPER (P), or SCISSOR (S)");
					throwSelction = sc.nextLine();
				}
			} while (!(input == 1 || input == 2 || input == 3));

			// 1 = (R)ock
			// 2 = (P)aper
			// 3 = (S)cissors

			int Rock = 1, Paper = 2, Scissor = 3;

			if (num == Rock) {
				if (input == Rock) {
					System.out.println("Rock Vs. Rock: TIE");
					theUser.ties++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Rock: YOU WIN");
					theUser.wins++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Rock: YOU LOSE");
					theUser.losses++;
				}
			} else if (num == Paper) {
				if (input == Rock) {
					System.out.println("Rock Vs. Paper: YOU LOSE");
					theUser.losses++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Paper: TIE");
					theUser.ties++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Paper: YOU WIN");
					theUser.wins++;
				}

			} else if (num == Scissor) {
				if (input == Rock) {
					System.out.println("Rock Vs. Scissor: YOU WIN");
					theUser.wins++;
				} else if (input == Paper) {
					System.out.println("Paper Vs. Scissor: YOU LOSE");
					theUser.losses++;
				} else if (input == Scissor) {
					System.out.println("Scissor Vs. Scissor: TIE");
					theUser.ties++;
				}
			}

			System.out.println("Do you wish to play again?  Enter (y)es, or (n)o to quit.");
			keepPlayingSelection = sc.nextLine();

			if (keepPlayingSelection.contains("Y") || keepPlayingSelection.toLowerCase().startsWith("y"))
				theUser.setWantsToKeepPlaying(true);
			else
				theUser.setWantsToKeepPlaying(false);

			if (theUser.isWantsToKeepPlaying()) {
				System.out.println("Another Round!  Wonderful! \n Rock, Paper, SCISSOR");
			} else {
				System.out.println("GOODBYE " + theUser.getName());
				System.out.println(theUser.getName() + ", you have: " + theUser.wins + " wins, " + theUser.losses
						+ " losses, " + theUser.ties + " ties");

			}

		} // ends while loop

	} // ends main

	public static boolean numberIsValid(String someStringToMakeANumber) {
		try {
			int aNumber = Integer.parseInt(someStringToMakeANumber);
			return false;
		} catch (NumberFormatException e) {
			// TODO: handle exception
		}
		return true;
	}

} // end of class
