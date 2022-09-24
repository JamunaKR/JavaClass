package object;
public class DemoAll {
	public static void main(String[] args) {
		DemoAll d=new DemoAll();
		System.out.println(d.toString());	//object.DemoAll@cac736f
		System.out.println(d.hashCode());	//212628335
		DemoAll d1=new DemoAll();
		System.out.println(d1.toString());	//object.DemoAll@1175e2db
		System.out.println(d1.hashCode());	//292938459
		System.out.println(d.equals(d1));	//false
		DemoAll d2=d1;	// Assign d1 to d2
		System.out.println(d2.toString());	//object.DemoAll@1175e2db
		System.out.println(d2.hashCode());	//292938459
		System.out.println(d1.equals(d2));	//true
	}
}
