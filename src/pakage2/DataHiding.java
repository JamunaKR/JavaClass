package pakage2;

public class DataHiding {
	private String username="abcd";
	private String password="abcd123";
	private int pin=123;
	private double salary;
	public String getUname()//getters
	{
		return username;
	}
	public int getPin()//getter
	{
		return pin;
	}
	public void setSalary(double sal)//setter
	{
		salary=sal;
	}
	public double getSalary()//getter
	{
		return salary;
	}
	}

