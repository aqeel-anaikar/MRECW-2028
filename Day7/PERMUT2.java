import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            if (N == 0) break;
            
            int[] p = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                p[i] = sc.nextInt();
            }
            
            boolean ok = true;
            for (int i = 1; i <= N; i++) {
                if (p[p[i]] != i) {
                    ok = false;
                    break;
                }
            }
            
            System.out.println(ok ? "ambiguous" : "not ambiguous");
        }
	}
}
