
//注意查溢出
public class Solution {

public int StrToInt(String str)
    {
        if (str.equals("") || str.length() == 0)
            return 0;
        char[] a = str.toCharArray();
        int sign = 0;
        if (a[0] == '-'){
            sign = 1;
        }
        int sum = 0;
        for (int i = sign; i < a.length; i++)
        {
            if (a[i] == '+')
                continue;
            if (a[i] < '0' || a[i] > '9')
                return 0;
            if(sign == 1 && sum * -10  < Integer.MIN_VALUE + a[i]-'0'){
                return 0;
            }
            if(sign == 0 && sum * 10  > Integer.MAX_VALUE-(a[i]-'0')){
                return 0;
            }
            sum = sum * 10 + a[i]-'0';
            
        }
        return sign == 0 ? sum : sum * -1;
    }
}
