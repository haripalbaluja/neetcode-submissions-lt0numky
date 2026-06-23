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
        ListNode temp = head;
        ListNode groupNextNode = null;
        ListNode prevNode = null;

        while(temp != null) {
            ListNode kthNode = findKthNode(temp, k);

            if(kthNode == null) {
                if(prevNode != null) {
                    prevNode.next = temp;
                    break;
                }
            }
            groupNextNode = kthNode.next;
            kthNode.next = null;
            reverse(temp);

            if(temp == head) {
                head = kthNode;
            } else {
                prevNode.next = kthNode;
            }
            prevNode = temp;
            temp = groupNextNode;
        }
        return head;
    }

    public ListNode reverse(ListNode head) {
        ListNode temp = head;
        ListNode prev = null;

        while(temp != null) {
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }

    public ListNode findKthNode(ListNode temp, int k) {
        k--;
        while(temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
        return temp;
    }
}
