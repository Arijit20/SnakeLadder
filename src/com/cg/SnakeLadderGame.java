package com.cg;

import java.util.Random;

public class SnakeLadderGame {

	public static final int INITIAL_POSITION = 0;
	public static final int WINNING_POSITION = 100;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static void main(String args[]) {
		System.out.println("Welcome to Snake Ladder Game");
		System.out.println("No of Players : 2 ");
		System.out.println("Player 1 is starting the game");
		int position1 = 0, position2 = 0, count1 = 0, count2 = 0;
		int playerFlag = 0;

		while ((position1 != WINNING_POSITION) && (position2 != WINNING_POSITION)) {

			Random r = new Random();
			int numberOnDie = r.nextInt(6) + 1;

			int option = (int) Math.floor(Math.random() * 10) % 3;

			if (playerFlag == 0) {
				System.out.println("Position of player 1 is :" + position1);
				count1++;
				System.out.println("Playing : Player 1");
				System.out.println("Outcome of Die :" + numberOnDie);

				if(option == NO_PLAY) {
				    playerFlag  = 1;
					System.out.println("Position of player 1 is :" + position1);
				}

				else if(option == NO_PLAY){
					position1 = +numberOnDie;
					if (position1 > WINNING_POSITION)
						position1 = position1 - numberOnDie;
					System.out.println("Position of player 1 is :" + position1);
				}
					
				else if(option == SNAKE) {
					playerFlag = 1;
					position1 -= numberOnDie;
					if (position1 < INITIAL_POSITION)
						position1 = INITIAL_POSITION;
					System.out.println("Position of player 1 is :" + position1);
				}
				
				
			}

		else if (playerFlag == 1) {
			System.out.println("Position of player 2 is :" + position2);
				count2++;
				System.out.println("Playing : Player 2");

				System.out.println("Outcome of Die :" + numberOnDie);

				if(option == NO_PLAY){
				    playerFlag = 0;
					System.out.println("Position of player 2 is :" + position2);
				}

					else if (option == LADDER) {
					
					position2 = +numberOnDie;
					if (position2 > WINNING_POSITION)
						position2 = position2 - numberOnDie;
					System.out.println("Position of player 2 is :" + position2);
				}
					
					else if (option == SNAKE) {
						playerFlag = 0;
					position2 -= numberOnDie;
					if (position2 < INITIAL_POSITION)
						position2 = INITIAL_POSITION;
					System.out.println("Position of player 2 is :" + position2);
				}
				
				}
				
			}
			
			if (playerFlag == 0)
			System.out.println("Player 2 won the game");
		else
			System.out.println("Player 1 won the game");
		
		System.out.println("Number of times dice rolled by Player 1 :"+ count1);
		System.out.println("Number of times dice rolled by Player 2 :"+ count2);
		}
	}

