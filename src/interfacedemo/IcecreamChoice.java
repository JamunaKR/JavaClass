package interfacedemo;
import java.util.Scanner;
public class IcecreamChoice {
	public static void main(String[] args) {
		IcecreamFace i;
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("enter choice from 1 to 3 ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:	i=new Icecream1();
					i.icecream();
					break;
			case 2:	i=new Icecream2();
					i.icecream();
					break;
			case 3:	i=new Icecream3();
					i.icecream();
					break;
			default: System.out.println("invalid choice");
			}
		}
	}
}
