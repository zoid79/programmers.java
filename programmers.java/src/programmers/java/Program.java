package programmers.java;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		int array[]= {1,2,3,3,5,7,8,4,2,3,5,4,6,4,5};
		//System.out.println(Solution.solution(array));
		for(int i:Solution.solution(array)) {
			System.out.print(i+" ");
		}
	}
	public class Solution {
	    public static int[] solution(int[] numbers) {
	        int[] result = new int[numbers.length];
	        Stack<Integer> stack = new Stack<>();

	        for (int i = numbers.length - 1; i >= 0; i--) {
	            while (!stack.isEmpty() && stack.peek() <= numbers[i]) {
	                stack.pop();
	            }
	            if (stack.isEmpty()) {
	                result[i] = -1;
	            } else {
	                result[i] = stack.peek();
	            }
	            stack.push(numbers[i]);
	        }
	        return result;
	    }
	}
	}
