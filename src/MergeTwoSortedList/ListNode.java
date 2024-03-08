package MergeTwoSortedList;

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public static void main(String[] args) {
        ListNode node12 = new ListNode(4);
        ListNode node11 = new ListNode(2, node12);
        ListNode head1 = new ListNode(1, node11);
        ListNode node22 = new ListNode(4);
        ListNode node21 = new ListNode(3, node22);
        ListNode head2 = new ListNode(1, node21);
        ListNode merged = mergeTwoLists(head1, head2);
        while (merged != null) {
            System.out.print(merged.val);
            merged = merged.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return new ListNode();
        ListNode result = new ListNode();
//        if (list1.val)
//        while (list1 != null && list2 != null) {
//
//        }
        return result;
    }
}
