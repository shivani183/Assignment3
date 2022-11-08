package first;

import java.util.*;

class Guesser{
	int guessNum;
	int num;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Guesser Kindly guess a number between 1 to 10 ");
	    
	    guessNum=scan.nextInt();
	    while(guessNum<=10 || guessNum>10 ) {
		    if(guessNum>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNum=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num=guessNum;
		    break;}
	    }
		return num;
	}
}

class Player1{
	int guessNum;
	int num1;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 1 Kindly guess a number");
	    guessNum=scan.nextInt();
	    while(guessNum<=10 || guessNum>10 ) {
		    if(guessNum>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNum=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num1=guessNum;
		    break;}
	    }
	    
	    return num1;
	}
}
class Player2{
	int guessNum;
	int num2;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 2 Kindly guess a number");
	    guessNum=scan.nextInt();
	    while(guessNum<=10 || guessNum>10 ) {
		    if(guessNum>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNum=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num2=guessNum;
		    break;}
	    }
	    return num2;
	}
}
class Player3{
	int guessNum;
	int num3;
	
	int guessNum()
	
	{
		Scanner scan =new Scanner(System.in);
	    System.out.println("Player 3 Kindly guess a number");
	    guessNum=scan.nextInt();
	    while(guessNum<=10 || guessNum>10 ) {
		    if(guessNum>10) {
		    	System.out.println("Your Number is more than 10 Kindly try again");
		    	guessNum=scan.nextInt();
		    	continue;
		    	}		    
		    else {
		    	num3=guessNum;
		    break;}
	    }
	    return num3;
	}
}

class Umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser= g.guessNum();	
	}
	void collectFromPlayers() {
		Player1 p1=new Player1();
		Player2 p2=new Player2();
		Player3 p3=new Player3();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare() {
		if (numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
				System.out.println("All Players Won the Game");
			else if (numFromGuesser==numFromPlayer2)
				System.out.println("player1 and player2 Won the Game");
			else if (numFromGuesser==numFromPlayer3)
				System.out.println("player1 and player3 Won the Game");
			else
			    System.out.println("Player1 Won the Game");
			}
		else if (numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
				System.out.println("player 2 and player 3 wins");
			else
			    System.out.println("Player2 Won the Game");
			}
		else if (numFromGuesser==numFromPlayer3)
			
			System.out.println("Player3 Won the Game");
		else 
			
			System.out.println("You Lost Try Again!");
	}
}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Umpire c =new Umpire();
		c.collectFromGuesser();
		c.collectFromPlayers();
		c.compare();
		
		

	}

}
