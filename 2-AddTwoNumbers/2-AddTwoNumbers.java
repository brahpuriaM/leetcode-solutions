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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // String s1 = "", s2 = "";
        // while(l1 != null) {
        //     s1 = l1.val + s1;
        //     l1 = l1.next;
        // }
        // while(l2 != null) {
        //     s2 = l2.val + s2;
        //     l2 = l2.next;
        // }
        // String sum = String.valueOf(Long.valueOf(s1) + Long.valueOf(s2));
        // ListNode node = new ListNode(1);
        // ListNode merge = node;
        // for(int i=sum.length()-1; i>=0; i--) {
        //     merge.next = new ListNode(Integer.valueOf("" + sum.charAt(i)));
        //     merge = merge.next;
        // }
        // return node.next;

        List<Integer> list1 = new LinkedList<>();
        while(l1 != null) {
            list1.add(l1.val);
            l1 = l1.next;
        }
        List<Integer> list2 = new LinkedList<>();
        while(l2 != null) {
            list2.add(l2.val);
            l2 = l2.next;
        }
        ListNode node = new ListNode(1);
        ListNode merge = node;

        int carry = 0;
        for(int i = 0; i<Math.max(list1.size(), list2.size()); i++) {
            int num = -1;
            int sumOfDigits = 0;
            if(i >= list1.size()) {
                sumOfDigits = carry + list2.get(i);
            } else if(i >= list2.size()) {
                sumOfDigits = carry + list1.get(i);
            } else {
                sumOfDigits = carry + list1.get(i) + list2.get(i);
            }
            if(sumOfDigits > 9) {
                carry = 1;
                num = sumOfDigits % 10;
            } else {
                carry = 0;
                num = sumOfDigits;
            }
            merge.next = new ListNode(num);
            merge = merge.next;
        }
        if(carry != 0) {
            merge.next = new ListNode(carry);
            merge = merge.next;
        }
        return node.next;
    }
}