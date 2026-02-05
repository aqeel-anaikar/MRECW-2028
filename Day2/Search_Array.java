import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner in = new Scanner(System.in);
	int N = in.nextInt();
	int X = in.nextInt();
	boolean Fool = false;
	int[] arr =new int[N];
	for(int i=0;i<N;i++){
	    arr[i] = in.nextInt();	}
	for(int i =0;i<N;i++)
	{
     if(arr[i]==X){
         Fool = true;break;
     }
	}
	if(Fool){
	    System.out.println("YES");
	}
	else System.out.println("NO");
}
}

