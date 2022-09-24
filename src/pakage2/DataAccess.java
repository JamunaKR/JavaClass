package pakage2;

public class DataAccess {
	public static void main(String[] args) {
		DataHiding d=new DataHiding();
		String uname=d.getUname();//Storing the return type in String datatype
		System.out.println("username is "+uname);
		int pin=d.getPin();//Storing the return type in int datatype
		System.out.println("pin is "+pin);
		d.setSalary(20000.5);//taken setter method from DataHiding 
		double salary=d.getSalary();
		System.out.println("salary is "+salary);
	}

}
