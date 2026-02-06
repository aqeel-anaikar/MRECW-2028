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
		while (T --> 0){
		    int maxfreq = 0;
		    int N = sc.nextInt();
		    int freq []= new int[N+1];
		    for (int i=0;i<N ;i++ ){
		        int x = sc.nextInt();
		        freq[x]++;
		        if(maxfreq<freq[x]){
		            maxfreq = freq[x];
		        }
		    } System.out.println(N-maxfreq);
		} 
	}
}

