package abstractdemo;

abstract public class Conc1Child extends AbstractConc1{
	public String odd(int num)
	{
		if (num%2!=0) {
			return "Odd Number";
		}
		else 
		{
			return "Even Number";
		}
	}

}
