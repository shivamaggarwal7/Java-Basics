/*
 * LinkedHashSet maintains the ordering of elements as per insertion order,
 * hence the output is deterministic
 * */

package com.java.collections.custom.set;

import java.util.LinkedHashSet;
import java.util.Set;

import com.java.collections.custom.Employee;

public class JavaLinkedHashSet {

	public static void main(String[] args) {

		Set<Employee> set = new LinkedHashSet<Employee>();

		set.add(new Employee(567, "Shivam"));
		set.add(new Employee(3423, "Rahul"));
		set.add(new Employee(23, "Harshi"));
		set.add(new Employee(56712, "Mom"));
		set.add(new Employee(56712, "Mom"));

		set.forEach(System.out::println);
	}

}
