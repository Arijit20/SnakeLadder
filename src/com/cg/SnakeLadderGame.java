package com.cg;
import java.util.Random;

public class SnakeLadderGame {

	public static final int STARTING_POSITION = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int playerCount = 1;
     System.out.println("Starting the game");
     System.out.println("No of player : " + playerCount);
     System.out.println("Initial position of the player :" + STARTING_POSITION);
     
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
  
     System.out.println("Number got from rolling the die is "+ number_on_Die);
	}

}
