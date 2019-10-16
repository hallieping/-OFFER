public class Solution {
    public int FindGreatestSumOfSubArray(int[] array) {
        int res = array[0];
        int sum = 0;
        for(int num : array) {
            if(sum > 0)
                sum += num;
            else {
                sum = num;
            }
            res = res > sum? res:sum;
        }
        return res;
    }
}
