package com.learning.core.day1session1;
import java.util.ArrayList;
import java.util.List;
public class D01P3_9 {
	

//	public class CombinationFinder {
	    public static List<List<Integer>> findCombinations(int[] arr, int k) {
	        List<List<Integer>> result = new ArrayList<>();
	        backtrack(arr, k, 0, new ArrayList<>(), result);
	        return result;
	    }

	    private static void backtrack(int[] arr, int k, int start, List<Integer> current, List<List<Integer>> result) {
	        if (k == 0) {
	            result.add(new ArrayList<>(current));
	            return;
	        }

	        for (int i = start; i < arr.length; i++) {
	            current.add(arr[i]);
	            backtrack(arr, k - 1, i + 1, current, result);
	            current.remove(current.size() - 1);
	        }
	    }

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4};
	        int k = 2;
	        List<List<Integer>> combinations = findCombinations(arr, k);
	        System.out.println("Distinct combinations of size " + k + ":");
	        for (List<Integer> combination : combinations) {
	            System.out.println(combination);
	        }
	    }
	}



