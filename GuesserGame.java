package Assignment03;

import java.util.Scanner;

class Guesser
{ int guessNum;
int guessNum()
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Guesser kindly guess the nummber!");
    	guessNum=scan.nextInt();
    	return guessNum;
    			
	}
	}
class Player
{ int guessNum;
int guessNum()
    { 
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Player kindly guess the nummber!");
    	guessNum=scan.nextInt();
    	return guessNum;
    			
	}
	}
class Umpire
{ int numFromGuesser;
  int numFromPlayer1;
  int numFromPlayer2;
  int numFromPlayer3;
  
  void collectNumFromGuesser()
  {
	  Guesser g=new Guesser();
	  numFromGuesser=g.guessNum();
  System.out.println("HINT:Number ranges from : "+(numFromGuesser+10)+" to "+(numFromGuesser-15));

  }
  void collectNumFromPlayers()
  {
	  Player p1=new Player();
	  Player p2=new Player();
	  Player p3=new Player();
	  
	  numFromPlayer1=p1.guessNum();
	  numFromPlayer2=p2.guessNum();
	  numFromPlayer3=p3.guessNum();
  }
  void compare()
  {
	 if (numFromGuesser==numFromPlayer1) 
		 {if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			 System.out.println("All the 3 Plyers win the Game!");
		 else if (numFromGuesser==numFromPlayer2)
			 System.out.println("Player1 and Player2 win the Game!");
		 else if (numFromGuesser==numFromPlayer3)
			 System.out.println("Player1 and Player3 win the Game!");
		 else 
	         System.out.println("Player1 Win the Game!");
		 }
	 else if (numFromGuesser==numFromPlayer2) 
	     { if(numFromGuesser==numFromPlayer3)
	     System.out.println("Player2 and Player3 win the Game!");
	       else
		 System.out.println("Player2 Win the Game!");
	     }
	
	 else if (numFromGuesser==numFromPlayer3) 
	 {
		 System.out.println("Player3 Win the Game!");
	 }
  }
  
  int Margin1;
  int Margin2;
  int Margin3;
  void compare1()
  {
	   if (numFromGuesser>numFromPlayer1)
		 {
			  Margin1=numFromGuesser-numFromPlayer1;
			 System.out.println("Player1 lost by Margin "+Margin1);
			 
		 }
		 else if (numFromGuesser<numFromPlayer1)
		 {
			 Margin1=numFromPlayer1-numFromGuesser;
			 System.out.println("Player1 lost by Margin "+Margin1);
			 
		 }
	   
	 }
  void compare2()
  {
	   if (numFromGuesser>numFromPlayer2)
		 {
			  Margin2=numFromGuesser-numFromPlayer2;
			 System.out.println("Player2 lost by Margin "+Margin2);
		 }
		 else if (numFromGuesser<numFromPlayer2)
		 {
			 Margin2=numFromPlayer2-numFromGuesser;
			 System.out.println("Player2 lost by Margin "+Margin2);
		 }

  }
  void compare3()
  {
	   if (numFromGuesser>numFromPlayer3)
		 {
			 Margin3=numFromGuesser-numFromPlayer3;
			 System.out.println("Player3 lost by Margin "+Margin3);
		 }
		 else if (numFromGuesser<numFromPlayer3)
		 {
			 Margin3=numFromPlayer3-numFromGuesser;
			 System.out.println("Player3 lost by Margin "+Margin3);
		 }
	   
  }
  void secondChance() {
	  System.out.println();
  if ((numFromGuesser!=numFromPlayer1) &&
		  (numFromGuesser!=numFromPlayer2) && (numFromGuesser!=numFromPlayer3)) 
  {
	  System.out.println("All Players lost the game!");
  }

	  int [] arr= {Margin1,Margin2,Margin3};
	  int minMargin=100;
	  for (int i=0;i<arr.length;i++) {
		  if(minMargin>arr[i]) {
			  minMargin=arr[i];
			  
		  }
	  }
	  System.out.println();
	  if ((numFromGuesser!=numFromPlayer1) &&
			  (numFromGuesser!=numFromPlayer2) && (numFromGuesser!=numFromPlayer3)) 
	  {
	  System.out.println("NOTE TO UMPIRE= The Player who reached about nearest value with Margin "
	  +minMargin+ " can be given another one chance to guess!");
	  }
  }
 }

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		u.compare1();
		u.compare2();
		u.compare3();
		u.secondChance();

	}

}


