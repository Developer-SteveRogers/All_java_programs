import java.util.Scanner;
import java.util.Random;
class RandomNumber
{
	public static void main(String[] args)
	{
		Random rand = new Random();
		int yo= rand.nextInt(50);
		System.out.println("Your random number is "+yo);
	}
} 