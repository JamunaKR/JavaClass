package interfacedemo;

import java.util.Scanner;

public class AbstractionDemo {
	public static void main(String[] args) {
		abstraction a;
		Scanner sc=new Scanner(System.in);
		while (true)
		{
			System.out.println("enter a choice from 1 to 3 ");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:a=new Abstraction1();
					a.subject();
					break;
			case 2:a=new Abstraction2();
					a.subject();
					break;
			case 3:a=new Abstraction3();
					a.subject();
					break;
			default:System.out.println("invalid choice");
			
			}
		}
	}

}
