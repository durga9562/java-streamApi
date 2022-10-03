package streamapi;

import java.util.*;
import java.util.stream.*;

public class Main {

	 static List<Person> people =new ArrayList<>();
	 static {
		 people.add(
				  new Person("Antonio", 20, Gender.MALE)
				 );
		 people.add(
				 new Person("Alina Smith", 33, Gender.FEMALE)
				 );
		 
		 people.add(
				 new Person("Helen White", 57, Gender.FEMALE)
				 );
		 people.add(
				 new Person("Alex Boz", 14, Gender.MALE)
				 );
		 people.add(
				 new Person("Jamie Goa", 99, Gender.MALE)
				 );
		 people.add(
				 new Person("Anna Cook", 7, Gender.FEMALE)
				 );
		 people.add(
				 new Person("Zelda Brown", 120, Gender.FEMALE)
				 );
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		
//		//Print Feamles only
//		List<Person> females = new ArrayList<>();
//		for(Person person:people){
//			if(person.getGender().equals(Gender.FEMALE)){
//				females.add(person);
//			}
//		}
//		females.forEach(System.out::println);
		
		//====================================================
		
//		//Print only females (Best way)
//		List<Person> females = people.stream()
//				.filter(person -> person.getGender().equals(Gender.FEMALE))
//				.collect(Collectors.toList());
//		females.forEach(System.out::println);
		
		//===================================================================

		
//		//Sort
//		//Print Age vice Desending Order
//		List<Person> sorted = people.stream()
//				.sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
//				.collect(Collectors.toList());
//		sorted.forEach(System.out::println);
		
		//========================================
		
		
//		//All Match
//		//Print whoose person age=8 (if is there o/p will see else it willbe shown false)
//		boolean allMatch = people.stream()
//				.allMatch(person -> person.getAge() > 8);
//		System.out.println(allMatch);
		
		//============================================
		
		
//		//Any Match
//		//Print whoose person above age=121 (if is there o/p will see else it willbe shown false)
//		boolean anyMatch = people.stream()
//				.anyMatch(person -> person.getAge() > 121);
//		System.out.println(anyMatch);
		
		//===========================================
		
		
//		//None match
//		boolean noneMatch = people.stream()
//				.noneMatch(person -> person.getName().equals("Antonio"));
//		System.out.println(noneMatch);
		
		//=======================================
		
		
//		//Max
//		//Maximum age person print
//		people.stream()
//		.max(Comparator.comparing(Person::getAge))
//		.ifPresent(System.out::println);
		
		//===============================
		
//		//Min
//		//Minimum age person print
//		people.stream()
//		.min(Comparator.comparing(Person::getAge))
//		.ifPresent(System.out::println);
		
		//============================
		
		
//		//Group
//		//Male and Female Separatly printed
//		Map<Gender , List<Person>> groupByGender = people.stream()
//				.collect(Collectors.groupingBy(Person::getGender));
//		
//		groupByGender.forEach((gender , people1) -> {
//			System.out.println(gender);
//			people1.forEach(System.out::println);
//			System.out.println();
//		});
//		
		
		//==================================
		
		
		//filter
		//Print Oldest Person Based on Age
		Optional<String> oldestFemaleAge = people.stream()
				.filter(person -> person.getGender().equals(Gender.MALE))
				.max(Comparator.comparing(Person::getAge))
				.map(Person::getName);
		
		oldestFemaleAge.ifPresent(System.out::println);
		
	}

}
