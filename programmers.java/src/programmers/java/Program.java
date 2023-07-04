package programmers.java;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		int array[]= {-3,-1,2,2,2,2,2,3,100000};
		//System.out.println(Solution.solution(array));
		for(int i:Solution.solution(array)) {
			System.out.print(i+" ");
		}
	}
	class Solution {
	    public static int[] solution(int[] numbers) {
	        int[] answer=new int[numbers.length];
	        Arrays.fill(answer, -1);
	        int now;
	        for(int i=0;i<numbers.length-1;i++) {
	        	System.out.println(i);
	        	now=numbers[i];
	        	for(int n=i;n<numbers.length;n++) {
	        		if(numbers[n]>now) {
	        			Arrays.fill(answer,i,n,numbers[n]);
	        			i=n-1;
	        			break;
	        		}
	        	}
	        	
	        }
	        return answer;
	    }
	}
	}
