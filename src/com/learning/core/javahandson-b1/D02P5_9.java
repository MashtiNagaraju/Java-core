package com.learning.core.day1session1;

public class D02P5_9 {
//	public class ReplaceSpaces {

	    static String replaceSpaces(String s) {
	        StringBuilder sb = new StringBuilder();

	        for (char c : s.toCharArray()) {
	            if (c == ' ') {
	                sb.append("%20");
	            } else {
	                sb.append(c);
	            }
	        }

	        return sb.toString();
	    }

	    public static void main(String[] args) {
	        String input = "Hello World!";
	        String replaced = replaceSpaces(input);
	        System.out.println("Original String: " + input);
	        System.out.println("String with spaces replaced: " + replaced);
	    }
	}


