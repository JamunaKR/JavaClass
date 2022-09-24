package typecasting;

public class UpcastChild extends UpcastParent {
	public void m2()
	{
		System.out.println("in m2 of child");
	}
	public static void main(String[] args) {
		UpcastParent c=new UpcastChild();
		c.m1();
		UpcastParent c1=(UpcastParent)new UpcastChild();
		UpcastChild d=(UpcastChild)c;
		d.m1();
		d.m2();	
	}
}
