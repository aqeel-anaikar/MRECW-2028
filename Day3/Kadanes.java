import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[]= new int[N];
		
		for(int i = 0;i<N;i++){
		    arr[i] = sc.nextInt();
		}               

		long currentSum=arr[0];
		long maxSum = arr[0];
		
		for(int i = 1;i<N;i++){
		    currentSum = Math.max(arr[i],currentSum+arr[i]);
		    maxSum = Math.max(maxSum, currentSum);
		}System.out.println(maxSum);

	}
}
