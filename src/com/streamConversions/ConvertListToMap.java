package com.streamConversions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ConvertListToMap {

	public static void main(String[] args) {

		List<String> cards = Arrays.asList("Visa", "MasterCard", 
				"American Express", "Visa1");
		
		Map<String,Integer> listToMap =cards.stream()
								.collect(Collectors.toMap(Function.identity(),
										String::length,
										(e1, e2) -> e1,
										HashMap::new));
		System.out.println(listToMap);
		
		//
		System.out.println("\n----------user list objects to map------------------\n");
		List<Hosting> list = new ArrayList<>();
        list.add(new Hosting(1, "liquidweb.com", 80000));
        list.add(new Hosting(2, "linode.com", 90000));
        list.add(new Hosting(3, "digitalocean.com", 120000));
        list.add(new Hosting(4, "aws.amazon.com", 200000));
        list.add(new Hosting(5, "mkyong.com", 1));
        
        list.add(new Hosting(6, "linode.com", 100000)); // new line
        Map<String,Integer> hostMap = list.stream()
        						.collect(Collectors.toMap(
        								Hosting::getName, 
        								Hosting::getId,
        								(oldvalue,newvalue)->newvalue)
        								);
        System.out.println(hostMap);
        
        System.out.println("\n----------List to Map – Sort & Collect------------------\n");
        
        Map<String,Integer> hostMapsorted = list.stream()
        		.sorted(Comparator.comparingLong(Hosting::getWebsites).reversed())
				.collect(Collectors.toMap(
						Hosting::getName, 
						Hosting::getId,
						(oldvalue,newvalue)->newvalue)
						);
        System.out.println(hostMapsorted);
	}
	

}
