public class PowerOfFour342 {
    public boolean isPowerOfFour(int n) {
        return helper(n,0);
    }

    static boolean helper(int n,int expo){
        if(n < Math.pow(4,expo)) return false;

        if(n == Math.pow(4,expo)) return  true;

        return helper(n,expo+1);
    }
}
