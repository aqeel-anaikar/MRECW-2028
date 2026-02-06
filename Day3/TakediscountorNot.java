class Solution {
    public String checkCoupon(int n, int x, int y, int[] prices) {
        // write your code here 
        long  saveings=0;
        for(int i=0;i<n;i++){
            if(prices[i]>=y){
                saveings += y;
            }else{
            saveings += prices[i];
            }
        }
        if(saveings > x){
            return "COUPON";
        }else{
            return "NO COUPON";
        }
    }
}

