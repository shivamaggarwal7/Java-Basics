/*
 * LinkedHashSet maintains the ordering of elements as per insertion order,
 * hence the output is deterministic
 * */

package com.java.collections;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaLinkedHashSet {

	public static void main(String[] args) {

		Integer[] array = { 5, 9, 1, 67, 43, 4, 64 };
		Set<Integer> set = new LinkedHashSet<Integer>(Arrays.asList(array));

		set.forEach(System.out::println);
	}

}
