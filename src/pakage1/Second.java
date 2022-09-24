package pakage1;

public class Second {
	public static void main(String[] args) {
		System.out.println("y is "+ImportDemo.y);
		ImportDemo.m1();
		ImportDemo d=new ImportDemo();
		System.out.println("x is "+d.x);
		d.m2();
	}

}
