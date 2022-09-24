package object;

public class Demo3 {
	public static void main(String[] args) {
		Demo3 d=new Demo3();
		Demo3 d1=new Demo3();
		System.out.println(d.equals(d1));//false
		Demo3 d2=new Demo3();
		Demo3 d3=d2;
		System.out.println(d2.equals(d3));//true
	}

}
