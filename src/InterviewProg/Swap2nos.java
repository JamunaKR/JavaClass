package InterviewProg;

public class Swap2nos {
public static void main(String[] args) {
	int a=10, b=20;
	b=b+a;
	a=b-a;
	(b-a)=((b+a)-a)=b;//now a is swapped(20),+a & -a cancel ---------(1)
	b=b-a;
	(b+a)-b=a; //b is swaped and consider b from (1)replaced as a
	
	
	
}
}
