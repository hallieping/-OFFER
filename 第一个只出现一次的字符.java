import java.util.HashMap;
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] s = str.toCharArray();
        for(char c : s) {
            if(!map.containsKey(c))
                map.put(c,1);
            else {
                map.put(c,2);
            }
        }
        for(int i =0; i<s.length; i++) {
            if(map.get(s[i]) == 1)
                return i;
        }
        
        
        return -1;
    }
}
