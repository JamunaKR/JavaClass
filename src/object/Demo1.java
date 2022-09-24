package object;

public class Demo1 {
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		System.out.println(d.toString());//object.Demo1@cac736f
		Demo1 d1=new Demo1();
		System.out.println(d1.toString());//object.Demo1@1175e2db
		Demo1 d2=d1;
		System.out.println(d2.toString());//object.Demo1@1175e2db
	}

}
