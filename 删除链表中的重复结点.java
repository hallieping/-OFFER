/*
 public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
*/
public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null || pHead.next == null) return pHead;
        
        
        ListNode head = new ListNode(0);
        head.next = pHead;
        ListNode pre = head;
        ListNode post = head.next;
        while(post != null) {
            if(post.next != null && post.val == post.next.val) {
                while(post.next!=null && post.val == post.next.val) {
                    post = post.next;
                }
                pre.next = post.next;
                post = post.next;
            }
            else {
                pre = pre.next;
                post = post.next;
            }
        }
        return head.next;
    }

}
