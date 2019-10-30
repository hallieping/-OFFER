

import java.util.ArrayList;
import java.util.Collections;
public class Solution {
    ArrayList<Integer> list = new ArrayList<>();
    public void Insert(Integer num) {
        list.add(num);
    }


    public Double GetMedian() {
        Collections.sort(list);
        int n = list.size();
        if ((n & 1) == 1) {
            return Double.valueOf(list.get(n / 2));
        } else {
            return (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        }
    }
}
/*
链接：https://www.nowcoder.com/questionTerminal/9be0172896bd43948f8a32fb954e1be1
来源：牛客网

    private PriorityQueue<Integer> min = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> max = new PriorityQueue<Integer>(15,new Comparator<Integer>() {
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    private int count = 0;
    public void Insert(Integer num) {
        count++;
        if (count % 2 == 1){
            max.offer(num);//先从大顶堆过滤一遍
            min.offer(max.poll());
        }else {
            min.offer(num);//先从小顶堆过滤一遍
            max.offer(min.poll());
        }
    }
    public Double GetMedian() {
        if (count % 2 == 0)     return (min.peek() + max.peek())/2.0;
        else                    return (double)min.peek();
    }
    */
