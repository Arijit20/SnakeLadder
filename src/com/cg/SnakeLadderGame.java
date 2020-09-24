package com.cg;
import java.util.Random;

public class SnakeLadderGame {

	public static final int STARTING_POSITION = 0;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 int playerCount = 1;
	 int currentPosition = 0;
     System.out.println("Starting the game");
     System.out.println("No of player : " + playerCount);
     System.out.println("Initial position of the player :" + STARTING_POSITION);
     
     while(currentPosition != WINNING_POSITION) {
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
  
     System.out.println("Number got from rolling the die is "+ number_on_Die);
     
     int condition =(int)Math.floor(Math.random() * 10) % 3;
     switch(condition) {
     case NO_PLAY:
    	 currentPosition += 0;
    	 break;
     case LADDER:
    	 currentPosition += number_on_Die;
    	 if(currentPosition > WINNING_POSITION)
    		 currentPosition -= number_on_Die;
    	 break;
    default:{
    	currentPosition -= number_on_Die;
    	if(currentPosition < STARTING_POSITION )
    		currentPosition = STARTING_POSITION;
    } 
     }
     System.out.println("New Position is : " + currentPosition);
	}
  }
}
