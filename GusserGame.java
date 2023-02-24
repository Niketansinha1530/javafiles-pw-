import java.util.Scanner;
class Gusser
{
	int guessNum;
	
	int guessing()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" Gusser!! Guess the Number:");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Player
{
	int guessNum;
	
	int guessing()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Kindly! Guess the Number:");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int Numfromguesser;
	int NumOfPlayer1;
	int NumOfPlayer2;
	int NumOfPlayer3;
	
	void collectFromGuesser()
	{
		Gusser g=new Gusser();
		Numfromguesser=g.guessing();
	}
	void collectFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		
		 NumOfPlayer1=p1.guessing();
	     NumOfPlayer2=p2.guessing();
		 NumOfPlayer3=p3.guessing();
	}
	
	void compare()
	{
		if( Numfromguesser==NumOfPlayer1)
		{
			if(Numfromguesser==NumOfPlayer2 && Numfromguesser==NumOfPlayer3)
			{
				System.out.println("All players are winners:");
			}
			else if(Numfromguesser==NumOfPlayer2 )
			{
				System.out.println("Player 1 and 2 are winners");
			}
			else if(Numfromguesser==NumOfPlayer3 )
			{
				System.out.println("Player 1 and 3 are winners");
			}
			else {
				System.out.println("Player 1 is winer:");
			}	
		}
		else if( Numfromguesser==NumOfPlayer2)
		{
			if(Numfromguesser==NumOfPlayer3)
			{
				System.out.println("Player 2 and 3 are winners");
			}
			else {
			System.out.println("Player 2 is winer:");
			}
		}
		else if( Numfromguesser==NumOfPlayer3)
		{
			System.out.println("Player 3 is winer:");
		}
		else
		{
			System.out.println("tumnay sab nay galat guess kiya hai:");
		}
	}
}
public class GusserGame {

	public static void main(String[] args) {
		System.out.println("Start Game:");
		Umpire u=new Umpire();
		u.collectFromGuesser();
		u.collectFromPlayers();
		u.compare();

	}

}
