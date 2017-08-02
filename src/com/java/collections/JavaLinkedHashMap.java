/*
 * LinkedMap orders the elements of the Collection,by their insertion order
 * hence the output is deterministic
 * */

package com.java.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class JavaLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
        
		map.put(4, "Rahul");
        map.put(56, "Harshi");
        map.put(34, "Shivam");
        map.put(21, "Orange");
        
        map.forEach((x,y)->System.out.println(y));
		
	}

}
