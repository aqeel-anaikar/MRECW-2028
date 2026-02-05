import java.util.*;
public class Unique {
    public static boolean num_check(int n ){
        int arr[] = new int[10];
        // System.out.println(n);
        while (n!=0) {
            arr[  n%10  ]++;
            n/=10;
        }
        // System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            if (i>1) {return false;}
        }return true;
    }
    public static void main(String[] args) {
        int low = 109;
        int hig = 123;
        int count = 0;
        for (int i = low; i <= hig; i++) {

            if (num_check(i)) {count++;}
        }
        System.out.println(count);
    }
}
