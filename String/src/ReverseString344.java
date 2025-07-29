public class ReverseString344 {
    public static void main(String[] args) {

    }

    public void reverseString(char[] s) {
        int l=0;
        int h=s.length-1;
        while(l<=h)
        {
            char t=s[l];
            s[l]=s[h];
            s[h]=t;
            l++;
            h--;
        }

    }
}
