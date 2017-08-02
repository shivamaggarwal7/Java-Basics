/*
 * HashSet does not maintain any ordering of elements,
 * hence the output is non-deterministic
 * */

package com.java.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaHashSet {

	public static void main(String[] args) {

		Integer[] array = { 5, 9, 1, 67, 43, 4, 64 };
		Set<Integer> set = new HashSet<Integer>(Arrays.asList(array));

		set.forEach(System.out::println);
	}

}
