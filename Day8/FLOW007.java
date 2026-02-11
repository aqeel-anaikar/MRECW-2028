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
		while (T-->0){
		    int N = sc.nextInt();
		    int rev = 0;
		    while (N!=0){
		        int temp = N%10;
		        rev = rev*10 + temp;
		        N/=10;		        
		    }System.out.println(rev);
		} 

	}
}
