链接：https://www.nowcoder.com/questionTerminal/6f8c901d091949a5837e24bb82a731f2
来源：牛客网

public class Solution {
    boolean isNumeric(char[] s) {
        if(s.length==0) return false;
        if((s.length==1)&&(s[0]<'0'||s[0]>'9')) return false;
        if(s[0]=='+'||s[0]=='-'){
            if(s.length==2&&(s[1]=='.')) return false;
        }else if((s[0]<'0'||s[0]>'9')&&s[0]!='.') return false;//首位既不是符号也不是数字还不是小数点，当然是false
        int i = 1;
        while((i<s.length)&&(s[i]>='0'&&s[i]<='9')) i++;
        if(i<s.length&&s[i]=='.'){
            i++;
            //if(i>=s.length) return false;
            while((i<s.length)&&(s[i]>='0'&&s[i]<='9')) i++;
        }
        if(i<s.length&&(s[i]=='e'||s[i]=='E')){
            i++;
            if((i<s.length)&&(s[i]=='+'||s[i]=='-')){
                i++;
                if(i<s.length) while((i<s.length)&&(s[i]>='0'&&s[i]<='9')) i++;
                else return false;
            }else if(i<s.length){
                while((i<s.length)&&(s[i]>='0'&&s[i]<='9')) i++;
            }else return false;
        }
        if(i<s.length) return false;            
        return true;        
    }
}

