package com.learning.core.day1session1;

public class D02P5_4 {
//	public class MinimumDeletionsForPalindrome {
	    
	    static int minDeletionsToPalindrome(String str) {
	        int n = str.length();
	        int[][] dp = new int[n][n];

	        for (int len = 2; len <= n; len++) {
	            for (int i = 0; i < n - len + 1; i++) {
	                int j = i + len - 1;
	                if (str.charAt(i) == str.charAt(j)) {
	                    dp[i][j] = dp[i + 1][j - 1];
	                } else {
	                    dp[i][j] = 1 + Math.min(dp[i + 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        return dp[0][n - 1];
	    }

	    public static void main(String[] args) {
	        String str = "abdbca";
	        System.out.println("Minimum deletions to make string palindrome: " + minDeletionsToPalindrome(str));
	    }
	}


