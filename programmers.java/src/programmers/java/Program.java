package programmers.java;

import java.util.StringTokenizer;

public class Program {

	public static void main(String[] args) {
		System.out.println(Solution.solution("-1 1 2 3 4"));
	}
	public static class Solution {
	    public static String solution(String s) {
	    	int min;
	    	int max;
	    	StringTokenizer st = new StringTokenizer(s);
    	//	System.out.println(st.nextToken());
    		min = Integer.parseInt(st.nextToken());
    		int now=Integer.parseInt(st.nextToken());
    		if(min>now) {
    			max=min;
    			min=now;
    		}else
    			max=now;
	    	while(st.hasMoreTokens()) {
	    		now = Integer.parseInt(st.nextToken());
	    		if(now>max)
	    			max=now;
	    		if(now<min)
	    			min=now;

	    	}
	        return min+" "+max;
	    }
	}
}
