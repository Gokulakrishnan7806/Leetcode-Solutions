/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode  detectCycle(  ListNode  head) {

        int length=0;

        ListNode  slow=head;
        ListNode fast=head;

        while(fast != null && fast.next!= null){

            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow){

                length=LengthCycle(slow);
                break;
            }
        }

        if(length==0){

            return null;
        }

        // find start

        ListNode f=head;
        ListNode s=head;

        while(length > 0){

            s=s.next;
            length--;
        }
        while(f != s){
            
            f=f.next;
            s=s.next;
        }
        return s;


    }

      public int LengthCycle(ListNode  head)
        {

            ListNode  slow=head;
            ListNode fast=head;

            while(fast != null && fast.next!= null){

                fast=fast.next.next;
                slow=slow.next;

                if(fast == slow){

                    ListNode temp=slow;

                    int length=0;

                    do{
                        temp=temp.next;
                        length++;
                    } while(temp != slow);

                    return length;
                }
            }
            return 0;

        }
}