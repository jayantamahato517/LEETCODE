public class squaringASortedArray {
    public static void findSquaringASortedArray(int arr[]){
        int n = arr.length-1;
        int result[] = new int[n];

        int left = 0, right = n-1;

        for(int i=n-1; i>=0; i--){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                result[i] = arr[left] * arr[left];
                left++;
            }
            else {
                result[i] = arr[right] * arr[right];
                right--;
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        int arr[] = {-4,-1,0,3,10};
        findSquaringASortedArray(arr);
    }
}
