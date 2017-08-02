/*
 * An Arraylist is created using an Array and elements are iterated
 * through using using streams for each loop-Using streams and Lambda expression
 * */

package com.java.collections.custom;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(567, "Shivam"));
		list.add(new Employee(3423, "Rahul"));
		list.add(new Employee(23, "Harshi"));
		list.add(new Employee(56712, "Mom"));

		list.forEach(System.out::println);
	}

}
