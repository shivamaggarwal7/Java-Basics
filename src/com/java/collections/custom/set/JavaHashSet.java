/*
 * HashSet does not maintain any ordering of elements,
 * hence the output is non-deterministic
 * */

package com.java.collections.custom.set;

import java.util.HashSet;
import java.util.Set;

import com.java.collections.custom.Employee;

public class JavaHashSet {

	public static void main(String[] args) {

		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(567, "Shivam"));
		set.add(new Employee(3423, "Rahul"));
		set.add(new Employee(23, "Harshi"));
		set.add(new Employee(56712, "Mom"));
		set.add(new Employee(56712, "Mom"));

		set.forEach(System.out::println);
	}

}
