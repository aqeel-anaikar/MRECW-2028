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
        
        while (T-- > 0) {
            int N = sc.nextInt();
            long[] A = new long[N];
            
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextLong();
            }
            
            int l = 0, r = N - 1;
            long operations = 0;
            
            while (l < r) {
                if (A[l] == A[r]) {
                    l++;
                    r--;
                } else if (A[l] < A[r]) {
                    A[r] -= A[l];
                    l++;
                    operations++;
                } else {
                    A[l] -= A[r];
                    r--;
                    operations++;
                }
            }
            
            System.out.println(operations);
        }
	}
}

