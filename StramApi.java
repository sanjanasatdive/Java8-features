package com.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StramApi {
public static void main(String[] args) {
//	ArrayList<Integer> list= new ArrayList<Integer>();
//	list.add(10);
//	list.add(45);
//	list.add(39);
//	list.add(89);
	
List<Integer>numberList=Arrays.asList(10,15,20,25,30);
List<Integer>EvenNumber=new ArrayList<Integer>();
//without Streams

//for(int n:numberList) {
//	if(n%2==0) {
//		EvenNumber.add(n);
//	}
//	System.out.print(EvenNumber);
//}

//with Streams using filetr Method
/*
 * filter method takes argument as predicate it means it
 *  takes argument and it returns booleans value
 * */
EvenNumber=numberList.stream().filter(n->n%2==0).collect(Collectors.toList());
System.out.println(EvenNumber);


//Using forEach method uses consumer and storing in any other collection just print
//the values after applying the filter method
numberList.stream().filter(n->n%2==0).forEach(n->System.out.println(n));

//using the double coloun which  the is another way of replacing lambda expression
numberList.stream().filter(n->n%2==0).forEach(System.out::println);

}
}
