package com.bridgelabz;

public class SnakeAndLadder {
	       //constants
			public static final int NO_PLAY=1;
		    public static final int LADDER=2;
		    public static final int SNAKE=3;

		    public static void main(String[] args)
		    {
		        int startPosition = 0;
		        int playerPosition=0;

		        System.out.println("Starting Position is "+startPosition);

		        int rollDice = (int) (Math.floor(Math.random() * 10 ) % 6) + 1 ;
		        System.out.println("After Rolling Dice We Get "+rollDice);

		        int playerCheckOption;

		        playerCheckOption = (int)(Math.random()*3 )+1;


		        switch(playerCheckOption)
		        {
		            case NO_PLAY:
		                System.out.println("It's No Play, Your position is not changed, You are at :" + playerPosition);
		                break;

		            case LADDER:
		                playerPosition = playerPosition + rollDice;
		                System.out.println("Congratulations !! You Got the ladder your position will be increesed by " + rollDice);
		                break;

		            case SNAKE:
		                playerPosition = playerPosition - rollDice;
		                System.out.println("Oops !! You just got bitten by snake your position will be increesed by " + rollDice);
		                break;

		            default:
		                System.out.println("Something went wrong!!");
		        }
		    }
		}