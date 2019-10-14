import java.util.Arrays;
public class Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        
        if(array.length==0) return 0;
        else if(array.length == 1) return array[0];
        //排序后A[mid]一定是如果有的话超过数组长度一半的数
        Arrays.sort(array);
        int mid = array.length/2;
        int number = array[mid];
        int sum = 0;
        
        for(int i=mid; i>=0; i--) {
            if(array[i] != number)
                break;
            else {
                sum++;
            }
        }
        if(sum > mid)
            return array[mid];
        
        for(int i=mid+1; i<array.length; i++) {
            if(array[i] != number)
                break;
            else {
                if(sum > mid)
                    return array[mid];
                sum++;
            }
        }
        if(sum > mid)
            return array[mid];
        
        
        
    return 0;     
    }
}
