//如果用1*m的方块覆盖m*n区域，递推关系式为f(n) = f(n-1) + f(n-m)，(n > m)。
//解释：想成长n*m高的区域，和1*m的方块高相同，则往后增加时，第n个相当于由第n-2个增加2个1*m的块，第n-1个增加1个1*m的块

public class Solution {
    public int RectCover(int target) {
        if(target < 3) return target;
        int sum1 = 1, sum2 = 2;
        int sum = 0;
        int i = 3;
        while( i <= target) {
            sum = sum1 + sum2;
            sum1 = sum2;
            sum2 = sum;
            target--;
        }
        return sum;
    }
}
