package abstractdemo;

public class BasicChild extends AbstractBasic {
	public void add()
	{
		int x=10, y=20;
		System.out.println("add is "+(x+y));
	}
	public static void main(String[] args) {
		BasicChild b=new BasicChild();
		b.add();//30
		b.sub();//-1
	}

}
