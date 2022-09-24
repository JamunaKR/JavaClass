package typecasting;

public class UpcastChildEx extends UpParentEx {
	int c=45, d=20;
	public void sub()
	{
		System.out.println("subtraction operation in child "+(c-d));
	}
	public static void main(String[] args) {
		UpParentEx i=new UpcastChildEx();
		i.add();
		UpParentEx i1=(UpParentEx) new UpcastChildEx();
		UpcastChildEx j=(UpcastChildEx)i1;
		j.add();
		j.sub();
	}

}
