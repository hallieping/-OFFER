//链接：https://www.nowcoder.com/questionTerminal/45327ae22b7b413ea21df13ee7d6429c
//来源：牛客网



//当模式中的第二个字符不是“*”时：
//1、如果字符串第一个字符和模式中的第一个字符相匹配，那么字符串和模式都后移一个字符，然后匹配剩余的。
//2、如果 字符串第一个字符和模式中的第一个字符相不匹配，直接返回false。

//而当模式中的第二个字符是“*”时：
//如果字符串第一个字符跟模式第一个字符不匹配，则模式后移2个字符，继续匹配。如果字符串第一个字符跟模式第一个字符匹配，可以有3种匹配方式：
//1、模式后移2字符，相当于x*被忽略；
//2、字符串后移1字符，模式后移2字符；
//3、字符串后移1字符，模式不变，即继续匹配字符下一位，因为*可以匹配多位；

public class Solution {
    public boolean match(char[] str, char[] pattern)
    {
        if(str.length == 0 && pattern.length == 0)
            return true;
        if(str.length >0 && pattern.length == 0)
            return false;
        int sIndex = 0;
        int pIndex = 0;
        return fMatch(str,sIndex,pattern,pIndex);
        
    }
    public boolean fMatch(char[] s, int sIndex, char[] p, int pIndex) {
        if (sIndex == s.length && pIndex == p.length) {
            return true;
        }
        else if (sIndex < s.length && pIndex == p.length) {
            return false;
        }
        else {
            if(pIndex+1 < p.length && p[pIndex+1] == '*') {
                if ((sIndex != s.length && p[pIndex] == s[sIndex]) || (p[pIndex] == '.' && sIndex != s.length)) {
                        return fMatch(s, sIndex, p, pIndex + 2)//模式后移2，视为x*匹配0个字符
                        || fMatch(s, sIndex + 1, p, pIndex + 2)//视为模式匹配1个字符
                        || fMatch(s, sIndex + 1, p, pIndex);//*匹配1个，再匹配str中的下一个
                } else {
                return fMatch(s, sIndex, p, pIndex + 2);
                }
            }
            else {
                if((sIndex != s.length) && (s[sIndex] == p[pIndex] || p[pIndex] == '.'))
                    return fMatch(s,sIndex+1,p,pIndex+1);
            }
        }
        return false;
    }
}
