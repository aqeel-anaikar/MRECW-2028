import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    int T = sc.nextInt();
	    while(T-->0){
	        int N = sc.nextInt();
	        int rev = 0;
	        while(N!=0){
	            rev += N%10;
	            N/=10;
	            
	        }
	        System.out.println(rev);
	    }
		// your code goes here

	}
}
