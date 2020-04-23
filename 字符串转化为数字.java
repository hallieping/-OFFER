public class Solution {
    public int StrToInt(String str) {
        int n = str.length();
        if(n == 0) return 0;
        boolean negative = false;
        int i = 0;
        if(str.charAt(0) == '-') {
            negative = true;
            i++;
            if(n == 1) return 0;
        }
        else if(str.charAt(0) == '+') {
            if(n == 1) return 0;
            i++;
        }
        int num1 = 0;
        if(str.charAt(i) >= '0' && str.charAt(i) <='9') {
            num1 = str.charAt(i) - '0';
        } else {
            return 0;
        }
        if(i+1 == n) return num1;
        if(n-i > 10) return 0;
        for(int j=i; j<n; j++) {
            if(str.charAt(j) <'0' || str.charAt(j) >'9')
                return 0;
        }
        int num = Integer.valueOf(str.substring(i,n-1));
        int num2 = Integer.valueOf(str.substring(n-1,n));
        if(!negative) {
            if(num > Integer.MAX_VALUE/10) return 0;
            else if(num*10 > Integer.MAX_VALUE - num2) return 0;
            else {
                return num*10 + num2;
            }
        } else {
            if(num > Integer.MAX_VALUE/10) return 0;
            else if(-num*10 < Integer.MIN_VALUE + num2) return 0;
            else {
                return -num*10 - num2;
            }
        }

    }
}
