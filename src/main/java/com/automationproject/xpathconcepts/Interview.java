package com.automationproject.xpathconcepts;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Interview {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		  String data=sc.nextLine();
		  
		 char[] ch = data.toCharArray();
		 
		 HashMap<Character, Integer> map=new HashMap<>();
		 
		 for(char c:ch) {
			 if(map.containsKey(c)) {
				 map.put(c, map.get(c)+1);
			 }else {
				 map.put(c, 1);
			 }
		 }
		 
		 for(Map.Entry<Character, Integer> op:map.entrySet()) {
			 System.out.println(op.getKey()+"  "+op.getValue());
		 }
	}

}
