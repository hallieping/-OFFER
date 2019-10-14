import java.util.Stack;

public class Solution {

    Stack<Integer> s = new Stack<>();
    public void push(int node) {
        if(s.isEmpty()) {
            s.push(node);
            s.push(node);
        }
        else {
            int m = s.peek();
            s.push(node);
            if(m < node) {
                s.push(m);
            }
            else s.push(node);
        }
        
    }
    
    public void pop() {
        s.pop();
        s.pop();
    }
    
    public int top() {
        int m = s.pop();
        int value = s.peek();
        s.push(m);
        return value;
    }
    
    public int min() {
        return s.peek();
    }
}
