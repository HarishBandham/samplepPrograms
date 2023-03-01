package codilityTestPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OptimizationProg {

	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(0,1,0,1,0,0,1,1);
		
		Collections.sort(list);
		
		System.out.println(list);
	}

}
