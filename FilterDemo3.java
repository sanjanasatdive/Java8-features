package com.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
/*Removing the null values from the list using Stream api filter method*/
public class FilterDemo3 {
public static void main(String[] args) {
	List<String>words=Arrays.asList("cup",null,"forest","sky","book",null,"theatre"); 
	List<String>result=new ArrayList<String>();
	
//	result=words.stream().filter(w->w!=null).collect(Collectors.toList());
//	System.out.println(result);
	
//using forEach method	
//words.stream().filter(w->w!=null).forEach(w->System.out.println(w));
	
//using double colon to replace lambda expression	
words.stream().filter(w->w!=null).forEach(System.out::println);	
	
	
	
}
}
