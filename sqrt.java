public class sqrt {
    public static int findSqrt(int n){
        if( n == 0 ){
            return 0;
        }
        int left = 1, right = n;
        int ans = 0;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(mid <= n/mid){
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int n = 8;

        System.out.println(findSqrt(n));
    }
}
