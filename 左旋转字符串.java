//左移n位
//1 空间多时间少
public class Solution {
    public String LeftRotateString(String str,int n) {
        StringBuffer str_ROL = new StringBuffer();
        if(n > str.length()) return str_ROL.toString();
        if(n == 0) return str;
        char[] tmp = new char[str.length()+str.length()];
        for(int i=0; i<tmp.length; i++) {
            tmp[i] = str.charAt(i%str.length());
        }
       
        for(int i=(n%str.length()); i<(n%str.length())+str.length();i++){
            str_ROL.append(tmp[i]);
        }
        return str_ROL.toString();
    }
}

//2 时间多空间少
public class Solution {
    public String LeftRotateString(String str,int n) {
        StringBuffer str_ROL = new StringBuffer();
        if(n > str.length()) return str_ROL.toString();
        if(n == 0) return str;
        char[] tmp = str.toCharArray();
        reverse(tmp,0,n-1);
        reverse(tmp,n,tmp.length-1);
        reverse(tmp,0,tmp.length-1);
        for(int i=0; i<str.length(); i++) {
            str_ROL.append(tmp[i]);
        }
        return str_ROL.toString();
    }
    public void reverse(char[] s, int x, int y) {
        while(x < y) {
            char temp = s[x];
            s[x] = s[y];
            s[y] = temp;
            x++;
            y--;
        }
    }
}
