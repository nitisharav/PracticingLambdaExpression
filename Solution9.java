package Rough;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     List<Integer> list= Arrays.asList(1,5,8,2,9,1,7);
	     List<Integer> res=list.stream().filter(a-> a%2==0).collect(Collectors.toList());
	     
	     res.forEach(System.out::println);
	}

}
