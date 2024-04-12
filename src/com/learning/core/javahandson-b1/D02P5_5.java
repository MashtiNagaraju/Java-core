package com.learning.core.day1session1;
import java.util.*;


public class D02P5_5 {



//	public class StringChainingCircle {

	    static boolean canFormCircle(String[] words) {
	        // Create a map to store words based on their starting characters
	        Map<Character, List<String>> map = new HashMap<>();
	        for (String word : words) {
	            char firstChar = word.charAt(0);
	            if (!map.containsKey(firstChar)) {
	                map.put(firstChar, new ArrayList<>());
	            }
	            map.get(firstChar).add(word);
	        }

	        // Perform DFS to check if circle can be formed
	        for (String word : words) {
	            if (dfs(word, word.charAt(word.length() - 1), new HashSet<>(), map)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    static boolean dfs(String currentWord, char startChar, Set<String> visited, Map<Character, List<String>> map) {
	        if (visited.size() == map.size() && currentWord.charAt(currentWord.length() - 1) == startChar) {
	            return true; // All words are visited and last character of current word is same as start character
	        }

	        visited.add(currentWord);
	        char lastChar = currentWord.charAt(currentWord.length() - 1);

	        // Check if there are words that can be chained with the last character of current word
	        if (map.containsKey(lastChar)) {
	            for (String nextWord : map.get(lastChar)) {
	                if (!visited.contains(nextWord)) {
	                    if (dfs(nextWord, startChar, visited, map)) {
	                        return true;
	                    }
	                }
	            }
	        }

	        visited.remove(currentWord);
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the number of strings: ");
	        int n = scanner.nextInt();
	        scanner.nextLine(); // consume the newline character

	        String[] words = new String[n];
	        System.out.println("Enter the strings:");
	        for (int i = 0; i < n; i++) {
	            words[i] = scanner.nextLine();
	        }

	        System.out.println("Can form circle: " + canFormCircle(words));
	        scanner.close();
	    }
	}
