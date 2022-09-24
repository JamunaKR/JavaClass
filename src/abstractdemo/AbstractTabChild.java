package abstractdemo;
public class AbstractTabChild extends AbstractTable{
	public void multi()
	{
		int a=2;
		for (int i=1;i<=10;i++)
		{
			System.out.println(a+"*"+i+"="+a*i);
		}
	}
	public static void main(String[] args) {
		AbstractTabChild a=new AbstractTabChild();
		a.multi();
	}
}
