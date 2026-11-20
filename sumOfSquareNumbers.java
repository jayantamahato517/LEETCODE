public class sumOfSquareNumbers {
    public static void  findSumOfSquareNumbers(int target){
        long left = 0, right = (long) Math.sqrt(target);

        while(left <= right){
            long sum = left * left + right * right;

            if(sum == target){
                System.out.println(left + " and " + right);
                return;

            } else if(sum < target){
                left++;

            } else {
                right --;
            }
        }
        System.out.println("No such elements found");
    }
    public static void main(String[] args) {
        int target = 50;

        findSumOfSquareNumbers(target);
    }
}
