

public class Main {
 
	public static void main(final String[] args) {
		PalindromeChecker sim = new PalindromeChecker();
        	sim.tester();
		palindrome("bruh");
	}
	public String reverse(String sWord)
	{
  	String reverseString = "";
  	for(int i = sWord.length(); i > 0; i--)
 	 reverseString += sWord.substring(i - 1, i);  
 	 return reverseString;
	}
	
	public boolean pallindrome(String sWord)
	{
  	if(reverse(sWord).equals(sWord))
   	 return true;
   	 return false;
	}
}

