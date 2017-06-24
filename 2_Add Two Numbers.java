/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
         
        int carry = 0;
        int sum =0;
        ListNode nlist , clist , head;
        sum = l1.val + l2.val;
        if(sum >= 10){
            head = clist = new ListNode(sum -10);
            carry = 1;
        }else{
            head = clist = new ListNode(sum);
            carry = 0;
        }
        l1 = l1.next;
        l2 = l2.next;

        while(l1 != null && l2 != null){
            sum = l1.val + l2.val + carry;
            if(sum >= 10)
            {
                nlist = new ListNode(sum - 10);
                carry = 1;
            }else
            {
                nlist = new ListNode(sum);
                carry = 0;
            }
            nlist.next = null;
            clist.next = nlist;
            clist = nlist;
            l1 = l1.next;
            l2 = l2.next;
        }
        
        while(l1 != null){
            if((l1.val + carry) == 10){
                l1.val = 0;
                clist.next = l1;
                clist = clist.next;
                l1 = l1.next;
                carry = 1;
            }else{
                l1.val = l1.val + carry;
                clist.next = l1;
                clist = clist.next;
                l1 = l1.next;
                carry = 0;
            }
        }
        
        while(l2 != null){
            if((l2.val + carry) == 10){
                l2.val = 0;
                clist.next = l2;
                clist = clist.next;
                l2 = l2.next;
                carry = 1;
            }else{
                l2.val = l2.val + carry;
                clist.next = l2;
                clist = clist.next;
                l2 = l2.next;
                carry = 0;
            }
        }
   
        if(carry == 1){
            nlist = new ListNode(1);
            clist.next = nlist;
        }
        return head;
    }
}