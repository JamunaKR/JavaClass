package exception;
public class ArrayIndex {
	public static void main(String[] args) {
		String arr[]=new String[3];
		arr[0]="Core Java";
		arr[1]="Manual";
		arr[2]="Sql";	
		System.out.println("length of array is "+arr.length);
		try
		{
			arr[3]="Selenium";
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("element at index "+i+" is "+arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException n)
		{
			System.out.println("entering catch block");
			System.out.println(n.getMessage());
		}
	}

}
