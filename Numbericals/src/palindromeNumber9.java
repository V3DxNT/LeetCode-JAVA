public class palindromeNumber9 {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(int x) {
        int check=x;
        int rev=0;
        int digit=0;
        while (x>0)
        {
            digit=x%10;
            x=(int)x/10;
            rev=rev*10+digit;
        }
        if(rev==check)
        {
            return true;
        }else{
            return false;
        }

    }
}
