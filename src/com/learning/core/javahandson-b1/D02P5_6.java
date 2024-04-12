package com.learning.core.day1session1;

public class D02P5_6 {
//	public class LongestPrefixSuffix {
	    
	    static int longestPrefixSuffix(String s) {
	        int n = s.length();
	        int[] lps = new int[n];
	        int len = 0; // Length of the longest prefix suffix

	        int i = 1;
	        while (i < n) {
	            if (s.charAt(i) == s.charAt(len)) {
	                len++;
	                lps[i] = len;
	                i++;
	            } else {
	                if (len != 0) {
	                    len = lps[len - 1];
	                } else {
	                    lps[i] = 0;
	                    i++;
	                }
	            }
	        }
	        return lps[n - 1];
	    }

	    public static void main(String[] args) {
	        String s = "abab";
	        int length = longestPrefixSuffix(s);
	        System.out.println("Length of the longest prefix that is also a suffix: " + length);
	    }
	}


