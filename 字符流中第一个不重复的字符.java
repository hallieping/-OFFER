import java.util.HashMap;
import java.util.ArrayList;
public class Solution {
    //Insert one char from stringstream
    HashMap<Character,Integer> hp = new HashMap<>();
    ArrayList<Character> list = new ArrayList<>();
    public void Insert(char ch)
    {
        if(hp.containsKey(ch)) {
            hp.put(ch,hp.get(ch)+1);
        }
        else {
            hp.put(ch,1);
        }
        list.add(ch);
    }
  //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(char c:list) {
            if(hp.get(c) == 1)
                return c;
        }
        return '#';
    }
}
