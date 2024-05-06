package com.StreamApi.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
	int emp_id;
	String empName;
	int salary;
	
	public Employee(int emp_id,String empName,int salary) {
	this.emp_id=emp_id;
	this.empName=empName;
	this.salary=salary;
	}
}

public class Demo4_map_filter {
public static void main(String[] args) {
//	List<Employee> employeeList=new ArrayList<Employee>();
//	employeeList.add(new Employee(101,"Alex",100000));
//	employeeList.add(new Employee(101,"Alex",100000));
//	employeeList.add(new Employee(101,"Alex",100000));
//	employeeList.add(new Employee(101,"Alex",100000));
	
	List<Employee> employeeList=Arrays.asList(
			new Employee(101,"Alex",10000),
			new Employee(102,"Brian",20000),
			new Employee(103,"charles",30000),
			new Employee(104,"David",40000),
			new Employee(105,"Edward",50000)
			);
	//Combination of filter and map
List<Integer>employeeSalList=employeeList.stream()
	.filter(e->e.salary >20000)//filtering
	.map(e->e.salary)
	.collect(Collectors.toList());
System.out.println(employeeSalList);
	
}


}
