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
		int M = sc.nextInt();
		int arr [][] = new int[N][M];
		
		for (int i=0;i<N ;i++ ){
		    for (int j = 0;j<M ;j++ ){
		        arr[i][j] = sc.nextInt();
		    } 
		} 
		for (int i=0;i<N ;i++ ){
		    if (i%2 == 0) {
		        for (int j = 0;j<M ;j++ ){
		            System.out.println(arr[i][j]+" ");
		        } 
		    }else {
		        for (int j = M-1;j>=0 ;j-- ){
		            System.out.print(arr[i][j]+ " ");
		        } 
		    }
		} 
		
	}
}

