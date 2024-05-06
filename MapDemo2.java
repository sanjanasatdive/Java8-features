package com.StreamApi.Map;
/*Finding the lenght of the string using the map,Stream,and forEach loop
 * */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
public static void main(String[] args) {
	List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
	List<String> vehicleListInUpperCase=new ArrayList<String>();
	
	
	//before java8/without using streams
	
//	for(String name:vehicles) {
//		System.out.println(name.length());
//	}
	
	//using map
//vehicles.stream().map(vname->vname.length()).forEach(len->System.out.println(len));
	
//using double colon operator
	vehicles.stream().map(vname->vname.length()).forEach(System.out::println);
	
	
}
}
