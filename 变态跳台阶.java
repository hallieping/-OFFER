//可以跳1层，2层...n层 ，跳到n阶可以有 pow(2,n-1)种方法

public class Solution {
    public int JumpFloorII(int target) {
        int ans = 1;
        if(target == 0) return 0;
        if(target == 1) return 1;
        while (target > 1) {
            ans = ans * 2;
            target--;
        }
        return ans;
    }
}
