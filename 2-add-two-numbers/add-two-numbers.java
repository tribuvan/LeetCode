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
        int carry=0;
        ListNode l3 = new ListNode();
        ListNode h = l3;
        int sum=0;

        while(l1!=null || l2!=null){
            sum=carry;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            ListNode newnode = new ListNode(sum%10);
            carry=sum/10;
            h.next=newnode;
            h=h.next;

        }
        if(carry>0){
            h.next= new ListNode(carry);
        }   
        return l3.next;
     
    }
}