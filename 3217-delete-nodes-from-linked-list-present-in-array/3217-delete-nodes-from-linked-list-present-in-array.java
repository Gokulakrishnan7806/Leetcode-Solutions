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
import java.util.HashSet;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Step 1: Add all nums to a HashSet for O(1) lookup
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Use dummy node to handle head deletion cleanly
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Step 3: Traverse and delete nodes
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (set.contains(curr.val)) {
                // Skip this node
                prev.next = curr.next;
            } else {
                prev = curr;  // move prev only if current node not deleted
            }
            curr = curr.next;
        }

        // Step 4: Return new head
        return dummy.next;
    }
}
