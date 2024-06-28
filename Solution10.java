package Rough;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("kiwi", "banana","grapes","coconut","blueberry","fig","watermelon");
		List<String> res= list.stream().sorted((p1,p2)-> p2.compareTo(p1)).collect(Collectors.toList());
		
		res.forEach(System.out::println);
		
		
	}

}
