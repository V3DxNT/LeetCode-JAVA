public class FirstUniqueCharacterInString387 {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i) - 'a']++;
        }
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(freq[s.charAt(i) - 'a']==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
