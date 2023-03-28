//Guess the game
import java.util.Scanner;
import java.lang.Math;
class Guess_Game
{
	public static void main(String[] args)
	{
	 int start=1;
	 int stop=4;
	 int u_value;
	
	 for(int i=1;i<6;i++)
	 {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter your choice====>> ");
	   u_value=sc.nextInt();
	   
	 
	
	   int pp_value= ((int)(Math.random()*(stop-start+1)+start));
	   System.out.println("pre-populated number is====>> "+pp_value);
	
	   if(u_value>pp_value)
	   {
	      System.out.println("########Value too large#######/n#######Try again########");
	   }
	   else if(u_value<pp_value)
	   {
	      System.out.println("#######Value too small#######/n#######Try again######");
	   }
	   else 
	   {
	      System.out.println("########Value mathches########/n*******CONGRATULATION*******");
	      break;
	   }
	 }
	}
}