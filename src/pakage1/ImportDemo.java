package pakage1;

public class ImportDemo {
	public int x=1;
	public static int y=2;
	public static void m1()
	{
		System.out.println("in m1 of pakage1");
	}
	public void m2()
	{
		System.out.println("in m2 of pakage1");
	}
	public static void main(String[] args) {
		ImportDemo i=new ImportDemo();
		System.out.println(i.x);
		i.m2();
		System.out.println(y);
		m1();
	}
}
