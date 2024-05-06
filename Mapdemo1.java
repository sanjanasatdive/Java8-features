package com.StreamApi.Map;
/*making the Sttring in uppercase using the map
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapdemo1 {
public static void main(String[] args) {
	List<String> vehicles=Arrays.asList("bus","car","bicycle","flight","train");
	List<String> vehicleListInUpperCase=new ArrayList<String>();
	
//before java8/using foreach loop//without using streams
	
//	for(String name:vehicles) {
//		 vehicleListInUpperCase.add(name.toUpperCase());
//	}
//	System.out.println(vehicleListInUpperCase);
//	
	
//using stream-map
	vehicleListInUpperCase=vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
	System.out.println(vehicleListInUpperCase);
}
}
