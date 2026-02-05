public class Primepair {
    public static boolean isPrime(int n){
        for (int i = 2; i*i <= n ;i++) {
            if (n%i == 0 ) return false;
        }return true;
    }
    public static void main(String[] args) {
        int low = 4, hig = 30, count = 0;
        for (int i = low; i < hig-6; i++) {
            if (isPrime(i) && isPrime(i+6)) {
                count++;
            }       
        }System.out.println(count);
    }
}
