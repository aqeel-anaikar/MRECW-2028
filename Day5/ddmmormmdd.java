import java.util.Scanner;

public class ddmmormmdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            String s = scanner.next();

            // Your code goes here
            int A = Integer.parseInt(s.substring(0,2));
            int B = Integer.parseInt(s.substring(3,5));
            
            boolean isDDMM = (A>=1 && A<=31) && (B>=1 && B<=12);
            boolean isMMDD = (A>=1 && A<=12) && (B>=1 && B<=31);
            
            if (isDDMM && isMMDD){
                System.out.println("BOTH");
            }else if(isDDMM) 
                System.out.println("DD/MM/YYYY");
            else
                System.out.println("MM/DD/YYYY");
        }
    }
}

