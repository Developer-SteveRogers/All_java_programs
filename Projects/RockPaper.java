import java.util.Scanner;
import java.util.Random;
 
 class RockPaper
 {
    public static void main(String[] args)
	{   
	System.out.println("This is the game of 1 round \n please do your best");
		System.out.println("---------------------------------------");
		System.out.println(" Here 0 = Rock \n 1 = paper \n 2 = Scissors \n Please enter your choice in describe numbers");
		
		 int input = 0;
		Scanner sc= new Scanner(System.in);
		input = sc.nextInt();
		Random rand = new Random();
		int Upperbond = 2;
		int random = rand.nextInt(Upperbond);
		System.out.println("computer choice:"+random);
		
		
		   if(input == 0 && random == 2 || input == 1 && random == 0 || input == 2 && random == 1 )
		   {
			   System.out.println(" congress you win!!!");
		   }
		   else if (input == 1 && random == 1 || input == 0 && random == 0 || input == 2 && random == 2 )
		   {
			   System.out.println("the game is draw");
		   }
		    else
			{				
		        System.out.println("you loss!!! Try next time");
			}	
			
		
	}
 }