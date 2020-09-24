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
	 int playerCount = 2;
	 int currentPosition = 0;
	 int count = 0;
	 int playerFlag = 0;
	 //playerFlag : 0 for 1st player and 1 for 2nd player
	 int ladderFlag = 0;
	 //ladderFlag : 1 for ladder and 0 for others
	 
     System.out.println("Starting the game");
     System.out.println("No of players : " + playerCount);
     System.out.println("Initial position of both the players :" + STARTING_POSITION);
     System.out.println("Player 1 is first to roll dice");
     
     while(currentPosition != WINNING_POSITION) {
    	 count++;
    	 
    if(playerFlag == 0)
    	System.out.println("Playing : Player 1");
    else
    	System.out.println("Playing : Player 2");
    
    
     Random r = new Random();
     int number_on_Die =  r.nextInt(6) + 1 ;
  
     System.out.println("Number got from rolling the die is "+ number_on_Die);
     
     int condition =(int)Math.floor(Math.random() * 10) % 3;
     switch(condition) {
     case NO_PLAY:
    	 currentPosition += 0;
    	 break;
    	 
     case LADDER:
    	 ladderFlag = 1;
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
     
     if(ladderFlag == 0) {
    	 if(playerFlag == 0)
    		 playerFlag = 1;
    	 else
    		 playerFlag = 0;
    	 
     }
     
     else if (ladderFlag == 1) {
    	 playerFlag += 0;
    	 ladderFlag = 0;
     }
     
    	 
	}
     System.out.println("The dice was played " + count +" times");
  }
}
