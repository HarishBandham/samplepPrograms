package codilityTestPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Vertices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = {1,2,3,3};
		int[] B = {2,3,1,4};
		
		System.out.println(maxNetworkRank(A,B,4));
	}
	public static int maxNetworkRank(int[] start, int[] end, int N) {
		List<Integer> starts = Arrays.stream(start).boxed().collect(Collectors.toList());
		List<Integer> ends = Arrays.stream(end).boxed().collect(Collectors.toList());
		int[] edgeCount = new int[N];
        int m = starts.size();
        int maxRank = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            edgeCount[starts.get(i) - 1]++;
            edgeCount[ends.get(i) - 1]++;
        }

        for (int i = 0; i < m; i++) {
            int rank = edgeCount[starts.get(i) - 1] + edgeCount[ends.get(i) - 1] - 1;
            if (rank > maxRank) {
                maxRank = rank;
            }
        }

        return maxRank;
    }
}
