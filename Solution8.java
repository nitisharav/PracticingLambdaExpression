package Rough;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Person> list= Arrays.asList(new Person(10,"Ram"),
				new Person(11,"Bittu"),
				new Person(15,"Justin"),
				new Person(8,"Vijay"),
				new Person(16,"Shital"));
		
		Collections.sort(list, (p1,p2)-> p1.getAge()-p2.getAge());
		System.out.println("Sorted by age: ");
		list.forEach(System.out::println);

	}
}
	class Person {
		int age;
		String name;
		public Person(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Person [age=" + age + ", name=" + name + "]";
		} 
		
	}


