

//哈希表
import java.util.HashMap;
public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead1 == null || pHead2 == null) return null;
        ListNode p1 = pHead1;
        ListNode p2 = pHead2;
        HashMap<ListNode,Integer> map = new HashMap<>();
        while(p1 != null) {
            map.put(p1,1);
            p1 = p1.next;
        }
        while(p2 != null) {
            if(map.containsKey(p2))
                return p2;
            p2 = p2.next;
        }
        return null;
    }
}
