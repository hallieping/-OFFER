//给你一根长度为n的绳子，请把绳子剪成m段（m、n都是整数，n>1并且m>1），每段绳子的长度记为k[0],k[1],...,k[m]。请问k[0]xk[1]x...xk[m]可能的最大乘积是多少？
//例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
// 1: 动态规划
public class Solution {
    public int cutRope(int target) {
        if(target < 4) {
            return target-1;
        }
        int[] dp = new int[target+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        int res = 0;
        for(int i = 4; i <= target; i++) {
            for(int j = 1; j<= target/2; j++) {
                dp[i] = dp[j]*dp[i-j] > dp[i]?dp[j]*dp[i-j] : dp[i];
            }
        }
        return dp[target];
    }
}

//2:  找规律 分出3越多，值越大
        if(number==2)
            return 1;
        if(number==3)
            return 2;
        if(number==4)
            return 4;
        else
            return pow(3,number/3)*(number%3);
