package codilityTestPrograms;

import java.util.Collections;
import java.util.Comparator;

public class AlphabeticallySmallest {
	    public static void main(String[] args) {
	 
	        String s = "codility";
	        System.out.println(smallest(s));
	        System.out.println(smallest1(s));
	    }
	    
	    private static char[] smallest1(String s) {
	    	
	    	char ch = s.chars().mapToObj(x->(char)x).max(Comparator.naturalOrder()).get();
	    	String str = s.replaceFirst(String.valueOf(ch),"");
	    	System.out.println(ch);
	    	System.out.println(str);
			return null;
		}

		static String smallest(String s) {
	        int l = s.length();
	        String ans = "";
	 
	        // iterate the String abcda
	        for (int i = 0; i < l-1; i++) {
	 
	            // first point where s[i]>s[i+1]
	            if (s.charAt(i) > s.charAt(i + 1)) {
	 
	                // append the String without
	                // i-th character in it
	                for (int j = 0; j < l; j++) {
	                    if (i != j) {
	                        ans += s.charAt(j);
	                    }
	                }
	                return ans;
	            }
	        }
	        // leave the last character
	        ans = s.substring(0, l - 1);
	        return ans;
	    }
}
