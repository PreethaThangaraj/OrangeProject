package com.controlStatement;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ForLoopTask {

	public static void main(String[] args) {
		Map<Integer, String> mp = new LinkedHashMap<>();
		mp.put(10, "java");
		mp.put(20, "python");
		mp.put(30, null);
		mp.put(40, "oracle");
		mp.put(null, "sql");
		
		ArrayList<Integer> keyList = new ArrayList<>();
		
		Set<Integer> s = mp.keySet();
		keyList.addAll(s);
		
		
		ArrayList<String> valueList = new ArrayList<>(mp.values());
		
		System.out.println("Convert map into list - Integer:"+keyList);
		System.out.println("Convert map into list - Values:"+valueList);


	}

}
