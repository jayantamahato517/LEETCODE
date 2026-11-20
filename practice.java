import java.util.*;

class main{
    public static void main(String[] args){
        int arr[] = {-1,0,1,2,-1,-4};
        int target = 0;
        int n = arr.length;
        Arrays.sort(arr);

        for(int i=0; i<n-2; i++){
            if(i > 0 && arr[i] == arr[i - 1]){
                continue;
            }
            int left = i + 1;
            int right = n - 1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];

                if(sum == target){
                    System.out.println(arr[i] + "," + arr[left] + "," + arr[right]);
                    left ++;
                    right--;

                    while(i > 0 && arr[left] == arr[left - 1]){
                        left++;
                    }
                    while(i > 0 && arr[right] == arr[right + 1]){
                        right --;
                    }
                }else if(sum < target){
                    left ++;
                }else{
                    right --;
                }
            }
        }
    }
}