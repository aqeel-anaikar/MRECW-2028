import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            // Your code goes here
            if (n*x>9999 && n*x<100000) 
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
