public class PowerOfThree326 {
    public boolean isPowerOfThree(int n) {

        return helper(n,0);
    }

    static boolean helper(int n,int expo){
        if(n < Math.pow(3,expo)) return false;

        if(n == Math.pow(3,expo)) return  true;

        return helper(n,expo+1);
    }
}
