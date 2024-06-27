package Rough;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Solution1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> list= new ArrayList<>();
         list.add("Apple");
         list.add("Guava");
         list.add("Grapes");
         list.add("Pineapple");
         list.add("Pomegrenate");
         list.add("Banana");
         
         String prefix="Start";
         String suffix="End";
        String delimiter="-";
         String str= list.stream().collect(Collectors.joining(delimiter, prefix, suffix));
         String str1= list.stream().collect(Collectors.joining(delimiter));
         System.out.println(str1);
         
         
	}

}
