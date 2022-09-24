package Stringdemo;
import java.util.Scanner;

public class ExMethod3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a sentence");
		String s=sc.nextLine();
		String s1[]=s.split(" ");
		System.out.println("the sentence after split :");
		for (int i=0;i<s1.length;i++)
		{
		System.out.println(s1[i]);
		}
	}
}
