/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        return mergeSort(head);
        
    }
    private ListNode mergeSort(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode slow = head, fast = head.next;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode right = mergeSort(slow.next);
        slow.next = null;
        ListNode left = mergeSort(head);
        return mergeList(left,right);
    }
    private ListNode mergeList(ListNode left, ListNode right) {
        ListNode tmp = new ListNode(-1);
        ListNode p = tmp;
        while(left!=null && right!=null) {
            if(left.val < right.val) {
                p.next = left;
                left = left.next;
            }
            else {
                p.next = right;
                right = right.next;
            }
            p = p.next;
        }
        p.next = left == null ? right:left;
        return tmp.next;
    }
}
