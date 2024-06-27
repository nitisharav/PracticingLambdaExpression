package Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Solution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list= Arrays.asList("apple","banana","grape","lichi","berry");
     String predicate="b";
     
     Optional<String> result= list.stream().filter(s->s.startsWith(predicate)).findFirst();
     Optional<String> res=list.stream().filter(s-> s.startsWith(predicate)).findAny();
     
     result.ifPresentOrElse(
    		 System.out::println, 
    		 () -> System.out.println("Nothing found"));
	}

}
