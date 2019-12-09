public class Solution {
    public ListNode detectCycle(ListNode head) {
        // 从原点到入口，和相遇点到入口距离一样；
        if(head == null||head.next == null || head.next.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        while(fast!= null && fast.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                break;
        }
        if((fast == null) || (fast.next== null)) 
            return null;
        fast = head;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
// 从原点到入口，和相遇点到入口距离一样；
