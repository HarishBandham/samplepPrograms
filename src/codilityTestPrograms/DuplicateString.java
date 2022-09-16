package codilityTestPrograms;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateString {

	public static void main(String[] args) {

		String strValue  = "this is that is this is that is this add add ";
		
		List<String> streamStrValue= Stream.of(strValue.split(" ")).collect(Collectors.toList());
		
		Map<Long,List<String>> duplicateValues= streamStrValue.stream()
					.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
					.entrySet().stream().collect(Collectors.groupingBy(v->v.getValue(),Collectors.mapping(v->v.getKey(), Collectors.toList())));
		
		Long value =Long.valueOf(2);
		System.out.println(duplicateValues.get(value));
		
		
		
	}

}
