package InterviewProg;

import java.util.Scanner;

public class ReverseStr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String to reverse");
		String s=sc.next();
		for (int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
