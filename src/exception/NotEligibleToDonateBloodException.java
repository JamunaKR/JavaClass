package exception;

import java.io.IOException;

public class NotEligibleToDonateBloodException extends IOException {
	public String getMessage()
	{
		return "Not Eligible to Donate the Blood";
	}

}
