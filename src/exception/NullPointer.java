package exception;
public class NullPointer {
	double l=2.2;
	static Null a;
	public static void main(String[] args) {
		System.out.println("in start of main");
		try
		{	
			Null a=null;
		System.out.println("l value is "+a.l);
		}
		catch (NullPointerException d)
		{
			System.out.println("in catch block");
			System.out.println(d.getMessage());
		}
		System.out.println("in end of main");
		
	}

}
