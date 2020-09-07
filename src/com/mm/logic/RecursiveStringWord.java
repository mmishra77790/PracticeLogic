package com.mm.logic;

import java.util.ArrayList;
import java.util.List;

public class RecursiveStringWord {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hello";
		List<String> ls = new ArrayList<String>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		System.out.println(stringTimes(ls, ""));
	}
	
	public static String stringTimes(List<String> ls,String responseString) {
		if(responseString != null && responseString.length() > 0) {
			ls.remove(0);
		}
		return !ls.isEmpty() ? responseString + stringTimes(ls, ls.get(0)) : responseString;
	}

}
