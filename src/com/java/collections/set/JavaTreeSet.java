/*
 * TreeSet sorts the elements of the Collection,
 * hence the output is deterministic
 * */

package com.java.collections.set;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class JavaTreeSet {

	public static void main(String[] args) {

		Integer[] array = { 5, 9, 1, 67, 43, 4, 64 };
		Set<Integer> set = new TreeSet<Integer>(Arrays.asList(array));

		set.forEach(System.out::println);
	}

}
