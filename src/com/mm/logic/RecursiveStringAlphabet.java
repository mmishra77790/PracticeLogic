package com.mm.logic;

public class RecursiveStringAlphabet {
	public static void main(String[] args) throws InterruptedException {
		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = "HELLO";
		System.out.println(stringTimes(s1, s2, s3, "", s1.length(), 0));
	}
	
	public static String stringTimes(String s1, String s2, String s3, String finalString, int strLen, int count) throws InterruptedException {
		if(finalString.length() > 0) 
			count++;
		return count == strLen ?  finalString : finalString + stringTimes(s1, s2, s3, String.valueOf(s1.charAt(count)) + String.valueOf(s2.charAt(count))+ String.valueOf(s3.charAt(count)),strLen, count);
	}

}
