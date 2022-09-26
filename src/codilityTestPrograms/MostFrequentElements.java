package codilityTestPrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentElements {

	public static void main(String[] args) {

		String[] list= {"iiiiii", "love", "leetcode", "iiiiii", "love", "coding"};
		//String[] list= {"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
		//int k = 4;
		int k =2;
		System.out.println(findMostFrequentElements(list,k));
	}

	private static List<String> findMostFrequentElements(String[] list, int k) {
		
		Map<String,Long> result = Arrays.asList(list).stream()
				.collect(Collectors.groupingBy(
						Function.identity(),
						Collectors.counting()
						));
		System.out.println(result);
		
		Comparator<Map.Entry<String, Long>> compare = 
				(a,b)->{
					if(a.getValue() == b.getValue()) 
						return (int) a.getKey().compareTo(a.getKey());
						else
							return (int)(a.getValue()-b.getValue());
				};
		return result.entrySet().stream()
				.sorted(compare.reversed())
				.map(Map.Entry::getKey)
				.limit(k).collect(Collectors.toCollection(LinkedList::new));
	}
	
}
