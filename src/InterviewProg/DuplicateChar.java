package InterviewProg;

public class DuplicateChar {
	public static void main(String[] args) {
		String s="Great responsibility";
		int count;
		
		//given string into character array
		char string[]=s.toCharArray();
		System.out.println("Duplicate charcters in agiven string: ");
		//Counts each character present in the string
		for (int i=0;i<string.length;i++)
		{
			count=1;
			for (int j=i+1;j<string.length;j++)
			{
				if (string[i]==string[j] && (i!=j) ){
					count++;
				//set string[j] to 0 to avoid printing visited character
					string[j]='O';
				}
			}
		//A charcter is considered as duplicate if count is greater than 1
			if(count>1 && string[i]!='O')
			{
				System.out.println(string[i]);
			}
		}
	}

}
