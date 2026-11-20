public class sortColor{
    public static void main(String[] args){
        int arr[] = {1,0,0,2,0,1};

        int n = arr.length;
        int left = 0, mid = 0, right = n - 1;

        while(mid <= right){
            if(arr[mid] == 0){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;

                left ++;
                mid ++;
            } else if(arr[mid] == 1){
                mid ++;
            }else {
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;

                right --;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}