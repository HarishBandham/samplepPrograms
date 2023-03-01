package codilityTestPrograms;

public class ConsecutiveCharSwap {

	public static void main(String[] args) {

		String str = "baaaaa";
		
		System.out.println(solution(str));
	}

	private static int solution(String str) {
		if(str==null || str.isEmpty()){
			return 0;
		}
		if(str.length() < 3)
		return 0;
			
		String a = "aaa";
		String b= "bbb";
		int l=0;
		StringBuilder input1 = new StringBuilder(str);
		input1.reverse();
		System.out.println(input1);
		
		return 0;
	}

	
}
