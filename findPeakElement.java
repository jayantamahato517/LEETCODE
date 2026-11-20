import java.util.Arrays;

public class findPeakElement {
    public static int findPeakElement(int arr[]){
        int left = 0, right = arr.length-1;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] < arr[mid + 1]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,5,2};

        int index = findPeakElement(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("Peak element is: " + arr[index]);
        System.out.println("Index of the peak element is: " + index);
    }
}
