//思路，二分查找先找左边界

public class Solution {
    public int GetNumberOfK(int [] array , int k) {
        int l = 0;
        int r = array.length;
        int mid = 0, cnt=0;
        // left bound
        while( l < r) {
            mid = (l+r)/2;
            if(array[mid] < k) {
                l = mid+1;
            }
            else if(array[mid] >= k) {
                r = mid;
            }
        }
        while( l < array.length) {
            if(array[l] == k)
                cnt++;
            l++;
        }
        return cnt;
        
    }
}
