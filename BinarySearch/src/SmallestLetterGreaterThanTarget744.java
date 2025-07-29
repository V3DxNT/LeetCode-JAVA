public class SmallestLetterGreaterThanTarget744 {
    public static void main(String[] args) {

    }
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;

        if(target>= letters[e])
            return letters[0];

        int m=0;
        while(s<=e){
            m =(s+e)/2;
            if(letters[m] > target) e=m-1;
            else s=m+1;
        }
        return letters[s];
    }
}
