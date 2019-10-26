// 1-13各4张，4张大小王(0)可当癞子， 要求最后5张顺子

// 思路 ： max - min < 5, 除了0不可重复， 长度为5

public class Solution {
    public boolean isContinuous(int [] numbers) {
        if(numbers.length != 5) 
            return false;
        int[] cnt = new int[14];
        int max = -1;
        int min = 14;
        for(int x:numbers) {
            if(x == 0) continue;
            if(x > max) max = x;
            if(x < min) min = x;
            cnt[x]++;
            if(cnt[x] > 1) 
                return false;
        }
        return max-min < 5;
    }
}
