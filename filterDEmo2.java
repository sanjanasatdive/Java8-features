package com.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class filterDEmo2 {
public static void main(String[] args) {
	List<String>names=Arrays.asList("Manisha","sanjana","john","diksha","Joseph","asdfghjklo");
	List<String>Longnames=new ArrayList<String>();

/*using filter method
 * */
//Longnames =names.stream().filter(str->str.length()>6 && str.length()<8).collect(Collectors.toList());
//	System.out.println(Longnames);
	
//Using forEach Method 	
//names.stream().filter(str->str.length()>6&&str.length()<8).forEach(str->System.out.println(str));

	
//using double colon
	
names.stream().filter(str->str.length()>6&&str.length()<8).forEach(System.out::println);


}
}
