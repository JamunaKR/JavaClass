package exception;
import java.io.IOException;
import java.util.Scanner;
public class BloodDonation {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Blood donation camp");
		System.out.println("Please enter your age");
		int age=sc.nextInt();
		if((age>=18)&&(age<=65)) {
		System.out.println("You are eligible to donate the blood");
		}
		else {
			try {
				throw new NotEligibleToDonateBloodException();
			}
			catch(Exception a) {
				System.out.println(a.getMessage());
			}
		}
		System.out.println("End of Blood donation Procedure");
		}
	}