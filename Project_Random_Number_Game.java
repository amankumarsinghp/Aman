import java.io.*;
import java.util.Scanner;
class Project_Random_Number_Game
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int n;
		int a=(int)(Math.random()*100);
		do
		{
			System.out.println("Guess my Number Between 1 TO 100");
			n=in.nextInt();
			
			if(a==n)
			{
				System.out.println("WOOHOO... CORRECT NUMBER ");
				break;
			}
			
			else if(a>n)
			{
				System.out.println("Oops.. YOUR NUMBER IS SMALL ");
			}
			
			else if(a<n)
			{
				System.out.println("Oops.. YOUR NUMBER IS LARGE ");
			}
			
			else
			{
				System.out.println("Please Enter a Valid Number");
			}
		}
		while(n>=0);
		System.out.println("THE NUMBER IS = "+a);
	}
}
			