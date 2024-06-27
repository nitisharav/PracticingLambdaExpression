package Rough;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Solution5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(1,5,8,2,9,1,7);
		
		//Optional<Integer> result= list.stream().reduce(Integer::sum);
		//result.ifPresentOrElse(System.out::println, ()-> System.out.println("List is empty"));
	     int sum= list.stream().reduce(0,(a,b)->a+b);
	     System.out.println(sum);
		
		/* reduce(0, (a, b) -> a + b) uses the reduce method to sum all elements in the stream.
		 *  The lambda expression 
		 * (a, b) -> a + b specifies how to combine two elements. The initial value is 0.*/
	}

}
