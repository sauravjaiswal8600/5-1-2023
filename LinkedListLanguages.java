package com.test;
import java.util.LinkedList;

public class LinkedListLanguages {

	public static void main(String[] args) {
		
		LinkedList<String> languages = new LinkedList<String>();
		languages.add("C");
		languages.add("C++");
		languages.add("Java");
		languages.add("Kotlin");
		languages.add("Python");
		languages.add("Perl");
		languages.add("Ruby");
		
		System.out.println(languages);
		
		System.out.println("Removed elements : "+languages.remove(5));
		System.out.println(languages);
		
		System.out.println(languages.remove("Kotlin"));
		System.out.println(languages);
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Python");
		list.add("Perl");
		list.add("Ruby");
//		languages.removeAll(Arrays.asList("Python","Perl","Ruby"));
		languages.removeAll(list);		
		System.out.println(languages);	
		
		languages.clear();
		System.out.println(languages);
	}

}
