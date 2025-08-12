import java.util.*;

public class FindWordsContainingCharacter2942 {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ans=new ArrayList<>();
        String str = "" + x;
        for(int i=0;i<words.length;i++){
            if(words[i].contains(str)){
                ans.add(i);
            }
        }
        return ans;
    }
}
