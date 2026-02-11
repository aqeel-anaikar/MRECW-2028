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
		 int [] arr = new int[N];
		 int K = sc.nextInt();
		 for (int i=0;i<N;i++ ){
		     arr[i] = sc.nextInt();
		 } int count =0;
		for (int i=0;i<arr.length ;i++ ){
		    if((arr[i]+K) %7 == 0){
		        count++;
		    }
		} System.out.println(count);

		 } 
	}
}
