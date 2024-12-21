package codilityTestPrograms;

import java.util.stream.IntStream;

public class ReverseStrNotSpecialChar {

	public static void main(String[] args) {
         String input = "Swa$pn&il";
         String[] arr = input.split("");
         String regex = "[^0-9a-zA-Z]";
     
         StringBuilder reversed=new StringBuilder(input.replaceAll(regex, "")).reverse();
         System.out.println("reversed : "+reversed); 
         IntStream.range(0, input.length()-1)
         .filter(i->arr[i].matches(regex))
         .forEach(i->reversed.insert(i, arr[i]));
         
         System.out.println(reversed);
 }

}
