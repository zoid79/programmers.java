package programmers.java;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		int[] arr = {1,2,4,3,5}; 
		System.out.println(Solution.solution(arr));
	}
	class Solution {
	    public static int solution(int[] order) {
	    	Stack sub=new Stack();
	        int answer = 0;
	        int start=order[0];
	        int count=2;
	    	for(int i=1;i<start;i++) {
	    		sub.push(i);
	    		count++;
	    	}
    		answer++;
	    	for(int i=1;i<order.length;i++) {
	    		if(sub.size()>0&&sub.peek().equals(order[i])) {
	    			sub.pop();
	    			answer++;
	    			continue;
	    		}
	    		else if(order[i]==count) {
	    			answer++;
	    			count++;
	    			continue;
	    		}else if(order[i]>count) {
	    			while(order[i]!=count) {
	    	    		sub.push(count);
	    	    		count++;
	    	    	}
	    			System.out.println(count);
	    			answer++;
	    			continue;
	    		}
	    		else
	    		break;
	    	}
	        return answer;
	    }
	}
}
