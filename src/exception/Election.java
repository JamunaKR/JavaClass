package exception;

import java.util.Scanner;

public class Election {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to election voting");
		System.out.println("enter your age");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("eligible to vote, vote wisely");
		}
		else
		{
			try
			{
				throw new NotEligibleToVoteException();
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
		System.out.println("end of voting process");
	} 

}
