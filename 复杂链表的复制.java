//输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针指向任意一个节点），
//返回结果为复制后复杂链表的head。（注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
//思路： 在每一个节点后面复制一个相同节点，然后把随机值也复制后，跳跃拆分出一条链表
/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/


public class Solution {
    public RandomListNode Clone(RandomListNode pHead)
    {
        //
        if(pHead == null) return null;
        
        ////
        RandomListNode cNode = pHead;
        while(cNode != null) {
            RandomListNode copy = new RandomListNode(cNode.label);
            copy.next = cNode.next;
            cNode.next = copy;
            cNode = copy.next;
        }
        cNode = pHead;
        while(cNode != null) {
            if(cNode.random != null)
                cNode.next.random = cNode.random.next;
            else 
                cNode.next.random = null;
            cNode = cNode.next.next;
        }
        
        //////
        RandomListNode nHead = new RandomListNode(0);
        RandomListNode pp = pHead.next;
        cNode = pHead;
        while(cNode.next != null) {
            nHead = cNode.next;
            cNode.next = nHead.next;
            cNode = nHead;
        }
        return pp;
    }
}
