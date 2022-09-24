package exception;
public class StringIndex {
	public static void main(String[] args) {
		String s="HARRY POTTER";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(1));
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(3));
		try
		{
			System.out.println(s.charAt(12));
		}
		catch(StringIndexOutOfBoundsException i)
		{
			System.out.println("entering to catch block");
			System.out.println(i.getMessage());
		}	
		System.out.println(s.charAt(4));
		System.out.println(s.charAt(7));
	}

}
