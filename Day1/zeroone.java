public class zeroone {
    public static void main(String[] args) {
        int arr[] = {0,1,0,1,0};
        int c = 0;
        for(int a: arr){
            if (a==0) {
                c++;
            }
        }
        for(int i = 0;i<c;i++){ arr[i]=0; }

        for(int i=c;i<arr.length;i++) { arr[i]=1; }
        
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
