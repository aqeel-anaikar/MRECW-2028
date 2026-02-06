import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		
		for (int i=0;i<n ;i++ ){
		    for (int j = 0;j<m ;j++ ){
		        arr[i][j] = sc.nextInt();
		    } 
		} 
		int maxone = -1, ansrow = -1;
		
		for (int i = 0;i< n ;i++ ){
		    int firstOne = search(arr[i]);
		    int oneCount = m - firstOne;
		    if(oneCount>maxone){
		        maxone = oneCount;
		        ansrow = i+1;
		    }
		}System.out.println(ansrow);
	}
	static int search(int arr[]){
	    int l=0, r = arr.length-1,mid,pos = arr.length;
	    while(l<r){
	        mid = (l+r)/2;
	        if(arr[mid] == 1){
	            pos = mid;
	            r = mid -1;
	        }else{
	            l = mid+1;
	        }
	    }return pos;
	}
}

