package exception;

public class NotEligibleToVoteException extends RuntimeException {
	public String getMessage()
	{
		return "Not Eligible to vote";
	}

}
