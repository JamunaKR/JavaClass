package exception;
public class Null {
	static Null n;
	public void m1()
	{
		System.out.println("in m1");
	}
	public static void main(String[] args) {
		System.out.println("start");
		try
		{
		n.m1();
		Null a=null;
		a.m1();
		}
		catch(NullPointerException b)
		{
			System.out.println("in catch block");
			System.out.println(b.getMessage());
		}
		System.out.println("end");
	}

}
