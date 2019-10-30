public class Solution {

    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        // 从原点到入口，和相遇点到入口距离一样；
        if(pHead == null||pHead.next == null) return null;
        ListNode fast = pHead;
        ListNode slow = pHead;
        while(fast.next.next!= null && slow.next!= null) {
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)
                break;
        }
        if((fast.next.next == null) || (slow.next== null)) 
            return null;
        fast = pHead;
        while(fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }
}
