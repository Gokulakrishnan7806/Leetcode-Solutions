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
    public ListNode reverseKGroup(ListNode head, int k) {

        if(k <= 1 || head == null)
        {
            return head;
        }

        // skip the first left-1 nodes

        ListNode present =head;
        ListNode prev=null;
        ListNode end=head;

         while(true)
        {
        


         ListNode last=prev;
         ListNode newend=present;

          int count = 0;
            while (end != null && count < k) {
                end = end.next;
                count++;
            }
            if (count < k) break;
        
        

          // reverse between l to r
           ListNode next=present.next;
          for (int i = 0; present != null && i < k;i++) 
          {

            present.next=prev;
            prev=present;
            present=next;
            if(next != null){
                next=next.next;
            }
              
          }

          if(last != null){
            last.next=prev;

          }
          else{
            head=prev;
          }
        
          newend.next=present;
          if(present == null){
            break;
          }
          prev=newend;


        }
        return head;
    }
}

        

