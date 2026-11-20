
import java.util.Arrays;

public class find3sumSmaller{
    public static void main(String[] args){
        int arr[] = {-2,0,1,3};
        int target = 2;
        int n = arr.length;
        int count = 0;
        Arrays.sort(arr);

        for(int i=0; i<n-2; i++){
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum < target){
                    for(int k=right; k>left; k--){
                        System.out.println(arr[i] + "," + arr[left] + "," + arr[k]);
                        count++;
                    }
                    left++;
                }else{
                    right--;
                }
            }
        }
        System.out.print("Count: " + count);
    }
}