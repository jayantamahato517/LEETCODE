import java.util.*;

public class sortArrayByParityII{
    public static int[] findParity(int arr[]){
        int odd = 1;
        for(int even=0; even<arr.length; even+=2){
            if(arr[even] % 2 != 0){
                while(arr[odd] % 2 != 0){
                    odd += 2;
                }
                int temp = arr[even];
                arr[even] = arr[odd];
                arr[odd] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args){
        int arr[] = {4,2,3,4,5,3,2,4};
        findParity(arr);

        System.out.println(Arrays.toString(arr));
    }
}