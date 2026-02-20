import java.util.*;
import java.lang.*;
import java.io.*;

public class KMP
{
    static int[] buildLPS(String pattern){
        int n = pattern.length();
        int lps [] = new int [n];
        int len = 0;
        int i = 1;
        
        while (i<n){
            if(pattern.charAt(i) == pattern.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if (len != 0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        } return lps;
    }
    
    static void search(String text, String pattern){
        int i = 0; // text;
        int j = 0; // patten;
        int lps[] = buildLPS(pattern); // 0 0 1 2 0
        
        while (i< text.length()){
            if(text.charAt(i) == pattern.charAt(j)){
                i++; j++;
            }
            
            // found
            if(j == pattern.length()){
                System.out.println("pattern found at "+(i-j));
                j = lps[j-1];
            }
            // not zero case and zero case for j
            else if (i< text.length() && text.charAt(i) != pattern.charAt(j)){
                if(j != 0 ){
                    j = lps[j-1];
                }else{
                    i++;
                }
            } 
        } 
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		String text= "ababcabcabababd";
		String pattern = "ababd";
		search(text,pattern);
	}
}
