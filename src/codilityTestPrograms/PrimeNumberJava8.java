package codilityTestPrograms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeNumberJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		IntStream.range(2, 10).forEach(System.out::print);
//		System.out.println("---------------------");
//		IntStream.rangeClosed(2, 10).forEach(System.out::print);
		List<Integer> primes = list.stream()
				.filter(n -> isPrime(n))
				//.peek(System.out::print)
				.collect(Collectors.toList());
		System.out.println(primes);
	}

	static boolean isPrime(int n) {
		return IntStream.range(2, n).noneMatch(i -> n % i == 0);
		
	}

	public  boolean isPrime1(int number) {

		if (number <= 1)
			return false; // 1 is not prime and also not composite

		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
	}

	/*
	 * Output [1, 2, 3, 5, 7]
	 */
	

