package com.telstra.day6.collection;

import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String, String> hm = new HashMap<>();
		 hm.put("Sachin", " batsman");
		 hm.put("dhoni", " wktkpr");
		 hm.put("bumrah", " batsman");
		 hm.put("dhoni", " caption");
		 System.out.println(hm);
		 
		 System.out.println(hm.get("Sachin"));
		 
		 System.out.println(hm.values());
		 System.out.println(hm.keySet());
		 
		 //iterating
		 for(String key: hm.keySet()) {
			 System.out.println(key);
		 }

	}

}
