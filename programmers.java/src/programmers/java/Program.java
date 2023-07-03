package programmers.java;

import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class Program {

	public static void main(String[] args) {
		System.out.println(Solution.solution("        "));
	}
	class Solution {
	    public static String solution(String s) {
	        String answer = s;
	        String answer2="";
	        char[] arrayanswerarray = answer.toCharArray();
	        int first=0;
	        for(int i=0;i<arrayanswerarray.length;i++) {
	    //    	System.out.println();
	        	if(first==0&&arrayanswerarray[i]>='a'&&arrayanswerarray[i]<='z') {
	        		arrayanswerarray[i]=(char) (arrayanswerarray[i]-32);
	        	}else if(first!=0&&arrayanswerarray[i]>='A'&&arrayanswerarray[i]<='Z') {
	        		arrayanswerarray[i]=(char) (arrayanswerarray[i]+32);
	        	}else if(arrayanswerarray[i]==' ')
	        		first=-1;
	        	first++;
	        }
	        for(char c:arrayanswerarray)
	        	answer2=answer2+c;
	        return answer2;
	    }
	}
	}
