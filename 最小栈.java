//用链表实现，Next存的是上一个数
class MinStack {
    private Node head;
    /** initialize your data structure here. */
    public MinStack() {
        head = null;
    }
    
    public void push(int x) {
        if(head == null)
            head = new Node(x,x,null);
        else {
            head = new Node(x,Math.min(x,head.min), head);
        }
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
    private class Node {
        int val;
        int min;
        Node next;
        private Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }
}


///用两个栈实现
public MinStack() {
    stack = new Stack<Integer>();
}

public void push(int x) {
    if(stack.isEmpty()){  ///注意注意注意！不知道为什么。但一定要这样最开始入两个
        stack.push(x);
        stack.push(x);
    }else{
        int tmp = stack.peek();
        stack.push(x);
        if(tmp<x){
            stack.push(tmp);
        }else{
            stack.push(x);
        }
    }
}

public void pop() {
    stack.pop();
    stack.pop();
}

public int top() {
    return stack.get(stack.size()-2);
}

public int getMin() {
    return stack.peek();
}

// O（1）
public class 设计一个有gitMin的栈 {

    private Stack<Integer> stack = new Stack<Integer>();
    private int min;

    public void push(int x) {
        if (stack.isEmpty()) {
            min = x;
            stack.push(0);
        } else {
            // 计算差值
            int compare = x - min;
            stack.push(compare);
            // 如果差值小于0，显然 x 成为最小值，否则最小值不变
            min = compare < 0 ? x : min;
        }
    }

    public void pop() {
        int top = stack.peek();
        // 如果top小于0，显然最小值也一并会被删除，此时更新最小值
        min = top < 0 ? (min - top) : min;
        stack.pop();
    }

    public int getMin() {
        return min;
    }
 }
