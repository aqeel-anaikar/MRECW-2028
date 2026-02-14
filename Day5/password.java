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
		while (T-->0)
		{
		  String s = sc.next();
		  boolean islower = false;
		  boolean isupper = false;
		  boolean isdigit = false;
		  boolean isSpecial = false;
		  //Length
		  if (s.length() <10){ 
		  System.out.println("NO"); 
		  continue;
		  }
		  else
		  {
		      for (int i=0;i<s.length() ;i++ )
		      {
		          
    		      //1. Lower case
    		      if(s.charAt(i)>='a'&&s.charAt(i)<='z')    islower = true;
    		      
    		      //Strictly Inside
    		      
    		      if (i>0 && i<s.length()-1)
    		      {
    		      
        		      //2. Upper case
        		      if(s.charAt(i)>='A'&&s.charAt(i)<='Z')    isupper = true;
        		      
        		      //3. Digit
        		      if(s.charAt(i)>='0'&&s.charAt(i)<='9')    isdigit = true;
        		      
        		      //4. Special char
        		      if (s.charAt(i)=='@' || s.charAt(i)=='#' || s.charAt(i)=='%' || s.charAt(i)=='&' || s.charAt(i)=='?')   isSpecial= true; 
    		      } 
		      }
		  }
		  if (isSpecial && isdigit && isupper && islower){
		      System.out.println("YES");
		  }else System.out.println("NO");
		} 
	}
}

