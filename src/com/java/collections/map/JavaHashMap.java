/*
 * HashMap does not maintain any ordering of elements,
 * hence the output is non-deterministic
 * */

package com.java.collections.map;

import java.util.HashMap;
import java.util.Map;

public class JavaHashMap {

	public static void main(String[] args) {

		Map<Integer,String> map = new HashMap<Integer,String>();
        
		map.put(4, "Rahul");
        map.put(56, "Harshi");
        map.put(34, "Shivam");
        map.put(21, "Orange");
        
        map.forEach((x,y)->System.out.println(y));
		
	}

}
