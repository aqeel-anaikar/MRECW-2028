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
		   int count =0;
		   int n = sc.nextInt();
		   while(n!=0){
		       count+=n%10; n/=10;
		   }System.out.println(count);
		}

	}
}
