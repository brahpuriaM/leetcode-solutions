// Last updated: 04/08/2025, 16:31:40
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) {
            return null;
        }
        PriorityQueue<Integer> q = new PriorityQueue<>();
        for(ListNode node : lists) {
            while(node != null) {
                q.add(node.val);
                node = node.next;
            }
        }
        ListNode ll = new ListNode(1);
        ListNode merge = ll;
        while(!q.isEmpty()) {
            merge.next = new ListNode(q.remove());
            merge = merge.next;
        }
        return ll.next;
    }
}