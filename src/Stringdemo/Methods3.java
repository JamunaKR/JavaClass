package Stringdemo;

public class Methods3 {
	public static void main(String[] args) {
		String x="rain";
		String x1="hello guys how are you";
		System.out.println(x.replace('r', 'm'));
		String s[]=x1.split(" ");
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}
}
