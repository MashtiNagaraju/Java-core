package com.learning.core.day1session1;
import java.util.*;
public class D02P5_7 {

//	public class StringPatternMatching {

	    static List<String> findMatchingWords(String pattern, String[] dictionary) {
	        List<String> result = new ArrayList<>();

	        for (String word : dictionary) {
	            if (word.length() == pattern.length()) {
	                if (isMatch(word, pattern)) {
	                    result.add(word);
	                }
	            }
	        }

	        return result;
	    }

	    static boolean isMatch(String word, String pattern) {
	        Map<Character, Character> map = new HashMap<>();

	        for (int i = 0; i < word.length(); i++) {
	            char w = word.charAt(i);
	            char p = pattern.charAt(i);

	            if (map.containsKey(p)) {
	                if (map.get(p) != w) {
	                    return false;
	                }
	            } else {
	                map.put(p, w);
	            }
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the pattern: ");
	        String pattern = scanner.nextLine();

	        System.out.print("Enter the number of words in the dictionary: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume the newline character

	        String[] dictionary = new String[n];
	        System.out.println("Enter the words in the dictionary:");
	        for (int i = 0; i < n; i++) {
	            dictionary[i] = scanner.nextLine();
	        }

	        List<String> matchingWords = findMatchingWords(pattern, dictionary);

	        if (matchingWords.isEmpty()) {
	            System.out.println("No words found matching the pattern.");
	        } else {
	            System.out.println("Words found matching the pattern:");
	            for (String word : matchingWords) {
	                System.out.println(word);
	            }
	        }

	        scanner.close();
	    }
	}


