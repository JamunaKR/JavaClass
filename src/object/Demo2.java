package object;

public class Demo2 {
	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.hashCode());//212628335
		Demo2 d1=new Demo2();
		System.out.println("hashcode of d1 is "+d1.hashCode());//hashcode of d1 is 292938459
		Demo2 d2=d1;
		System.out.println("hashcode of d2 is "+d2.hashCode());//hashcode of d2 is 292938459
	}

}
