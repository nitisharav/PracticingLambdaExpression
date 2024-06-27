package Rough;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("kiwi", "banana","grapes","coconut","blueberry","fig","watermelon");
		
		//List <String> res=list.stream().map(a->a.toUpperCase()).toList();
		// Lambda expression to convert all strings to uppercase
        List<String> res = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		
		res.forEach(System.out::println);
	}

}
