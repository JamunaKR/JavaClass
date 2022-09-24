package pakage2;
public class DataHidingEx {
private String movieName="DISPICABLE ME";
private String movieChar="Minion";
private int seatNo=111;
private double transactionAmt;
public String getMovieName()//getters
{
	return movieName;
}
public int getSeatNo()//getters
{
	return seatNo;
}
public void setTransactionAmt(double amount)
{
	transactionAmt=amount;
}
public double getTransactionAmt()//getter
{
	return transactionAmt;
}
}
