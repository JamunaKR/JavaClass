package abstractdemo;

abstract public class AbstractConc2 {
	public static boolean positive(int n)
	{
		if (n>0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	abstract public void hello();
	public static void main(String[] args) {
		boolean res=positive(1);
		System.out.println("res is "+res);
	}

}//res is true
