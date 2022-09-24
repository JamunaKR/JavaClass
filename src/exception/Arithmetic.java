package exception;

public class Arithmetic {
	public static void main(String[] args) {
		System.out.println("start of Program");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println("entering catch block");
			System.out.println(e.getMessage());
		}
		System.out.println("end of Program");
	}

}
