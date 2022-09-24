package pakage2;

public class DataAccessEx {
	public static void main(String[] args) {
		DataHidingEx e= new DataHidingEx();
		String movieName=e.getMovieName();
		System.out.println("Movie Name is "+movieName);
		int seatNo=e.getSeatNo();
		System.out.println("Seat Number is "+seatNo);
		e.setTransactionAmt(999.12);
		double trasactionAmt=e.getTransactionAmt();
		System.out.println("Transaction amount to watch the Movie is "+trasactionAmt);
	}

}
