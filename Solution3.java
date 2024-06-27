package Rough;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     List<String> list= Arrays.asList("kiwi", "banana","grapes","coconut","blueberry","fig","watermelon");
	
      //Map<Integer, List<String>> res=list.stream().collect(Collectors.groupingBy(word-> word.length()));
      Map<Integer, List<String>> res =list.stream().collect(Collectors.groupingBy(word-> word.length()));
      Map<Integer, List<String>> res1= list.stream().collect(Collectors.groupingBy(word-> word.length()));
      res.forEach((length, wordlist)->System.out.println("Length: "+length+ " words: "+wordlist));
	}

}
