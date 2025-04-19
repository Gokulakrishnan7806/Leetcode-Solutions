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

      public ListNode middleNode(ListNode head) {


        ListNode slow=head;
        ListNode fast=head;

        while(fast != null && fast.next != null){

            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;

    }

    public ListNode  reverselist(ListNode head){

        ListNode prev=null;
        ListNode present=head;
        ListNode next=null;


        while(present != null){

            next=present.next;
            present.next=prev;
            prev=present;
            present=next;
             if(next != null){
                 next=next.next;
             }
        }
       return  head=prev;
    }




    public void reorderList(ListNode head) {

         

        if(head == null || head.next == null){
            return;
        }
        

        ListNode  mid=middleNode(head);
        ListNode  headsecond=reverselist(mid);
        ListNode headfirst=head;

         // rearange

        while(headfirst != null && headsecond != null){

            ListNode  temp=headfirst.next;
            headfirst.next=headsecond;
            headfirst=temp;
            temp=headsecond.next;
            headsecond.next=headfirst;
            headsecond=temp;
        }

        if(headfirst != null){
            headfirst.next=null;
        }
    }
}