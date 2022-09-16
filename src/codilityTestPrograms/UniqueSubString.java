package codilityTestPrograms;

public class UniqueSubString {

	static boolean isPossiblePalindrome(char[] str)
	{
		//char[] str = s.toCharArray();
	int n = str.length;
	for (int i = 0; i < n / 2; i++)
	{
	    /* If both left and right character
	        are not dot and they are not
	        equal also, then it is not
	        possible to make this string a
	        palindrome */
	    if (str[i] != '.' &&
	        str[n - i - 1] != '.' &&
	        str[i] != str[n - i - 1])
	        return false;
	}
	 
	return true;
	}
	 
	// Returns lexicographically smallest
	// palindrome string, if possible
	static String smallestPalindrome(char str[])
	{
	if (!isPossiblePalindrome(str))
	    return "No";
	 
	int n = str.length;
	 
	// loop through character of string
	for (int i = 0; i < n; i++)
	{
	    if (str[i] == '.')
	    {
	        // if one of character is dot,
	        // replace dot with other character
	        if (str[n - i - 1] != '.')
	            str[i] = str[n - i - 1];
	 
	        // if both character are dot,
	        // then replace them with
	        // smallest character 'a'
	        else
	            str[i] = str[n - i - 1] = 'a';
	    }
	}
	 
	return String.valueOf(str);
	// return the result
	}
	// Driver code
	public static void main(String[] args)
	{
	    String str = "ab..e.c.a";
	    char[] s = str.toCharArray();
	    smallestPalindrome(s);
	}
	}

