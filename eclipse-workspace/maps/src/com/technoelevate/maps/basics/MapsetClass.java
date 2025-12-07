package com.technoelevate.maps.basics;

import java.util.HashMap;

class MapsetClass {
     public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(318, "avinash");
		map.put(309, "sandesh");
		map.put(317, "vishnu");
		map.put(329, "vijay");
		map.put(313, "sidharood");
		map.put(313, "ganesh");
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.equals(map));
		System.out.println(map.entrySet());
		//for(Object o:map) {
		//	System.out.println(o);
		System.out.println(map.getOrDefault(10, "hello"));
		//System.out.println(((Object) map).getvalue());
		
		//8Set<Map.entry<Integer,String>> entries = map.entryset();
	
	
		}	
		
	}
	

