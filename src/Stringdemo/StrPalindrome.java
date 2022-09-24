package Stringdemo;
import java.util.Scanner;
public class StrPalindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word to check for Palindrome");
		String p=sc.nextLine();
		String q="";
		for (int i=p.length()-1;i>=0;i--)
		{
			q= q +p.charAt(i);
		}
		if (q.equals(p))
		{
			System.out.println("the String is Palindrome");
		}
		else
		{
			System.out.println("the string is not a Palindrome");
		}
	}

}
