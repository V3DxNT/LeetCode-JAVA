import java.util.*;

public class FirstUniqeCharacterInString387 {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else
            {
                map.put(s.charAt(i),1);
            }
        }
        int index=-1;
        for(int i=0;i<s.length();i++)
        {
            if(map.get(s.charAt(i))==1)
            {
                index=i;
                break;
            }
        }
        return index;
    }
}
