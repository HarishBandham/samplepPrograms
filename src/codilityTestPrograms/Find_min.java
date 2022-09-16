package codilityTestPrograms;

import java.util.Random;

public class Find_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(4));
	}
	public static int[] solution(int N) {
        int [] result = new int[N];

    Random rand= new Random();

    for(int i=0;i<N;i++)
    {
       result[i]= rand.nextInt(1000)+1;
    }
    return result;
}
}
