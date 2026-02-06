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
		    Set<Integer> res = new HashSet<Integer>();
		    int N = sc.nextInt();
		    int arr[] = new int[N];
		    for (int i= 0;i<N;i++ ){
		        arr[i] = sc.nextInt();
		    }
		    for(int i: arr){
		        res.add(i);
		    }System.out.println(res.size());
		} 
	}
}

