package abstractdemo;

public class Conc1grandChild extends Conc1Child{
	public String even(int num) {
		if (num%2==0)
		{
			return "Even Number";
		}
		else
		{
			return "Odd Number";
		}
	}
	public static void main(String[] args) {
		Conc1grandChild c=new Conc1grandChild();
		String res=c.even(2);
		String res1=c.odd(1);
		System.out.println("res is "+res);
		System.out.println("res1 is "+res1);
	}

}
