public class LengthOfLastWord58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("hellow world  "));
    }


    public static int lengthOfLastWord(String s) {
        int count=0;
        boolean visited=false;
        for(int i=s.length()-1;i>=0;i--)
        {

            if(s.charAt(i) ==' '){
                if(visited) break;
                else continue;
            }

            else if(s.charAt(i) !=' '){
                count++;
                visited=true;
            }
        }
        return count;
    }
}
