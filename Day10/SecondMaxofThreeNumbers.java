import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0){
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int c=sc.nextInt();
		    
		    int max=Math.max(a,Math.max(b,c));
		    int min=Math.min(a,Math.min(b,c));
		    System.out.println(a+b+c-(max+min));
		} 

	}
}
