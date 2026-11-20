public class powerOfFour {
    public static boolean findPowerOfFour(int n){
        if(n <= 0){
            return false;
        }
        while(n % 4 == 0){
            n = n / 4;
        }
        return n == 1;
    }
    public static void main(String[] args) {
        int n = 16;

        System.out.println(findPowerOfFour(n));
    }
}
