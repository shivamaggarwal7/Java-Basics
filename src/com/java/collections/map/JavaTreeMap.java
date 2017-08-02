/*
 * TreeMap sorts the elements of the Collection,by their keys
 * hence the output is deterministic
 * */

package com.java.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class JavaTreeMap {

	public static void main(String[] args) {

		Map<Integer,String> map = new TreeMap<Integer,String>();
        
		map.put(4, "Rahul");
        map.put(56, "Harshi");
        map.put(34, "Shivam");
        map.put(21, "Orange");
        
        map.forEach((x,y)->System.out.println(y));
		
	}

}
