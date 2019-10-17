// 给的字符串无重复字符

import java.util.ArrayList;
public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str.length() == 0 || str == null)
            return res;
        backTrack(res, new StringBuffer(), str);
        return res;
    }
    private void backTrack(ArrayList<String> res, StringBuffer list, String str) {
        if(list.length() == str.length()) {
            res.add(list.toString());
            return;
        }
        
        for(int i=0; i<str.length(); i++) {
            if(list.indexOf(String.valueOf(str.charAt(i))) != -1)
                continue;
            list.append(str.charAt(i));
            backTrack(res,list,str);
            list.delete(list.length()-1,list.length()-1);
        }
    }
}

///含重复字符

public class Solution {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res = new ArrayList<>();
        if(str.length() == 0 || str == null)
            return res;
        char[] s = str.toCharArray();
        Arrays.sort(s);
        backTrack(res, new StringBuffer(), s, new boolean[str.length()]);
        return res;
    }
    private void backTrack(ArrayList<String> res, StringBuffer list, char[] s, boolean[] use) {
        if(list.length() == s.length) {
            res.add(list.toString());
            return;
        }
        
        for(int i=0; i<s.length; i++) {
            if(use[i] || (i!=0 && s[i] == s[i-1] && use[i-1]))
                continue;
            
            use[i] = true;
            list.append(s[i]);
            backTrack(res,list,s,use);
            use[i] = false;
            list.deleteCharAt(list.length()-1);
        }
    }
}
