package pakage2;
import pakage1.ImportDemo;

public class ImportAccess {
	public static void main(String[] args) {
		ImportDemo i=new ImportDemo();
		System.out.println("value of x is "+i.x);
		i.m1();
		System.out.println("value of y is "+i.y);
		i.m2();
	}

}
