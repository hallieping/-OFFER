//输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否可能为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
//序列4,5,3,2,1是该压栈序列对应的一个弹出序列，但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）

//思路： 将原数列依次压栈，栈顶元素与所给出栈队列相比，如果相同则出栈，
//如果不同则继续压栈，直到原数列中所有数字压栈完毕。
//检测栈中是否为空
// 如 4， 5 ， 3 ， 2 ， 1 ： 4和1,2,3不等，1,2,3，入栈后，到4开始出栈，5不等，入

import java.util.ArrayList;
import java.util.Stack;
public class Solution {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> s = new Stack<>();
        int i=0, j=0;
        while(i < pushA.length) {
            s.push(pushA[i]);
            while((!s.isEmpty()) && (s.peek() == popA[j])) {
                s.pop();
                j++;
            }
            i++;
        }
        return s.isEmpty();
    }
}
