package Rough;

import java.util.Arrays;
import java.util.List;

public class Solution7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list= Arrays.asList("kiwi", "banana","grapes","coconut","blueberry","fig","watermelon");
		
     list.forEach(a->System.out.println(a));
     list.forEach(System.out::println);
	}

}
