/*
 * LinkedMap orders the elements of the Collection,by their insertion order
 * hence the output is deterministic
 * */

package com.java.collections.custom.map;

import java.util.LinkedHashMap;
import java.util.Map;

import com.java.collections.custom.Employee;

public class JavaLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, Employee> map = new LinkedHashMap<Integer, Employee>();

		map.put(4, new Employee(567, "Shivam"));
		map.put(56, new Employee(3423, "Rahul"));
		map.put(34, new Employee(23, "Harshi"));
		map.put(21, new Employee(56712, "Mom"));
		map.put(12, new Employee(56712, "Mom"));

		map.forEach((x, y) -> System.out.println(y));

	}

}
