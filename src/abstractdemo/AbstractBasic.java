package abstractdemo;

abstract public class AbstractBasic {
	abstract public void add();//abstract method
	public void sub()//concrete method
	{
		int a=1, b=2;
		System.out.println("sub is "+(a-b));
	}
	public static void main(String[] args) {
		//AbstractBasic a=new AbstractBasic();//cte
	}
}
