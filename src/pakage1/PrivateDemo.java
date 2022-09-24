package pakage1;

public class PrivateDemo {
	private String s="hello";
	private static int x=1;
	private static void add()
	{
		int a=1, b=2;
		System.out.println("sum is "+(a+b));
	}
	private void prod()
	{
		int a=1, b=2;
		System.out.println("product is "+(a*b));
	}
	public static void main(String[] args) {
		System.out.println("int is "+x);
		add();
		PrivateDemo p=new PrivateDemo();
		System.out.println("string is "+p.s);
		p.prod();
	}

}
