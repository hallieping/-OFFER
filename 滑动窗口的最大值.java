import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Deque;
public class Solution {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        if(num == null || size == 0 || size > num.length) return res;
        Deque<Integer> queue = new LinkedList<>();
        for(int i=0; i<num.length; i++) {
            if( !queue.isEmpty()) {
                if(i >= queue.peek() + size)
                    queue.pop();
                    // 如果队列首已经不再窗口内，移除
            }
            while(!queue.isEmpty() && num[i] >= num[queue.getLast()]) {
                queue.removeLast();
                // 比队尾大则继续删除队尾
            }
            
            queue.add(i);
            if(i+1 >= size) {
                res.add(num[queue.peek()]);
                //从num[size-1]开始加入最大值（队列首是最大）
            } 
               
        }
        return res;
    }
}    
   

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if( nums == null || nums.length == 0) return new int[]{};
        int[] res  = new int[nums.length - k + 1];
        int index = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for(int i=0; i<nums.length; i++) {
            maxHeap.offer(nums[i]);
            if(maxHeap.size() > k) {
                maxHeap.remove(nums[i-k]);
            }
            if(maxHeap.size() == k) {
                res[index++] = maxHeap.peek();
            }
        }
        return res;
    } 
}
