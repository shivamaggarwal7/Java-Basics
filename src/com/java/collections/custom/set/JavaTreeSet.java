/*
 * TreeSet sorts the elements of the Collection,
 * hence the output is deterministic
 * */

package com.java.collections.custom.set;

import java.util.Set;
import java.util.TreeSet;

import com.java.collections.custom.Employee;

public class JavaTreeSet {

	public static void main(String[] args) {

		Set<Employee> set = new TreeSet<Employee>();

		set.add(new Employee(567, "Shivam"));
		set.add(new Employee(3423, "Rahul"));
		set.add(new Employee(23, "Harshi"));
		set.add(new Employee(56712, "Mom"));
		set.add(new Employee(56712, "Mom"));
		
		set.forEach(System.out::println);
	}

}
