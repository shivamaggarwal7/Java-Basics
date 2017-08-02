/*
 * An Arraylist is created using an Array and elements are iterated
 * through using
 * 1)for loop
 * 2)Using Iterator-Allows removal of elements from List 
 * 3)Using streams for each loop-Using streams and Lambda expression
 * */

package com.java.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {

		Integer[] array = { 5, 9, 1, 67, 43, 4, 64 };
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(array));

/*		for (Integer integer : list) {
			System.out.println(integer);
		}
*/
		/*for (Iterator iterator = list.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}*/
		
		list.forEach(System.out::println);
	}

}
