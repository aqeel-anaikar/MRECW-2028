import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int temp=n,rev=0;
		    while(temp>0){
		        rev=rev*10+(temp%10);
		        temp/=10;
		    }
		    System.out.println(rev==n?"wins":"loses");
		}
		
		
		

	}
}
