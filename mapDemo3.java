package com.StreamApi.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapDemo3 {
public static void main(String[] args) {
	List<Integer>numberList=Arrays.asList(2,3,4,5);
	List<Integer>multiplied=new ArrayList<Integer>();
//	//before java8
//	for(int num:numberList) {
//	//System.out.println(num*3);
//		multiplied.add(num*3);
//	}
//	System.out.println(multiplied);
	
//using stream-map
	multiplied=numberList.stream().map(num->num*3).collect(Collectors.toList());
	System.out.println(multiplied);

	//using lambda Expression
	numberList.stream().map(num->num*3).forEach(num->System.out.println(num));
//with using the double colon means without using lambda expression
	numberList.stream().map(num->num*3).forEach(System.out::println);
}
}