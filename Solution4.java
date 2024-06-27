package Rough;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> list= Arrays.asList(1,5,8,2,9,1,7);
     // Optional<Integer> result= list.stream().max(Integer::compare);
      
      //result.ifPresentOrElse(System.out::println,()-> System.out.println("List is empty"));
      
      Optional<Integer> result=list.stream().max(Integer::compare);
      result.ifPresentOrElse(System.out::println, ()->System.out.println("List is emmpty"));
	}

}
