import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            if(a + b>=70 && a + c>=70 && c+b>=70)
            System.out.println("pass");
            else
            System.out.println("Fail");
        }
    }
}
