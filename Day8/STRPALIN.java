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
		while(T --> 0){
		    String A = sc.next();
		    String B = sc.next();
		    
		    boolean found = false;
		    
		    for (int i= 0;i<A.length() ;i++){
		        if (B.indexOf(A.charAt(i)) != -1){
		            found= true;
		            break;
		        }
		    } System.out.println(found?"Yes":"No");
		}

	}
}
